package model;

public class NBOrderInfo {
	public NBOrderInfo(){}
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
	public int getOrderID() {
		return orderID;
	}
	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	/**
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NBOrderInfo [orderID=" + orderID + ", productID=" + productID
				+ ", number=" + number + "]";
	}
	
	
}
