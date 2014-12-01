package edu.uoc.prac;

import java.util.ArrayList;

/**
 * 
 * @author Oscar Cuellas Cuellas
 *
 */

public class Place {
	//attribute
	private String name;
	private String address;
	private String zone;
	private boolean privateResidence;
	  
	//relationship 1-1..0 Place and 0..1 -1 Meeting
	
	private Country myCountry;
	private ArrayList<Meeting> myMeeting = new ArrayList<Meeting>();
	
	//Method
	/**
	 * Constructor 
	 * @param name type of String
	 * @param address type of String
	 * @param zone type of String
	 * @param privateResidence type of boolean
	 * @param myMetting type of Meeting
	 * @param myCountry type of Country
	 */
	public Place(String name, String address, String zone, boolean privateResidence, Meeting myMeeting, Country myCountry) {
		this((String) name, (String) address, (String) zone, (boolean) privateResidence, (Country) myCountry);
		this.myMeeting.add(myMeeting);
	}
	/*
	 * Constructor ej2
	 */
	public Place(String name, String address, String zone, boolean privateResidence, Country myCountry) {
		this.name =name;
		this.address = address;
		this.zone = zone;
		this.privateResidence = privateResidence;
		this.myCountry = myCountry;
		this.myCountry.setMyPlaces(this);
		
	}
	/**
	 * Setter of MyMeeting
	 * @param myMeeting type of Meeting
	 */
	public void setMyMeeting(Meeting myMeeting) {
		
	}
	/**
	 * Getter of MyMeeting
	 * @return myMeeting type of Meeting
	 */
	public Meeting getMyMeeting() {
		return null;
		
	}

	/**
	 * Getter of name
	 * @return name type of String
	 **/
	public String getName() {
		return this.name;
	}
	/**
	 * Setter of name
	 * @param name type of String
	 **/
	public void setName(String name) {

	}
	/**
	 * Getter of address
	 * @return address type of String
	 **/
	public String getAddress() {
		return this.address;
	}
	/**
	 * Getter of address
	 * @return address type of String
	 **/
	public void setAddress(String address) {
		
	}
	/**
	 * Getter of zone
	 * @return zone type of String
	 **/
	public String getZone() {
		return zone;
	}
	/**
	 * Setter of zone
	 * @param zone type of String
	 **/
	public void setZone(String zone) {
		this.zone = zone;
	}
	/**
	 * Getter of privateResidence
	 * @return privateResidence type of boolean
	 **/
	public Boolean getPrivateResidence() {
		return privateResidence;
	}
	/**
	 * Setter of privateResidence
	 * @param privateResidence type of boolean
	 **/
	public void setPrivateResidence(Boolean privateResidence) {
		
	}
	/**
	 * Getter of country
	 * @return country type of Country
	 **/
	public Country getMyCountry() {
		return myCountry;
	}
	/**
	 * Setter of country
	 * @param country type of Country
	 **/
	public void setMyCountry(Country myCountry) {
		this.myCountry = myCountry;
	}
}
