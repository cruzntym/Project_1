package com.revature.services;

import java.util.Optional;
import com.revature.models.User;
import com.revature.repositories.UserDAO;

/**
 * The UserService should handle the processing and retrieval of Users for the ERS application.
 *
 * {@code getByUsername} is the only method required;
 * however, additional methods can be added.
 *
 * Examples:
 * <ul>
 *     <li>Create User</li>
 *     <li>Update User Information</li>
 *     <li>Get Users by ID</li>
 *     <li>Get Users by Email</li>
 *     <li>Get All Users</li>
 * </ul>
 */
public class UserService {

	UserDAO newAdd = new UserDAO();

	/**
	 *     Should retrieve a User with the corresponding username or an empty optional if there is no match.
     */
	public Optional<User> getByUsername(String username) {
		return Optional.empty();
	}
	
	public void getUserRegistration(User newUser) {
		newAdd.getNewUsers();		
	}
	
	public void registerNewUsers(User newUser, int useroleid, String  role) {
		newAdd.registerNewUsers(newUser, useroleid, role);
	}
	
	public void AuthenticateUser(String name, String password) {
		newAdd.authuenticateUser(name, password);
	}


	public void searchUserByNames(String name) {
		newAdd.searchUserByName(name);
	}
	
	public void searchUserByNamePassword( String name, String password ) {
		newAdd.searchUserByNamePassword(name, password);
	}
	
	public void searchUserByPassword(String password) {
		newAdd.searchUserByPassword(password);
	}

	public int maximumUserId() {
		return newAdd.maximumUserId();
	}

	public int CheckUserRole(String name,  String password) {
		return newAdd.CheckUserRole(name, password);
	}


	   public int getUserRole(String username, String password) {
	      return newAdd.getUserRole(username, password);
	   }

	   
	  
  }


