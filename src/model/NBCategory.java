package model;

public class NBCategory {
	public  NBCategory(){}
	private int ID;
	private String name;
	private int fatherID;
	private String description;
	private String imagePath;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	public NBCategory(int id,String name, int  fatherID, String description,
			String imagePath) {
		super();
		this.ID=id;
		this.name = name;
		this.fatherID = fatherID;
		this.description = description;
		this.imagePath = imagePath;
//		this.father=null;
	}
	
	
}
