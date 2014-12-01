package edu.uoc.prac;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;



/**
 * 
 * @author Oscar Cuellas Cuellas
 *
 */
public class Meeting {
	//attribute
	private String description;
	private Date date;
    private long time;
    private Boolean isDraft;
    private Integer attendeeLimit;
    private Integer waitList;
    private Integer allowedGuestsPerMember;
    private Date rsvpStart;
    private Date rsvpEnd;
    private Integer attendeeTotal;
    
    //Relationship 0..*-1 Place
    private Place myPlace;
    //relationship 1-0..1 RepetitionPattren.
    private RepetitionPattern myRepetitionPattern;
    //RElationship *-0..* MeetingGroup
    private ArrayList<MeetingGroup> myMeetingGroups = new ArrayList<MeetingGroup>();
    
    //Methods
    /**
     * Constructor 
     * @param description type of String
     * @param date type of Date
     * @param time type of long
     * @param isDraft type of boolean
     * @param attendeeLimit type of Integer
     * @param waitList type of Integer
     * @param allowedGuestsPerMember type of Integer
     * @param rsvpStart type of Date
     * @param rsvpEnd type of Date
     * @param attendeeTotal type of Integer
     */
    public Meeting(String description, Date date,long time, Boolean isDraft, Integer attendeeLimit, Integer waitList, Integer allowedGuestsPerMember,
    				Date rsvpStart, Date rsvpEnd, Integer attendeeTotal){
    	this.description = description;
    	this.date =date;
    	this.time = time;
    	this.isDraft = isDraft;
    	this.attendeeLimit = attendeeLimit;
    	this.waitList = waitList;
    	this.allowedGuestsPerMember = allowedGuestsPerMember;
    	this.rsvpStart = rsvpStart;
    	this.rsvpEnd = rsvpEnd;
    	this.attendeeTotal = attendeeTotal;
    	
    	
    }
    /**
     * Constructor ej2
     * @param description type of String
     * @param date type of Date
     * @param time type of long
     * @param isDraft type of boolean
     * @param attendeeLimit type of Integer
     * @param waitList type of Integer
     * @param allowedGuestsPerMember type of Integer
     * @param rsvpStart type of Date
     * @param rsvpEnd type of Date
     * @param attendeeTotal type of Integer
     * @param meetingGroup type of MeetingGroup
     * @param place type of Place
     * @param repetitionPattern type of RepetitionPattern
     */
    public Meeting(String description, Date date,long time, Boolean isDraft, Integer attendeeLimit, Integer waitList, Integer allowedGuestsPerMember,
			Date rsvpStart, Date rsvpEnd, Integer attendeeTotal, MeetingGroup meetingGroup, Place place, RepetitionPattern repetitionPattern) {
    	this((String) description, (Date) date,(long) time, (Boolean) isDraft, (Integer) attendeeLimit, (Integer) waitList, (Integer) allowedGuestsPerMember,
    			(Date) rsvpStart, (Date) rsvpEnd, (Integer) attendeeTotal);
    	this.myMeetingGroups.add(meetingGroup);
    	this.myPlace=place;
    	this.myRepetitionPattern = repetitionPattern;
    	
		// TODO Auto-generated constructor stub
	}
	/**
     * Getter Description
     * @return description type of String
     */
	public String getDescription() {
		return this.description;
	}
	/**
     * Setter Description
     * @param description type of String
     */
	public void setDescription(String description) {
	}
	/**
	 * Getter of date
	 * @return date type of Date
	 */
	public Date getDate() {
		return this.date;
	}
	/**
	 * Setter of date
	 * @param date type of Date
	 */
	public void setDate(Date date) {
	}
	
	/**
	 * Getter of Time
	 * @return time type of Time
	 */
	public long getTime() {
		return this.time;
	}
	/**
	 * Setter of Time
	 * @param time type of Time
	 */
	public void setTime(Time time) {

	}
	/**
	 * Getter of isDraft
	 * @return isDraft type of Boolean
	 */
	public Boolean getIsDraft() {
		return this.isDraft;
	}
	/**
	 * Setter of isDraft
	 * @param isDraft type of Boolean
	 */
	public void setIsDraft(Boolean isDraft) {

	}
	/**
	 * Getter of attendeeLimit
	 * @return attendeeLimit type of Integer
	 */
	public Integer getAttendeeLimit() {
		return this.attendeeLimit;
	}
	/**
	 * Setter of attendeeLimit
	 * @paramattendeeLimit type of Integer
	 */
	public void setAttendeeLimit(Integer attendeeLimit) {
	
	}
	/**
	 * Getter of waitList
	 * @return waitList type of Integer
	 */
	public Integer getWaitList() {
		return this.waitList;
	}
	/**
	 * Setter of waitList
	 * @param waitList type of Integer
	 */
	public void setWaitList(Integer waitList) {
		
	}
	/**
	 * Getter of allowedGuestsPerMember
	 * @return allowedGuestsPerMember type of Integer
	 */
	public Integer getAllowedGuestsPerMember() {
		return this.allowedGuestsPerMember;
	}
	/**
	 * Setter of allowedGuestsPerMember
	 * @param allowedGuestsPerMember type of Integer
	 */
	public void setAllowedGuestsPerMember(Integer allowedGuestsPerMember) {
	}
	/**
	 * Getter of rsvpStar
	 * @return rsvpStar type of Date
	 */
	public Date getRsvpStart() {
		return this.rsvpStart;
	}
	/**
	 * Setter of rsvpStar
	 * @param rsvpStar type of Date
	 */
	public void setRsvpStart(Date rsvpStart) {
	}
	/**
	 * Getter of rsvpEnd
	 * @return rsvpEnd
	 */
	public Date getRsvpEnd() {
		return this.rsvpEnd;
	}
	/**
	 * Setter of rsvpEnd
	 * @param rsvpEnd
	 */
	public void setRsvpEnd(Date rsvpEnd) {
		
	}
	/**
	 * Getter of attendeeTotal
	 * @return attendeeTotal type of Integer
	 */
	public Integer getAttendeeTotal() {
		return this.attendeeTotal;
	}
	/**
	 * Setter of attendeeTotal
	 * @param attendeeTotal type of Integer
	 */
	public void setAttendeeTotal(Integer attendeeTotal) {
	}
	/**
	 * Getter of myPlace
	 * @return myPlace type of Place
	 */
	public Place getMyPlace() {
		return myPlace;
	}
	/**
	 * Setter of myPlace
	 * @param Place type of Place
	 */
	public void setMyPlace(Place myPlace) {
	}
	/**
	 * Getter of myRepetitionPattern
	 * @return myRepetitionPattern type of  RepetitionPattern
	 */
	public RepetitionPattern getMyRepetitionPattern() {
		return null;
	}
	/**
	 * Setter of myRepetitionPattern
	 * @param myRepetitionPattern type of  RepetitionPattern
	 */
	public void setMyRepetitionPattern(RepetitionPattern myRepetitionPattern) {
	}
	/**
	 * Getter of myMeetingGroup
	 * @return myMeetingGroup of MeetingGroup
	 */
	public ArrayList<MeetingGroup> getMyMeetingGroups() {
		return null;
	}
	/**
	 * Setter of myMeetingGroup
	 * @param myMeetingGroup of MeetingGroup
	 */
	public void setMyMeetingGroups(ArrayList<MeetingGroup> myMeetingGroups) {
	}
}
