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
	private double price;
	private int userAddressID;
	public NBOrder(int orderID, int userID, Date orderDate, int state,
			int scoreGet,  int userAddressID,double price) {
		super();
		this.orderID = orderID;
		this.userID = userID;
		this.orderDate = orderDate;
		this.state = state;
		this.scoreGet = scoreGet;
		
		this.userAddressID = userAddressID;
		this.price = price;
		//TODO set price!!!
		
	}
//	private int userAddressID;
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
	/**
	 * @return the userAddressID
	 */
	public  int getUserAddressID() {
		return userAddressID;
	}
	/**
	 * @param userAddressID the userAddressID to set
	 */
	public  void setUserAddressID(int userAddressID) {
		this.userAddressID = userAddressID;
	}
	/**
	 * @return the orderID
	 */
	public  int getOrderID() {
		return orderID;
	}
	
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NBOrder [orderID=" + orderID + ", userID=" + userID
				+ ", orderDate=" + orderDate + ", state=" + state
				+ ", scoreGet=" + scoreGet + ", price=" + price
				+ ", userAddressID=" + userAddressID + "]";
	}
	
	
	
}
