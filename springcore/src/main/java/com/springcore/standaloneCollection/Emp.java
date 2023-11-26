package com.springcore.standaloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Emp [friends=" + friends + "]";
	}
	
	
	
}
