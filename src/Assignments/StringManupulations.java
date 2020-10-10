package Assignments;


import java.util.ArrayList;

public class StringManupulations {
	String message = "   This is a random string and i will do my practice here. Hope this"
			+ " will help me to learn String manipulation.   " ;
	
	public static void main(String[] args)
	{
		StringManupulations sm = new StringManupulations();
		System.out.println(sm.message); 
		System.out.println(sm.message.trim());

System.out.println(sm.message.replace("This", "Bhap"));
System.out.println(sm.message.trim().charAt(8));
System.out.println(sm.message.trim().indexOf("i"));
System.out.println(sm.message.indexOf("i", sm.message.trim().indexOf("i")+1));
int x= sm.message.indexOf("i", sm.message.trim().indexOf("i"))+1 ;
System.out.println(x);
System.out.println(sm.message.trim().indexOf("i", 6));

String name = " hello ";
String name1 = " Hello ";
System.out.println(name.equalsIgnoreCase(name1));
System.out.println(name.equals(name1));
System.out.println(name.trim().toUpperCase());

String pattern = "XYhema badakar XY XY XYXGajraj XY";
String ar[] = pattern.split("XY");
	System.out.print(ar[0]);
	System.out.println(ar[1]);
	
	System.out.println(pattern.contains("hema"));
	pattern= pattern.concat("MEGHAGHGH");
	System.out.println(pattern);
	
	System.out.println(pattern.substring(2));
	System.out.println(pattern.substring(2, 6));
	
	String amount ="3000";
	System.out.println(amount + 100);
	int amt= Integer.parseInt(amount);
	System.out.println(amt+100);
	}
	


}
