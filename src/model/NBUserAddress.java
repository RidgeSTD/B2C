package model;
import model.*;
public class NBUserAddress {
	private int userAddressID;
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
	private int  userID;
	private	String receiverName;
	private String address;
	private String postCode;
	private String telephone;
	private String mobilePhone;
	private int isActive;
	/**
	 * @return the receiverName
	 */
	public String getReceiverName() {
		return receiverName;
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
	 * @param receiverName the receiverName to set
	 */
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the mobilePhone
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * @param mobilePhone the mobilePhone to set
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * @return the isActive
	 */
	public int getIsActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public NBUserAddress(int userID, String receiverName, String address,
			String postCode, String telephone, String mobilePhone, int isActive) {
		super();
		this.userID = userID;
		this.receiverName = receiverName;
		this.address = address;
		this.postCode = postCode;
		this.telephone = telephone;
		this.mobilePhone = mobilePhone;
		this.isActive = isActive;
	}
	
}
