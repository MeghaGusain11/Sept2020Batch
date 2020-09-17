package Assignments;

public class Assignment1 {
	public static void main(String[] args)
	{

	//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line

System.out.println("Hello");
System.out.println("Megha Gusain");
	
System.out.println("------------------2-------------------");
	//2. Write a Java program to print the sum of two numbers
int num1=74;
int num2= 36;
	
System.out.println("Sum of " + num1 + " and " +num2 +" is: " + (num1+num2) );
	
	
	//3. Write a Java program to divide two numbers and print on the screen.
System.out.println("------------------3-------------------");
	int div1= 50;
	int div2= 3;
	
System.out.println(div1/div2);

	//4. Write a Java program to print the result of the following operations. Change your test data accordingly.
//
//Test Data:
//a. -5 + 8 * 6
//b. (55+9) % 9 
//c. 20 + -3*5 / 8 
//d. 5 + 15 / 3 * 2 - 8 % 3 
System.out.println("------------------4-------------------");
System.out.println(-5+(8*6));
System.out.println((55+9)%9);
System.out.println(20+ (-3*5) /8);
System.out.println(5+15/3*2-8%3);  //precedence will work here

//5. Write a Java program to compute the specified expressions and print the output. Go to the editor
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 

System.out.println("------------------5-------------------");

System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

//6.Try to concat "Hello Selenium" with a character 't'.
String st1 = "Hello Selenium";
char c1= 't';
//internal type casting
System.out.println("------------------6-------------------");
System.out.println(st1 +c1);
//System.out.println(1.222+c1);
	
	//7.What should be the output for byte b3=065;

System.out.println("------------------7-------------------");
byte b3=065; //Started with 0 considered as Octal. Octal to binary to decimal conversion (000)(110)(101)[Binary]  > 53 [Decimal]	
System.out.println(b3);
//byte b4=078; //type mismatch error	-- reason starting with zero and not octal
//System.out.println(b4);
	
	
//8. Take three numbers from the user and print the greatest number. 
int a=25;
int b=78;
int c=87;

System.out.println("------------------8-------------------");
if(a>b && a>c) {
	System.out.println(a + " is the greatest number");
}
else if (b>c)
{ System.out.println(b+ " is the greatest number");
}
else 
	System.out.println(c + " is the greatest number");
	
	
// 9. Happy a Java program to test a number is positive or negative.
	
	int pnum1 = 35;
	int pnum2 = -11;
	
	System.out.println("------------------9-------------------");
	if (pnum1 < 0)
	System.out.println("pnum1 is negative number");
	
	if(pnum2 <0) 
		System.out.println("pnum2 is a negative number");
		
}




}
