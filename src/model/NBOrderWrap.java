package model;

import java.util.ArrayList;
/**
 * 鉴于文澜提的查询太麻烦问题，这里提出了新的解决方案，Ordre，orderInfo，user，userAddress全部在这里封装。
 * 只需要提供orderID即可完成工作。
 * @author 赵国铨
 *
 */
public class NBOrderWrap {
	private NBOrder order;
	private ArrayList<NBOrderInfo> orderInfo;
	private NBUser user;
	private NBUserAddress address;
	/**
	 * @return the order
	 */
	public NBOrder getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(NBOrder order) {
		this.order = order;
	}
	/**
	 * @return the orderInfo
	 */
	public ArrayList<NBOrderInfo> getOrderInfo() {
		return orderInfo;
	}
	/**
	 * @param orderInfo the orderInfo to set
	 */
	public void setOrderInfo(ArrayList<NBOrderInfo> orderInfo) {
		this.orderInfo = orderInfo;
	}
	/**
	 * @return the user
	 */
	public NBUser getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(NBUser user) {
		this.user = user;
	}
	/**
	 * @return the address
	 */
	public NBUserAddress getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(NBUserAddress address) {
		this.address = address;
	}
	public NBOrderWrap(NBOrder order, ArrayList<NBOrderInfo> orderInfo,
			NBUser user, NBUserAddress address) {
		super();
		this.order = order;
		this.orderInfo = orderInfo;
		this.user = user;
		this.address = address;
	}
	/**
	 * 只需要提供一个NBOrder的ID即可得到所有信息
	 * @param orderID
	 */
	public NBOrderWrap(int orderID){
		
	}
	
}
