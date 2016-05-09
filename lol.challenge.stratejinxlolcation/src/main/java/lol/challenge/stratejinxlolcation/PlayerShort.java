/**
 * PlayerShort.java
 * 
 * Created on May 4, 2016, 7:36:58 PM
 *
 */
package lol.challenge.stratejinxlolcation;

/**
 * {Insert class description here}
 *
 * @author Carlos Bernal
 * @since May 4, 2016
 */
public class PlayerShort {
    private String playerOrTeamId;
    private String playerOrTeamName;
    private String division;
    private String leaguePoints;
    private String wins;
    private String losses;
    private String isHotStreak;
    private String isVeteran;
    private String isFreshBlood;
    private String isInactive;

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "{\"PlayerShort\" :{\"playerOrTeamId\":\"" + playerOrTeamId + "\", \"playerOrTeamName\":\""
                + playerOrTeamName + "\", \"division\":\"" + division + "\", \"leaguePoints\":\"" + leaguePoints
                + "\", \"wins\":\"" + wins + "\", \"losses\":\"" + losses + "\", \"isHotStreak\":\"" + isHotStreak
                + "\", \"isVeteran\":\"" + isVeteran + "\", \"isFreshBlood\":\"" + isFreshBlood
                + "\", \"isInactive\":\"" + isInactive + "\"}}";
    }

    /**
     * @return the playerOrTeamId
     */
    public String getPlayerOrTeamId() {
        return playerOrTeamId;
    }

    /**
     * @param playerOrTeamId
     *            the playerOrTeamId to set
     */
    public void setPlayerOrTeamId(String playerOrTeamId) {
        this.playerOrTeamId = playerOrTeamId;
    }

    /**
     * @return the playerOrTeamName
     */
    public String getPlayerOrTeamName() {
        return playerOrTeamName;
    }

    /**
     * @param playerOrTeamName
     *            the playerOrTeamName to set
     */
    public void setPlayerOrTeamName(String playerOrTeamName) {
        this.playerOrTeamName = playerOrTeamName;
    }

    /**
     * @return the division
     */
    public String getDivision() {
        return division;
    }

    /**
     * @param division
     *            the division to set
     */
    public void setDivision(String division) {
        this.division = division;
    }

    /**
     * @return the leaguePoints
     */
    public String getLeaguePoints() {
        return leaguePoints;
    }

    /**
     * @param leaguePoints
     *            the leaguePoints to set
     */
    public void setLeaguePoints(String leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    /**
     * @return the wins
     */
    public String getWins() {
        return wins;
    }

    /**
     * @param wins
     *            the wins to set
     */
    public void setWins(String wins) {
        this.wins = wins;
    }

    /**
     * @return the losses
     */
    public String getLosses() {
        return losses;
    }

    /**
     * @param losses
     *            the losses to set
     */
    public void setLosses(String losses) {
        this.losses = losses;
    }

    /**
     * @return the isHotStreak
     */
    public String getIsHotStreak() {
        return isHotStreak;
    }

    /**
     * @param isHotStreak
     *            the isHotStreak to set
     */
    public void setIsHotStreak(String isHotStreak) {
        this.isHotStreak = isHotStreak;
    }

    /**
     * @return the isVeteran
     */
    public String getIsVeteran() {
        return isVeteran;
    }

    /**
     * @param isVeteran
     *            the isVeteran to set
     */
    public void setIsVeteran(String isVeteran) {
        this.isVeteran = isVeteran;
    }

    /**
     * @return the isFreshBlood
     */
    public String getIsFreshBlood() {
        return isFreshBlood;
    }

    /**
     * @param isFreshBlood
     *            the isFreshBlood to set
     */
    public void setIsFreshBlood(String isFreshBlood) {
        this.isFreshBlood = isFreshBlood;
    }

    /**
     * @return the isInactive
     */
    public String getIsInactive() {
        return isInactive;
    }

    /**
     * @param isInactive
     *            the isInactive to set
     */
    public void setIsInactive(String isInactive) {
        this.isInactive = isInactive;
    }

}
