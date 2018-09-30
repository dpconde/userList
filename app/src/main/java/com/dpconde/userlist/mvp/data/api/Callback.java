package com.dpconde.userlist.mvp.data.api;

import com.dpconde.userlist.mvp.data.model.User;

import java.util.List;

/**
 * Created by dpconde on 29/9/18.
 */

public interface Callback {

    /**
     * Method to manage retrieved users
     * @param userList
     */
    void onRetrievedUsers(List<User> userList);
}
