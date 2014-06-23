package model;
import model.*;
public class NBVIPCategory {
	private NBUser user;
	private String levelName;
	private int leastScore;
	private double scorePercentage;
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
	 * @return the levelName
	 */
	protected String getLevelName() {
		return levelName;
	}
	/**
	 * @param levelName the levelName to set
	 */
	protected void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	/**
	 * @return the leastScore
	 */
	protected int getLeastScore() {
		return leastScore;
	}
	/**
	 * @param leastScore the leastScore to set
	 */
	protected void setLeastScore(int leastScore) {
		this.leastScore = leastScore;
	}
	/**
	 * @return the scorePercentage
	 */
	protected double getScorePercentage() {
		return scorePercentage;
	}
	/**
	 * @param scorePercentage the scorePercentage to set
	 */
	protected void setScorePercentage(double scorePercentage) {
		this.scorePercentage = scorePercentage;
	}
	public NBVIPCategory(NBUser user, String levelName, int leastScore,
			double scorePercentage) {
		super();
		this.user = user;
		this.levelName = levelName;
		this.leastScore = leastScore;
		this.scorePercentage = scorePercentage;
	}
	
	
	
	
}
