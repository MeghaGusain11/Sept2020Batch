package Assignments;

import java.util.ArrayList;

public class Assignment5 {

	public static void main(String[] args) {
University u= new University(); //default constructor 

University u1 = new University("Ratna University" , "India");
String name = u1.getName();
String country= u1.getCountry();
ArrayList<String> course1= u1.getCourse();

System.out.println("University name : " + name +  " Country: " + country);
for ( String e: course1)
{
	System.out.println(e);
}


ArrayList<String> course = new ArrayList<String>();
course.add("Computer Science");
course.add("Mechanics");
course.add("Physics");



University u2= new University("IIT", course);
ArrayList<String> returnedcourse= u2.getCourse();

System.out.println("Univeristy name : " + u2.getName() );
	for(String c : returnedcourse)
	{
		System.out.println(c);
	}
	
	System.out.println("University Programme Ended.....");
	
	Browser b= new Browser();
	ArrayList<String> plugins =  new ArrayList<String> ();
	plugins.add("googledynamics");
	plugins.add("Grammarily");
	plugins.add("ABC");
	plugins.add("XYZ");
	
	Browser b1= new Browser ("Chrome", plugins);
	//b1.getBrowserName();
	ArrayList<String> b1plugins = b1.getplugins();
	System.out.println(b1.getBrowserName());
	b1plugins.stream().forEach(ele -> System.out.println(ele));
	}
	


}
