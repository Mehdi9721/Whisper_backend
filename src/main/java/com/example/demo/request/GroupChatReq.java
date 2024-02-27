package com.example.demo.request;



import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupChatReq {

	private List<Integer> userIds;
	private String chatName;
	private String chatImage;
	
	public GroupChatReq(List<Integer> userIds, String chatName, String chatImage) {
		super();
		this.userIds = userIds;
		this.chatName = chatName;
		this.chatImage = chatImage;
	}
	public List<Integer> getUserIds() {
		return userIds;
	}
	public void setUserIds(List<Integer> userIds) {
		this.userIds = userIds;
	}
	public String getChatName() {
		return chatName;
	}
	public void setChatName(String chatName) {
		this.chatName = chatName;
	}
	public String getChatImage() {
		return chatImage;
	}
	public void setChatImage(String chatImage) {
		this.chatImage = chatImage;
	}
	
	
}
