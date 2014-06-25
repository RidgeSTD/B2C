package model;
import model.*;
public class NBProduct {
	public NBProduct(){}
	private int id;
	private int categoryID;

	private String name;
	private String descrition;
	private String imagePath;
	private double price;
	private double discount;
	private int numberLeft;
	
	/**
	 * @return the categoryID
	 */
	public int getCategoryID() {
		return categoryID;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the descrition
	 */
	public String getDescrition() {
		return descrition;
	}
	/**
	 * @param descrition the descrition to set
	 */
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}
	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NBProduct [id=" + id + ", categoryID=" + categoryID + ", name="
				+ name + ", descrition=" + descrition + ", imagePath="
				+ imagePath + ", price=" + price + ", discount=" + discount
				+ ", numberLeft=" + numberLeft + "]";
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	/**
	 * @return the numberLeft
	 */
	public int getNumberLeft() {
		return numberLeft;
	}
	/**
	 * @param numberLeft the numberLeft to set
	 */
	public void setNumberLeft(int numberLeft) {
		this.numberLeft = numberLeft;
	}

	public NBProduct(int id, int categoryID, String name, String descrition,
			String imagePath, double price, double discount, int numberLeft) {
		super();
		this.id = id;
		this.categoryID = categoryID;
		this.name = name;
		this.descrition = descrition;
		this.imagePath = imagePath;
		this.price = price;
		this.discount = discount;
		this.numberLeft = numberLeft;
	}
	
	
}
