package model;

public class NBCategory {
	private String name;
	private NBCategory father;
	private String description;
	private String imagePath;
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
	 * @return the father
	 */
	protected NBCategory getFather() {
		return father;
	}
	/**
	 * @param father the father to set
	 */
	protected void setFather(NBCategory father) {
		this.father = father;
	}
	/**
	 * @return the description
	 */
	protected String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	protected void setDescription(String description) {
		this.description = description;
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
	public NBCategory(String name, NBCategory father, String description,
			String imagePath) {
		super();
		this.name = name;
		this.father = father;
		this.description = description;
		this.imagePath = imagePath;
	}
	
	
}
