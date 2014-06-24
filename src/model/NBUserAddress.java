package model;
import model.*;
public class NBUserAddress {
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
	protected String getReceiverName() {
		return receiverName;
	}
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
	 * @param receiverName the receiverName to set
	 */
	protected void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	/**
	 * @return the address
	 */
	protected String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	protected void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the postCode
	 */
	protected String getPostCode() {
		return postCode;
	}
	/**
	 * @param postCode the postCode to set
	 */
	protected void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * @return the telephone
	 */
	protected String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	protected void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the mobilePhone
	 */
	protected String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * @param mobilePhone the mobilePhone to set
	 */
	protected void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * @return the isActive
	 */
	protected int getIsActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	protected void setIsActive(int isActive) {
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
