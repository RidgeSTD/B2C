package model;

public class NBAdmin {
	private String username;
	private String password;
	public NBAdmin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	/**
	 * @return the username
	 */
	protected String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	protected void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	protected String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	protected void setPassword(String password) {
		this.password = password;
	}
	
	
}
