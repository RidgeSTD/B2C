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
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
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
