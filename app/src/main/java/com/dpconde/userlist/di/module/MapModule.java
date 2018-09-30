package com.dpconde.userlist.di.module;

import android.content.Context;
import android.location.Geocoder;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dpconde on 30/9/18.
 */

@Module(includes = ContextModule.class)
public class MapModule {

    @Provides
    public Geocoder geocoder(Context context){
        return new Geocoder(context);
    }
}
