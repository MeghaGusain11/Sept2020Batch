package Assignments;

import java.util.ArrayList;

//static method cannot call non-static variables/methods
//final keyword is not allowed for constructor
//return keyword is not allowed for constructors
public class University {
	static String board;
	String name;
	String country;
	String stablisheddate;
	ArrayList<String> course = new ArrayList<String>();
	
	public static void teststatic() {
		System.out.println(board);
		 // System.out.println(name);  --- this is non-static variable
	}
	public University()
	{
		System.out.println("This is a default constructor ....");
	}

	public University(String name, String country, String stablisheddate, ArrayList<String> course) {
		this.name= name;
		this.country= country;
	this.stablisheddate=stablisheddate;	
	this.course = course;
	}

	public University(String name, String country) {
		
		this.name = name;
		this.country = country;
	}
	
	

	public University(String name, ArrayList<String> course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */

	public String getCountry() {
		return country;
	}

	/*
	 * public void setCountry(String country) { this.country = country; }
	 */

	public String getStablisheddate() {
		return stablisheddate;
	}

	/*
	 * public void setStablisheddate(String stablisheddate) { this.stablisheddate =
	 * stablisheddate; }
	 */
	public ArrayList<String> getCourse() {
		return course;
	}

	/*
	 * public void setCourse(ArrayList<String> course) { this.course = course; }
	 */
	
	
	
}
