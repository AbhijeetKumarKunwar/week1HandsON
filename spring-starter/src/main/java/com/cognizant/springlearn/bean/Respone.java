package com.cognizant.springlearn.bean;

public class Respone {

	private String id;
	public Respone(String id, boolean status) {
		super();
		this.id = id;
		this.status = status;
	}
	private boolean status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Respone [id=" + id + ", status=" + status + "]";
	}
}
