package model;

import java.util.Date;

public class NBOrder {
	private int orderID;
	private int userID;
//	private NBUser user;
	private Date orderDate;
	private int state;
	private int scoreGet;
	private int userAddressID;
protected void setOrderID(int orderID) {
		this.orderID = orderID;
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
	public NBOrder(int orderID, int userID, Date orderDate, int state,
			int scoreGet, int userAddressID) {
		super();
		this.orderID = orderID;
		this.userID = userID;
		this.orderDate = orderDate;
		this.state = state;
		this.scoreGet = scoreGet;
		this.userAddressID = userAddressID;
	}
	
	
	
}
