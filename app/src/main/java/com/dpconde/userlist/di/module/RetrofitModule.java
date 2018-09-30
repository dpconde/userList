package com.dpconde.userlist.di.module;

import dagger.Module;
import dagger.Provides;

import com.dpconde.userlist.mvp.data.api.retrofit.UsersApi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dpconde on 28/9/18.
 */

@Module
public class RetrofitModule {

    @Provides
    public UsersApi randomUsersApi(Retrofit retrofit){
        return retrofit.create(UsersApi.class);
    }


    @Provides
    public Retrofit retrofit(GsonConverterFactory gsonConverterFactory){
        return new Retrofit.Builder()
                .baseUrl("https://randomuser.me/")
                .addConverterFactory(gsonConverterFactory)
                .build();
    }


    @Provides
    public Gson gson(){
        GsonBuilder gsonBuilder  = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .setLenient();

        return gsonBuilder.create();
    }


    @Provides
    public GsonConverterFactory gsonConverterFactory(Gson gson){
        return GsonConverterFactory.create(gson);
    }
}
