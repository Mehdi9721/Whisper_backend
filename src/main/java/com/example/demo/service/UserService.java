package com.example.demo.service;



import java.util.List;

import com.example.demo.exception.UserException;
import com.example.demo.model.User;
import com.example.demo.request.UpdateUserReq;



public interface UserService {

	public User finyById(Integer id) throws UserException;
	public User findUserByProfile(String jwt) throws UserException;
	public User updateUser(Integer id, UpdateUserReq req) throws UserException;
	public List<User> searchUser(String query);
	public List<User> searchByUserName(String name);
	
}
