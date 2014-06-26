package model;

public class NBCategory {
	public  NBCategory(){}
	private int ID;
	private String name;
	private int fatherID;
	private String description;
	private String imagePath;
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * @return the fatherID
	 */
	public int getFatherID() {
		return fatherID;
	}
	/**
	 * @param fatherID the fatherID to set
	 */
	public void setFatherID(int fatherID) {
		this.fatherID = fatherID;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NBCategory [ID=" + ID + ", name=" + name + ", fatherID="
				+ fatherID + ", description=" + description + ", imagePath="
				+ imagePath + "]";
	}
	
	
}
