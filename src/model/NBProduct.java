package model;
import model.*;
public class NBProduct {
	private NBCategory category;
	private int id;
	private String name;
	private String descrition;
	private String imagePath;
	private double discount;
	private int numberLeft;
	/**
	 * @return the category
	 */
	protected NBCategory getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	protected void setCategory(NBCategory category) {
		this.category = category;
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
	public NBProduct(NBCategory category, int id, String name,
			String descrition, String imagePath, double discount, int numberLeft) {
		super();
		this.category = category;
		this.id = id;
		this.name = name;
		this.descrition = descrition;
		this.imagePath = imagePath;
		this.discount = discount;
		this.numberLeft = numberLeft;
	}
	
}
