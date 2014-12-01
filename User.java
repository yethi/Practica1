package edu.uoc.prac;

import java.util.ArrayList;

/**
 * 
 * @author Oscar Cuellas Cuellas
 *
 */
public class User {
	//attribute
	private String email;
	private String password;
	
	//relantionship 0..*-1..* User
	private ArrayList<MeetingGroup> myMeetingGroups = new ArrayList<MeetingGroup>();
	
	//Method
	/**
	 * Constructor
	 * @param email type of String
	 * @param password type of String
	 */
	public User(String email, String password){
		this.email = email;
		this.password = password;
		
	}
	/**
	 * Getter of email
	 * @return email type of String
	 */
	public String getEmail() {
		return this.email;
	}
	/**
	 * Setter of email
	 * @param email type of String
	 */
	public void setEmail(String email) {
		
	}
	/**
	 * Getter of password
	 * @return password type of String
	 */
	public String getPassword() {
		return this.password;
	}
	/**
	 * Getter of password
	 * @param password type of String
	 */
	public void setPassword(String password) {

	}
	/**
	 * Getter of myMeetingGroup
	 * @return myMeetingGroup type of MeetingGroup
	 */
	public MeetingGroup getMyMeetingGroups() {
		return null;
	}
	/**
	 * Setter of myMeetingGroup
	 * @return myMeetingGrouptype of MeetingGroup
	 */
	public void setMyMeetingGroups(MeetingGroup myMeetingGroups) {
		this.myMeetingGroups.add(myMeetingGroups);
		
	}
	
}
