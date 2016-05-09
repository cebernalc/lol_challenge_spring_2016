package lol.challenge.stratejinxlolcation;

import java.util.ArrayList;

public class ChampKillEvent {
	
	private Long timestamp;
	private Integer killerId;
	private Integer victimId;
	private ArrayList<Integer> assistingParticipantIds;
	private Integer x;
	private Integer y;
	
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getKillerId() {
		return killerId;
	}
	public void setKillerId(Integer killerId) {
		this.killerId = killerId;
	}
	public Integer getVictimId() {
		return victimId;
	}
	public void setVictimId(Integer victimId) {
		this.victimId = victimId;
	}
	public ArrayList<Integer> getAssistingParticipantIds() {
		return assistingParticipantIds;
	}
	public void setAssistingParticipantIds(ArrayList<Integer> assistingParticipantIds) {
		this.assistingParticipantIds = assistingParticipantIds;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	
	@Override
	public String toString (){
		return "("+x+","+y+")";
	}
}
