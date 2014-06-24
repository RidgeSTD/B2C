package model;
import model.*;
public class NBProductComment {
	private int userID;
	private int productID;
	private int level;
	private String title;
	private String content;
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
	 * @return the level
	 */
	protected int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	protected void setLevel(int level) {
		this.level = level;
	}
	/**
	 * @return the title
	 */
	protected String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	protected void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	protected String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	protected void setContent(String content) {
		this.content = content;
	}
	public NBProductComment(int userID, int productID, int level, String title,
			String content) {
		super();
		this.userID = userID;
		this.productID = productID;
		this.level = level;
		this.title = title;
		this.content = content;
	}
	
}
