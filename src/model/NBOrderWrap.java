package model;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import Database.DB;
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
		DB db=DB.getInstance();
		this.order=db.getNBOrder(orderID);
		this.orderInfo=db.getNBOrderInfosByNBOrderID(orderID);
		this.user=db.getNBUserByID(order.getUserID());
		this.address=db.getNBUserAddressByID(order.getUserAddressID());
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/**
	 * 提供了方便的创建order的方法，只要通过public的 正常构造方法传入order，orderinfo的list，user，address
	 * 就可以在不需要计算ID的情况下插入数据库相应信息。
	 * 具体来说，就是order的id随便写，orderInfo的fatherid随便写
	 * @author 赵国铨
	 * 2014年6月26日
	 * @return 封装好的father，id都设置完成的NBOrderWrap对象
	 */
	public NBOrderWrap save(){
		DB db=DB.getInstance();
		
		order=db.insertNBOrder(order);
		for(NBOrderInfo info:orderInfo){
			info.setOrderID(order.getOrderID());
			db.insertNBOrderInfo(info);
		}
		
		
		
		return null;
	}
	@Override
	public String toString() {
		return "NBOrderWrap [order=" + order + ", orderInfo=" + orderInfo
				+ ", user=" + user + ", address=" + address + "]";
	}
	
}
