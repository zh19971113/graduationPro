package com.gp.model.pojo;

public class Department {
	private int id;
	private String name;
	private String address;
	private String tel;
	
	public Department() {}
	public Department(int id, String name, String address, String tel) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeaddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
