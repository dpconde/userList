package com.dpconde.userlist.mvp.data.api;

import com.dpconde.userlist.mvp.data.model.User;

import java.util.List;

/**
 * Created by dpconde on 28/9/18.
 */

public interface UserDataManager {

    /**
     * Delete user
     * @param userId
     * @return sucess
     */
    boolean deleteUser(String userId);


    /**
     * Get all users
     * @param callback
     */
    void getAllUsers(Callback callback);


    /**
     * Get paginated user results
     * @param pageNumber
     * @param resultsPerPage
     * @return paginated users
     */
    List<User> getPaginatedUsers(int pageNumber, int resultsPerPage);


    /**
     * Get user by ID
     * @param userId
     * @return the retrieved user
     */
    User getUserById(Long userId);


    /**
     * Create a new user
     * @param user
     * @return the user created with the persisted details
     */
    User createUser(User user);


    /**
     * Create a list of users
     * @param userList
     * @return the list of user created with the persisted details
     */
    List<User> createUsers(List<User> userList);


    /**
     * Get total number of users
     * @return results count
     */
    int countTotalResults();


    /**
     * Delete all users
     */
    void deleteAllUsers();


    /**
     * Load paginated data and use callback to manage the results
     * @param callback
     * @param pageNumber
     * @param resultsPerPage
     */
    void loadData(Callback callback, int pageNumber, int resultsPerPage);
}
