package com.dpconde.userlist.mvp.data.api.retrofit;

import com.dpconde.userlist.mvp.data.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dpconde on 28/9/18.
 */

public interface UsersApi {

    @GET("api/")
    Call<ApiResponse> getUsers(@Query("results")int results, @Query("seed")String seed);

}
