package edu.uoc.prac;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Oscar Cuellas Cuellas
 */
public class MeetingManager {
	
	//relantioship *-* Answer
	//private ArrayList<Answer> answersUsers = new ArrayList<Answer>();
	
	//relantioship *-* MeetingGruop
	private ArrayList<MeetingGroup> myMeetingGroups = new ArrayList<MeetingGroup>();
	
	//relantioship *-* User
	private ArrayList<User> myUsers = new ArrayList<User>();
	//Method
	
	/**
	 * Construsctor ej2
	 */
	public MeetingManager() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Setter of MeetingGroup
	 * @param arraymeetingGroup type of MeetingGroup
	 */
	public void setMeetingGroup(MeetingGroup meetingGroup){
		this.myMeetingGroups.add(meetingGroup);
		System.out.println("New MeetingGroup added");
	}
	/**
	 * Getter of MeetingGroup
	 * @return meetingGroup type of MeetingGroup
	 */
	public MeetingGroup getMeetingGroup(){
		return null;
	
	}
	/**
	 * Setter of User
	 * @param user type of User
	 */
	public void setUser(User user){
		
	}
	/**
	 * Getter of User
	 * @return meetingGroup type of User
	 */
	public User getUser(){
		return null;
	
	}
	/**
	 * Setter of ArrayMeetingGroup
	 * @param arraymeetingGroup type of MeetingGroup
	 */
	public void setArrayMeetingGroup(ArrayList<MeetingGroup> arrayMeetingGroup){
		this.myMeetingGroups = arrayMeetingGroup;
	}
	/**
	 * Getter of MeetingGroup
	 * @return meetingGroup type of MeetingGroup
	 */
	public ArrayList<MeetingGroup> getArrayMeetingGroup(){
		return myMeetingGroups;
	
	}
	/**
	 * Add a new meeting group
	 * @param meetingGroup
	 */
	public void addMeetingGroup(MeetingGroup meetingGroup) {
		if(meetingGroup == null){
			System.out.println("Member null not allowed. Check User inicialization. ");
		}
		else if(myMeetingGroups.contains(meetingGroup)){
			System.out.println("Duplicaded MeetingGroup not added");
		}
		else{
			this.setMeetingGroup(meetingGroup);
		}
	}
	/**
	 * get the meeting Group which has this name
	 * @param name type of string
	 * @return mG type of MeetingGrop
	 */
	public  MeetingGroup getMeetingGroupByName(String name) {
    		for(MeetingGroup m : myMeetingGroups){
    			if(m.getName().equals(name)){
    				return m;
    			}
    		}
    		return null;
    }
		

}
