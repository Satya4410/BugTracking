package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Component
@Entity
public class User 
{
	@Id
	private int userid;
	private String username;

	private String passwrd;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswrd() {
		return passwrd;
	}

	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", passwrd=" + passwrd + "]";
	}
	
	
	
	
}