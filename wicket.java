package org.hcl;

public class wicket {
	Long over, ball;
	String wicketType, bowlerName, playerName;

	public wicket(Long over, Long ball, String wicketType, String bowlerName, String playerName) {
		super();
		this.over = over;
		this.ball = ball;
		this.wicketType = wicketType;
		this.bowlerName = bowlerName;
		this.playerName = playerName;
	}

	public wicket() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the over
	 */
	public Long getOver() {
		return over;
	}

	/**
	 * @param over the over to set
	 */
	public void setOver(Long over) {
		this.over = over;
	}

	/**
	 * @return the ball
	 */
	public Long getBall() {
		return ball;
	}

	/**
	 * @param ball the ball to set
	 */
	public void setBall(Long ball) {
		this.ball = ball;
	}

	/**
	 * @return the wicketType
	 */
	public String getWicketType() {
		return wicketType;
	}

	/**
	 * @param wicketType the wicketType to set
	 */
	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}

	/**
	 * @return the bowlerName
	 */
	public String getBowlerName() {
		return bowlerName;
	}

	/**
	 * @param bowlerName the bowlerName to set
	 */
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

}