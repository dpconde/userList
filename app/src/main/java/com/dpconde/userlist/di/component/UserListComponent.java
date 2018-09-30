package com.dpconde.userlist.di.component;

import com.dpconde.userlist.di.module.UserListModule;
import com.dpconde.userlist.mvp.view.activity.UserListActivity;
import com.dpconde.userlist.di.module.UsersModule;
import com.dpconde.userlist.mvp.view.presenter.UserListPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by dpconde on 28/9/18.
 */

@Singleton
@Component(modules = {UsersModule.class, UserListModule.class}, dependencies = {AppComponent.class})
public interface UserListComponent {

    void inject(UserListActivity userListActivity);
    UserListPresenter getMainPresenter();
}
