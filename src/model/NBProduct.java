package model;
import model.*;
public class NBProduct {
	private int categoryID;
	private int id;
	private String name;
	private String descrition;
	private String imagePath;
	private double discount;
	private int numberLeft;
	
	/**
	 * @return the categoryID
	 */
	protected int getCategoryID() {
		return categoryID;
	}
	/**
	 * @param categoryID the categoryID to set
	 */
	protected void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	/**
	 * @return the id
	 */
	protected int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	protected void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	protected String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	protected void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the descrition
	 */
	protected String getDescrition() {
		return descrition;
	}
	/**
	 * @param descrition the descrition to set
	 */
	protected void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	/**
	 * @return the imagePath
	 */
	protected String getImagePath() {
		return imagePath;
	}
	/**
	 * @param imagePath the imagePath to set
	 */
	protected void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	/**
	 * @return the discount
	 */
	protected double getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	protected void setDiscount(double discount) {
		this.discount = discount;
	}
	/**
	 * @return the numberLeft
	 */
	protected int getNumberLeft() {
		return numberLeft;
	}
	/**
	 * @param numberLeft the numberLeft to set
	 */
	protected void setNumberLeft(int numberLeft) {
		this.numberLeft = numberLeft;
	}
	public NBProduct(int categoryID, int id, String name,
			String descrition, String imagePath, double discount, int numberLeft) {
		super();
		this.categoryID = categoryID;
		this.id = id;
		this.name = name;
		this.descrition = descrition;
		this.imagePath = imagePath;
		this.discount = discount;
		this.numberLeft = numberLeft;
	}
	
}
