package model;

import java.util.Date;

public class NBUser {
	public NBUser(){}
	private int id;
	private String email;
	private String nickname;
	private String password;
	private int score;
	private String level;//TODO
	
	public NBUser(int id,String email, String nickname, String password, int score,
			Date registerDate,String level ) {
		super();
		this.id=id;
		this.email = email;
		this.nickname = nickname;
		this.password = password;
		this.score = score;
		this.level = level;
		this.registerDate = registerDate;
	}

	private Date registerDate;
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
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * @return the registerDate
	 */
	public Date getRegisterDate() {
		return registerDate;
	}
	/**
	 * @param registerDate the registerDate to set
	 */
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NBUser [id=" + id + ", email=" + email + ", nickname="
				+ nickname + ", password=" + password + ", score=" + score
				+ ", level=" + level + ", registerDate=" + registerDate + "]";
	}

	
	
}
