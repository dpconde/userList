package com.dpconde.userlist.di.component;

import com.dpconde.userlist.di.module.UserDetailModule;
import com.dpconde.userlist.mvp.view.activity.UserDetailActivity;
import com.dpconde.userlist.di.module.UsersModule;
import com.dpconde.userlist.mvp.view.presenter.UserDetailPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by dpconde on 28/9/18.
 */

@Singleton
@Component(modules = {UsersModule.class, UserDetailModule.class}, dependencies = {AppComponent.class})
public interface UserDetailComponent {

    void inject(UserDetailActivity userDetailActivity);
    UserDetailPresenter getDetailPresenter();
}
