package model;

public class NBOrderInfo {
	private NBOrder order;
	private NBProduct product ;
	private int number;
	/**
	 * @return the order
	 */
	protected NBOrder getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	protected void setOrder(NBOrder order) {
		this.order = order;
	}
	/**
	 * @return the product
	 */
	protected NBProduct getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	protected void setProduct(NBProduct product) {
		this.product = product;
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
	public NBOrderInfo(NBOrder order, NBProduct product, int number) {
		super();
		this.order = order;
		this.product = product;
		this.number = number;
	}
	
	
}
