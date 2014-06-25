package model;

import java.util.Date;

public class NBOrder {
	public NBOrder(){}
	private int orderID;
	private int userID;
//	private NBUser user;
	private Date orderDate;
	private int state;
	private int scoreGet;
	/**
	 * @return the userID
	 */
	protected int getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	protected void setUserID(int userID) {
		this.userID = userID;
	}
	/**
	 * @return the userAddressID
	 */
	protected int getUserAddressID() {
		return userAddressID;
	}
	/**
	 * @param userAddressID the userAddressID to set
	 */
	protected void setUserAddressID(int userAddressID) {
		this.userAddressID = userAddressID;
	}
	/**
	 * @return the orderID
	 */
	protected int getOrderID() {
		return orderID;
	}
	private int userAddressID;
public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getScoreGet() {
		return scoreGet;
	}
	public void setScoreGet(int scoreGet) {
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
