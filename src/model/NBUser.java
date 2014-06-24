package model;

import java.util.Date;

public class NBUser {

	private String email;
	private String nickname;
	private String password;
	private int score;
	private Date registerDate;
	/**
	 * @return the email
	 */
	protected String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	protected void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the nickname
	 */
	protected String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	protected void setNickname(String nickname) {
		this.nickname = nickname;
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
	/**
	 * @return the score
	 */
	protected int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	protected void setScore(int score) {
		this.score = score;
	}
	/**
	 * @return the registerDate
	 */
	protected Date getRegisterDate() {
		return registerDate;
	}
	/**
	 * @param registerDate the registerDate to set
	 */
	protected void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public NBUser(String email, String nickname, String password, int score,
			Date registerDate) {
		super();
		this.email = email;
		this.nickname = nickname;
		this.password = password;
		this.score = score;
		this.registerDate = registerDate;
	}
	
	
}
