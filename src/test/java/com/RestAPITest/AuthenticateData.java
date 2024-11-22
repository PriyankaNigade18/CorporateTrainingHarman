package com.RestAPITest;

public class AuthenticateData
{
	String username;
	String password;
	
	public AuthenticateData(String un,String psw)
	{
		this.username=un;
		this.password=psw;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
