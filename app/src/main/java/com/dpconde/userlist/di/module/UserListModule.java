package com.dpconde.userlist.di.module;

import android.content.Context;

import com.dpconde.userlist.mvp.data.api.UserDataManager;
import com.dpconde.userlist.mvp.view.presenter.UserListPresenter;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dpconde on 29/9/18.
 */

@Module(includes = {UsersModule.class, ContextModule.class})
public class UserListModule {

    private UserListPresenter.View view;

    public UserListModule(UserListPresenter.View view) {
        this.view = view;
    }

    @Provides
    public UserListPresenter.View provideView() {
        return view;
    }

    @Provides
    public UserListPresenter providePresenter(UserListPresenter.View categoryView,
                                              @Named("local") UserDataManager userDataManager,
                                              Context context) {
        return new UserListPresenter(categoryView, userDataManager, context);
    }

}
