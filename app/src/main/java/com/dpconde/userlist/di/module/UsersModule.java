package com.dpconde.userlist.di.module;

import com.dpconde.userlist.mvp.data.api.UserDataManager;
import com.dpconde.userlist.mvp.data.api.greendao.UserDataManagerGreenDAO;
import com.dpconde.userlist.mvp.data.api.retrofit.UserDataManagerRetrofit;
import com.dpconde.userlist.mvp.data.api.retrofit.UsersApi;
import com.dpconde.userlist.mvp.data.model.DaoSession;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/**
 * Created by dpconde on 28/9/18.
 */

@Module(includes = {RetrofitModule.class, GreenDAOModule.class})
public class UsersModule {


    @Provides
    @Named("local")
    @Singleton
    UserDataManager provideUserDataManagerLocal(@Named("online") UserDataManager userDataManager, DaoSession daoSession){
        return new UserDataManagerGreenDAO(userDataManager, daoSession);
    }


    @Provides
    @Named("online")
    @Singleton
    UserDataManager provideUserDataManagerOnline(UsersApi usersApi){
        return new UserDataManagerRetrofit(usersApi);
    }

}
