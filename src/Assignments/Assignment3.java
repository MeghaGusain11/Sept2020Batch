package Assignments;

import java.util.ArrayList;

public class Assignment3 {

	public static void main(String args[])
	{
		//1.Write a Java program to create a new array list, add some colors (string) and print out the collection
		
		ArrayList<String> color = new ArrayList<String>();
		color.add("Black");
		color.add("red");
		color.add("purple");
		color.add("tomato red");
		
		System.out.println("Printing ArrayList using for each.....");
	for(String clr: color)
	{
		System.out.println(clr);
	}
	
	System.out.println("Printing ArrayList using streams.......");
	
	color.stream().forEach(clr -> System.out.println(clr));
	
	//2. Write a Java program to insert an element into the array list at the first and last positions.
	
	color.add(0, "White");
	System.out.println("Printing ArrayList after adding color at zeroth index.......");
	color.stream().forEach(clr ->  System.out.println(clr));
	System.out.println("Printing ArrayList after adding color at last position.......");
	color.add(color.size(),"Voilet");
	color.stream().forEach(clr-> System.out.println(clr));
	
	//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
	color.add(1,"Green");
	System.out.println("Inserted Green at index = 1 ...........");
	for(String clr: color)
	{
		System.out.println(clr);
	}
	
	//4. Write a Java program to update specific array element by given element.
	System.out.println("Inserted Green at index = 1 ...........");
	color.set(1, "Orange");
	color.stream().forEach(clr-> System.out.println(clr));
	
	//5. Write a Java program to remove the third element from a array list. 
	System.out.println("Removing third elemeny from ArrayList");
	color.remove(2);
	color.stream().forEach(clr -> System.out.println(clr));
	
	//6. Write a Java program to search an element in a array list.
	boolean flag = color.stream().anyMatch(clr -> clr.contentEquals("purple"));
	if(flag)
	{
		System.out.println("Purple Color Found ... ");
	}else { System.out.println("Color not found ...");
	
	}
	
	Boolean foundflag= false;
	for(String clr : color)
	{
		if(clr.equals("Purple"))
		{foundflag= true;
		break;}
	}
	if(foundflag)
	{
		System.out.println("Color Founded by Megha Gusain");
	}else { System.out.println("Oho color not available");

	}
	
	color.add("Blue");
	
	//7. Write a Java program to reverse elements in a array list
	

	int arraysize = color.size(); 
	for(int x=0; x < arraysize/2; x++)
	{
		String exc = color.get(x);
		color.set(x, color.get(arraysize-x-1));
		color.set(arraysize-x-1, exc);
	}
	color.stream().forEach(clr -> System.out.println(clr));
	
	//8. Write a Java program to extract a portion of a array list.
	System.out.println(color.subList(3,5));  // from index inclusive and to index is exclusive
	//9. Write a Java program of swap two elements in an array list.
	String exchange = color.get(2);
	color.set(2, color.get(4));	
	color.set(4, exchange);
	System.out.println("After Swapping two colors ....");
	for(String clr: color)
	{ System.out.println(clr);
		}
	
	//10. Write a Java program to empty an array list.
	
/*	System.out.println("Emptying a list ..... ");
	color.removeAll(color);
	color.stream().forEach(clr->System.out.println(clr));*/
	
	//11. Write a Java program to trim the virtual capacity of an array list the current list size.
	
	ArrayList<Integer> score = new ArrayList<Integer>();
	score.add(1);
	score.add(2);
	System.out.println("Before trimming the array, showing the size of array : " + score.size());
	score.trimToSize(); // this is to save VC(Virtual Capacity)  // use debug
	System.out.println("Showing the size of array After trimming the array : " + score.size());
	
	
	//12. Write a Java program to print all the elements of a ArrayList using the position of the elements
	System.out.println("Printing Score Array....");
	for(int i=0; i< score.size();i++)
	{
		System.out.println(score.get(i));
	}
	
	}
}