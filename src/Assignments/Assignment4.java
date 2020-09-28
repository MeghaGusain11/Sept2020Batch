package Assignments;

public class Assignment4 {

	public static void main(String[] args) {

		Assignment4 ass4 = new Assignment4();
		// TODO Auto-generated method stub

		int s = ass4.sum(3, 7);
		System.out.println("Sum is : " + s);

		int m = ass4.multiply(3, 7);
		System.out.println("Mutilplication is : " + m);

		ass4.circlecalculator(7.10);
		int maxnum = ass4.maximum(12, 20, 19);
		System.out.println("Maximum num : " + maxnum);

		int minnum = ass4.minimum(12, 18, 7);
		System.out.println("Minimum num : " + minnum);

		String f = ass4.evenOdd(2);
		System.out.println("Num is : " + f);

		String eligibility = ass4.votingRights(9);
		System.out.println("This person is : " + eligibility + " to vote..");
	
		boolean flag= ass4.primeornot(199);
		if (flag)
		System.out.println("Num is not prime");
		else System.out.println("Num is prime");
		
		String grade= ass4.marksCalculator(71);
		System.out.println("Grade : " + grade);
		
	}
	

	// 1. Write a program to print the sum of two numbers entered by user by
	// defining your own method.
	public int sum(int a, int b) {
		return a + b;
	}

	// 2. . Define a method that returns the product of two numbers entered by user.

	public int multiply(int a, int b) {
		return a * b;
	}

	// 3. Write a program to print the circumference and area of a circle of radius
	// entered by user by defining your own method.

	public void circlecalculator(double r) {
		double cir = 2 * 3.14 * r;
		double area = 3.14 * r * r;
		System.out.println("Circumference : " + cir + " and Area : " + area);
	}

	// 4. Define two methods to print the maximum and the minimum number
	// respectively among three numbers entered by user.

//4.a 
	public int maximum(int a, int b, int c) {
		int x = -1;
		if (a > b && a > c)
			x = a;
		else if (b > c)
			x = b;

		else
			x = c;
		return x;
	}

	// 4.b

	public int minimum(int a, int b, int c) {
		int x = -1;
		if (a < b && a < c)
			x = a;
		else if (b < c)
			x = b;
		else
			x = c;
		return x;
	}

// 5. Define a program to find out whether a given number is even or odd. 
	public String evenOdd(int f) {
		if (f % 2 == 0)
			return "even";
		else
			return "odd";

	}

	// 6. A person is elligible to vote if his/her age is greater than or equal to
	// 18. Define a method to find out if he/she is elligible to vote.
	public String votingRights(int age) {
		if (age > 18)
			return "Eligible";
		else
			return "not Eligible";
	}

//7. Define a method to find out if number is prime or not.

	public boolean primeornot(int i) {
		boolean flag = false;
		for (int f = 2; f <=i/2 ; f++) {
			if(i==2 || i==1)
				{ flag = false ; 
				break;}
			else if (i % f == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}
//8. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
public String marksCalculator(int marks) {
	String grade;
	if (marks>=91 && marks <=100)
		grade= "AA";
	else if (marks>=81 && marks <=90)
		grade= "AB";
	else if (marks>=71 && marks <=80)
		grade= "BB";
	else if (marks>=61 && marks <=70)
		grade= "BC";
	else if (marks>=51 && marks <=60)
		grade= "CD";
	else if (marks>=41 && marks <=50)
		grade= "DD";
	else if (marks >=0 && marks <=40)
		grade ="Fail";
	else grade="Invalid marks";
	return grade;
}
	
//9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
public void factorial(int f)
{
	int fact=1;
	while(f>=1)
	{
		fact=fact*f;
		f--;
	}
		
}
	
}
