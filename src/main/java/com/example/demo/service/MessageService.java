package com.example.demo.service;


import java.util.List;

import com.example.demo.exception.ChatException;
import com.example.demo.exception.MessageException;
import com.example.demo.exception.UserException;
import com.example.demo.model.Message;
import com.example.demo.model.User;
import com.example.demo.request.SendMessageReq;



public interface MessageService {

	public Message sentMessage(SendMessageReq req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId, User reqUser) throws ChatException, UserException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public void deleteMessage(Integer messageId, User reqUser)throws MessageException, UserException;
	
}
