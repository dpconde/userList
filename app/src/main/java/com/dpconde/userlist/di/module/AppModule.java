package com.dpconde.userlist.di.module;

import android.app.Application;

import com.dpconde.userlist.UserListApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dpconde on 29/9/18.
 */

@Module
public class AppModule {

    private UserListApplication userListApplication;

    public AppModule(UserListApplication userListApplication) {
        this.userListApplication = userListApplication;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return userListApplication;
    }
}