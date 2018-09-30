package com.dpconde.userlist.di.component;

import com.dpconde.userlist.UserListApplication;
import com.dpconde.userlist.di.module.AppModule;

import dagger.Component;

/**
 * Created by dpconde on 29/9/18.
 */

@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(UserListApplication categoryApplication);
}
