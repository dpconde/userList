package com.dpconde.userlist.di.module;


import android.content.Context;

import com.dpconde.userlist.mvp.data.model.DaoMaster;
import com.dpconde.userlist.mvp.data.model.DaoSession;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dpconde on 29/9/18.
 */

@Module(includes = ContextModule.class)
public class GreenDAOModule {

    @Provides
    @Singleton
    public DaoSession providesGreenDAO(Context context){
        return new DaoMaster(
                new DaoMaster.DevOpenHelper(context, "greendao_demo.db").getWritableDb()).newSession();
    }
}
