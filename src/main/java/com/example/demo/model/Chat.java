package com.example.demo.model;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Chat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String chatName;
	private String chatImg;
	private boolean isGroup;
	
	@ManyToMany
	private Set<User> admins= new HashSet<>();
	
	@ManyToOne            // only one user can create chat
	private User createdBy;
	
	@ManyToMany
	private Set<User> users= new HashSet<>();
	
	@OneToMany             // only one message can reply to one chat message 
	private List<Message> messages = new ArrayList<>();
	public Chat() {
		
	}
	
	public Chat(Integer id, String chatName, String chatImg, boolean isGroup, Set<User> admins, User createdBy,
			Set<User> users, List<Message> messages) {
		super();
		this.id = id;
		this.chatName = chatName;
		this.chatImg = chatImg;
		this.isGroup = isGroup;
		this.admins = admins;
		this.createdBy = createdBy;
		this.users = users;
		this.messages = messages;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChatName() {
		return chatName;
	}

	public void setChatName(String chatName) {
		this.chatName = chatName;
	}

	public String getChatImg() {
		return chatImg;
	}

	public void setChatImg(String chatImg) {
		this.chatImg = chatImg;
	}

	public boolean isGroup() {
		return isGroup;
	}

	public void setGroup(boolean isGroup) {
		this.isGroup = isGroup;
	}

	public Set<User> getAdmins() {
		return admins;
	}

	public void setAdmins(Set<User> admins) {
		this.admins = admins;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	
	
	
}
