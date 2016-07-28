package com.lib.entity;

/**
 * 用户信息
 * 
 * @author Yu Yufeng
 *
 */
public class UserInfo {
	private Long userId;
	private String userName;
	private String userPassword;
	private Boolean userType;
	private String userEmail;
	private String userPhoto;

	public UserInfo() {
		super();
	}

	public UserInfo(Long userId, String userName, String userPassword, Boolean userType, String userEmail,
			String userPhoto) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType = userType;
		this.userEmail = userEmail;
		this.userPhoto = userPhoto;
	}

	public Long getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public Boolean getUserType() {
		return userType;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userType=" + userType + ", userEmail=" + userEmail + ", userPhoto=" + userPhoto + "]";
	}

}