package com.concretepage;

import java.util.List;

public class Person {
	private int id;
	private String location;
	private String name;
	
	private List<String> siblings;
	private Address adress;
	public List<String> getSiblings() {
		return siblings;
	}

	public void setSiblings(List<String> siblings) {
		this.siblings = siblings;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
