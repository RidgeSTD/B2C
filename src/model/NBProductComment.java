package model;
import model.*;
public class NBProductComment {
	private NBUser user;
	private NBProduct product;
	private int level;
	private String title;
	private String content;
	/**
	 * @return the user
	 */
	protected NBUser getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	protected void setUser(NBUser user) {
		this.user = user;
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
	public NBProductComment(NBUser user, NBProduct product, int level,
			String title, String content) {
		super();
		this.user = user;
		this.product = product;
		this.level = level;
		this.title = title;
		this.content = content;
	}
	
}
