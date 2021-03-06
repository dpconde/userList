package com.dpconde.userlist.mvp.data.api.retrofit;

import android.util.Log;

import com.dpconde.userlist.mvp.data.api.Callback;
import com.dpconde.userlist.mvp.data.api.UserDataManager;
import com.dpconde.userlist.mvp.data.model.User;
import com.dpconde.userlist.mvp.data.model.ApiResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by dpconde on 28/9/18.
 */

public class UserDataManagerRetrofit implements UserDataManager{

    private UsersApi usersApi;

    private final int NUM_RESULTS = 100;
    private final String SEED = "xmoba";

    public UserDataManagerRetrofit(UsersApi usersApi) {
        this.usersApi = usersApi;
    }

    @Override
    public boolean deleteUser(String userId) {
        //TODO
        return false;
    }

    @Override
    public void getAllUsers(final Callback callback) {

        usersApi.getUsers(NUM_RESULTS, SEED).enqueue(new retrofit2.Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                List<User> userList = response.body().getResults();
                if(callback!=null){
                    callback.onRetrievedUsers(userList);
                }
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e("RETROFIT", t.toString());
            }
        });
    }



    @Override
    public List<User> getPaginatedUsers(int pageNumber, int resultsPerPage) {
        //TODO
        return null;
    }

    @Override
    public User getUserById(Long userId) {
        //TODO
        return null;
    }

    @Override
    public User createUser(User user) {
        //TODO
        return null;
    }

    @Override
    public List<User> createUsers(List<User> userList) {
        //TODO
        return null;
    }

    @Override
    public int countTotalResults() {
        //TODO
        return 0;
    }

    @Override
    public void deleteAllUsers() {
        //TODO
    }

    @Override
    public void loadData(Callback callback, int pageNumber, int resultsPerPage) {
        //TODO
    }

}
