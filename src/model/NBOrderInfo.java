package model;

public class NBOrderInfo {
	private int orderID;
	private int productID ;
	private int number;
	public NBOrderInfo(int order, int product, int number) {
		super();
		this.orderID = order;
		this.productID = product;
		this.number = number;
	}
	/**
	 * @return the orderID
	 */
	protected int getOrderID() {
		return orderID;
	}
	/**
	 * @param orderID the orderID to set
	 */
	protected void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	/**
	 * @return the productID
	 */
	protected int getProductID() {
		return productID;
	}
	/**
	 * @param productID the productID to set
	 */
	protected void setProductID(int productID) {
		this.productID = productID;
	}
	/**
	 * @return the number
	 */
	protected int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	protected void setNumber(int number) {
		this.number = number;
	}
	
	
}
