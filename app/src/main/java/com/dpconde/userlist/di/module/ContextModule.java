package com.dpconde.userlist.di.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dpconde on 28/9/18.
 */

@Module
public class ContextModule {

    Context context;

    public ContextModule(Context context){
        this.context = context;
    }

    @Provides
    public Context context(){
        return context.getApplicationContext();
    }
}