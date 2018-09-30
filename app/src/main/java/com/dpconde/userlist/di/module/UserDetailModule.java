package com.dpconde.userlist.di.module;

import android.content.Context;
import android.location.Geocoder;

import com.dpconde.userlist.mvp.data.api.UserDataManager;
import com.dpconde.userlist.mvp.view.presenter.UserDetailPresenter;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dpconde on 29/9/18.
 */

@Module(includes = {UsersModule.class, MapModule.class, ContextModule.class})
public class UserDetailModule {

    private UserDetailPresenter.View view;

    public UserDetailModule(UserDetailPresenter.View view) {
        this.view = view;
    }

    @Provides
    public UserDetailPresenter.View provideView() {
        return view;
    }

    @Provides
    public UserDetailPresenter providePresenter(UserDetailPresenter.View categoryView,
                                                @Named("local") UserDataManager userDataManager,
                                                Geocoder geocoder,
                                                Context context) {
        return new UserDetailPresenter(categoryView, userDataManager, geocoder, context);
    }

}
