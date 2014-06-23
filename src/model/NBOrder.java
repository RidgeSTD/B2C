package model;

import java.util.Date;

public class NBOrder {
	private int orderID;
	private NBUser user;
	private Date orderDate;
	private int state;
	private int scoreGet;
	private NBUserAddress userAddress;
	protected int getOrderID() {
		return orderID;
	}
	protected void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	protected NBUser getUser() {
		return user;
	}
	protected void setUser(NBUser user) {
		this.user = user;
	}
	protected Date getOrderDate() {
		return orderDate;
	}
	protected void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	protected int getState() {
		return state;
	}
	protected void setState(int state) {
		this.state = state;
	}
	protected int getScoreGet() {
		return scoreGet;
	}
	protected void setScoreGet(int scoreGet) {
		this.scoreGet = scoreGet;
	}
	protected NBUserAddress getUserAddress() {
		return userAddress;
	}
	protected void setUserAddress(NBUserAddress userAddress) {
		this.userAddress = userAddress;
	}
	public NBOrder(int orderID, NBUser user, Date orderDate, int state,
			int scoreGet, NBUserAddress userAddress) {
		super();
		this.orderID = orderID;
		this.user = user;
		this.orderDate = orderDate;
		this.state = state;
		this.scoreGet = scoreGet;
		this.userAddress = userAddress;
	}
	
	
	
}
