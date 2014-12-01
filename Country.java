package edu.uoc.prac;

import java.util.ArrayList;

/**
 * 
 * @author Oscar Cuellas Cuellas
 *
 */
public class Country {
	//attribute
	private String name;
	
	//Relationship 1 - 1..0 with Place
	
	private ArrayList<Place> myPlaces = new ArrayList<Place>();
	
	//Method.
	/**
	 * Constructor
	 * @param name type of string
	 */
	public Country(String name){
		this.name = name;
	}
	/**
	 * Setter name
	 * @param name type of string
	 */
	public void setName(String name){
		
	}
	/**
	 * Getter name
	 * @return name type of string
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * Setter place
	 * @param myPlace type Place
	 */
	public void setMyPlaces(Place myPlace){
		this.myPlaces.add(myPlace);
	}
	/**
	 * Getter Place
	 * @return myPlace type Place
	 */
	public Place getMyPlaces(){
		return null;
	}
	
}
