package edu.uoc.prac;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * 
 * @author Oscar Cuellas Cuellas
 *
 */
public class MeetingGroup {
	//attribute
	private String name;
	//relationship *-0..* Meeting
	private ArrayList<Meeting> myMeetings = new ArrayList<Meeting>();
	//relationship 0..*-1..* User
	private ArrayList<User> myUsers = new ArrayList<User>();
	
	//Method
	/**
	 * Constructor
	 * @param name type of String
	 */
	public MeetingGroup(String name){
		this.name = name;
	}
	/**
	 * Constructor to ej 2
	 */
	public MeetingGroup() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Getter of name
	 * @return name type of String
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Setter of name
	 * @param name type of String
	 */
	public void setName(String name) {
	
	}
	/**
	 * Getter of myMeeting
	 * @return myMeeting type of ArrayList<Meeting>
	 */
	public ArrayList<Meeting> getMyMeetings() {
		return myMeetings;
	}
	/**
	 * Setter of myMeeting
	 * @param myMeeting type of Metting
	 */
	public void setMeetings(Meeting meetings) {
		this.myMeetings.add(meetings);
		System.out.println("New MeetingGroup added");
	}
	/**
	 * Getter of getMyUser
	 * @return myUser type of ArrayList<User>
	 */
	public ArrayList<User> getMyUsers() {
		return myUsers;
	}
	/**
	 * Setter of user
	 * @param user type of ArrayList<User>
	 */
	public void SetMyUsers(ArrayList<User> arrayUser) {
		
	}
	/**
	 * addMember add a new user ej2
	 * @param user type of User
	 */
	public void addMember(User user) {
		if(user == null){
			System.out.println("Member null not allowed. Check User inicialization");
		}
		else if(myUsers.contains(user)){
			System.out.println("Member already in MeetingGroup. Info User:  email "+user.getEmail()+" password "+ user.getPassword());
		}
		else{
			myUsers.add(user);
			System.out.println("New User added. Info User:  email "+user.getEmail()+" password "+ user.getPassword());
		}
	}
	/**
	 * addMeeting add a neew meeting ej2
	 * @param meeting type of Meeting
	 */
	public void addMeeting(Meeting meeting) {
		if(meeting == null){
			System.out.println("Member null not allowed. Check User inicialization. ");
		}
		else if(myMeetings.contains(meeting)){
			System.out.println("Meeting already in Meeting Group. Not added. "+ meeting.getDescription());
		}
		else{
			this.setMeetings(meeting);
		}
		
	}
	/**
	 * Getter of myMeeting
	 * para ej2
	 * @return myMeetings type of ArrayList
	 **/
	public ArrayList<Meeting> getArrayMyMeetings(){
		return this.myMeetings;
	}
	/**
	 * Setter of myMeeting
	 * para ej2
	 * @param myMeetings type of ArrayList
	 **/
	public void setArrayMyMeetings(ArrayList<Meeting> meetingGroups){
		this.myMeetings= meetingGroups;
	}
	/**
	 * List all the users in the group
	 * 
	 */
	public void listUser(){
		System.out.println("Users info:");
		for(User u : myUsers){
			System.out.println(" email "+u.getEmail()+" password "+ u.getPassword());
		}
	}
	/**
	 * List all the Meeting in the Group
	 */
	public void listMeetings() {
		System.out.println("Meetings info -------");
		for(Meeting m : myMeetings){
		    System.out.println("Description: "+m.getDescription());
			System.out.println("When?:"+m.getDate());
			System.out.println("Draft?:"+((m.getIsDraft()==true)?" Si":" No"));
		    System.out.println("Maximum attendance Limit? "+((m.getAttendeeLimit()==0)?true:false));
			System.out.println("Available waiting list? "+((m.getWaitList()==1)?true:false));
			System.out.println("Number of guests per Member: "+m.getAllowedGuestsPerMember());
			System.out.println("When can members RSVP to this Meetup "+ m.getRsvpStart());
			System.out.println("When can members RSVP end to this Meetup "+ m.getRsvpEnd());
			System.out.println("Expected attendeeTotal (no anwers computed) "+ m.getAttendeeLimit());
			System.out.println("Place Name:"+ m.getMyPlace().getName());
			System.out.println("Address: "+m.getMyPlace().getAddress());
			System.out.println("Private Residence: "+ ((m.getMyPlace().getPrivateResidence())?"Si":"No"));
			System.out.println("Country: "+m.getMyPlace().getMyCountry().getName());	
		}
		
	}
	/**
	 * List MeetingGroup info
	 * 
	 */
	public void listMeetingGroup() {
		System.out.println("Meeting group info --------------------------------------------");
		System.out.println("Name: "+this.name);
	}
}
