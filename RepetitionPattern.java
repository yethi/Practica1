package edu.uoc.prac;
import java.util.Date;

/**
 * 
 * @author Oscar cuellas Cuellas
 *
 */

public class RepetitionPattern {
	
	//attributes
	private Date stopRepeating;
	private Boolean automaticEmailReminders;
	
	//RelationShip 1-1..* with Meeting
	private Meeting myMeeting;
	
	//Method
	/**
	 * Constructor for ej2
	 */
	public RepetitionPattern() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor
	 * 
	 * @param stopRepeating type of Data
	 * @param automaticEmailReminders type of Boolean
	 * @param myMeeting type of Meeting
	 */
	public RepetitionPattern(Date stopRepeating, Boolean automaticEmailReminders, Meeting myMeeting  ){
		
	}
	
	

	/**
	 * Setter of stopRepitting
	 * @param stopReapeating type of Date
	 */
	public void setStopRepeating(Date stopRepeating){
		
	}
	/**
	 * Setter of automaticEmailReaminders
	 * @param automaticEmailReaminders type of Boolean
	 */
	public void setAutomaticEmailReaminders(Boolean automaticEmailReaminders){
		
	}
	/**
	 * Setter of automaticEmailReaminders
	 * @param myMeeting type of Meeting
	 */
	public void setMyMeeting(Meeting myMeeting){
		
	}
	/**
	 * Getter of myMeeting
	 * @return type of Meeting
	 */
	public Meeting getMyMeeting(){
		return null;
	}
	/**
	 * Getter of stopRepitting
	 * @return type of Date
	 */
	public Date getStopRepeating(){
		return null;
	}
	/**
	 * Getter of stopRepitting
	 * @return type of Boolean
	 */
	public Boolean setAutomaticEmailReaminders(){
		return false;
	}
}
