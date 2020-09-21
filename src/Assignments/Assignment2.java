package Assignments;

public class Assignment2 {
	public static void main(String[] args)

	{
		int k = 1;
		int j = 10;
		int m = 10;
		int h = 1;
		int pg = 1;

		// 1. WAP to print following output:
		for (int i = 1; i <= 5; i++) {
			System.out.println("I am Batman");
		}

		System.out.println("--------------------------------2---------------------------------------");
		// 2. WAP to print following output:
		while (k < 10) {
			System.out.println("I am Batman " + k);
			k++;
		}

		System.out.println("--------------------------------3---------------------------------------");
		System.out.println("--------------------------------3 For---------------------------------------");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("--------------------------------3 While---------------------------------------");
		while (j >= 1) {
			System.out.println(j);
			j--;
		}
		System.out.println("--------------------------------3 Do While---------------------------------------");
		do {
			System.out.println(m);
			m--;
		} while (m >= 1);

		System.out.println("--------------------------------4 While---------------------------------------");
		// 4. Write a program in Java to print "Hello World" ten times using while loop
		while (h <= 10) {
			System.out.println("Hello World");
			h++;
		}

		System.out.println("--------------------------------5---------------------------------------");
		// 5. Write a program in Java to print 1 to 10 using while loop but quit if
		// multiple of 7 is encountered
		while (pg <= 10) {
			if (pg % 7 == 0)
				break;
			else {
				System.out.println(pg);
				pg++;
			}

		}

		System.out.println("--------------------------------6---------------------------------------");
		// Question 1: Write a program to print the following pattern using for loop:

		for (int a = 0; a <= 3; a++) {
			for (int b = 0; b <= 9; b++) {
				System.out.print("" + a + "" + b + "\t");
			}
			System.out.println("\n");
		}

		System.out.println("--------------------------------7---------------------------------------");

		Object ob[] = new Object[6];
		ob[0] = "Amit";
		ob[1] = 20;
		ob[2] = "Hakuna Matata";
		ob[3] = "01-01-1988";
		ob[4] = 'M';
		ob[5] = 40.50;

		for (Object f : ob) {
			System.out.println(f);
		}

		System.out.println("--------------For multiple players---------------");
		Object obj[][] = new Object[2][6];
		obj[0][0] = "Amit";
		obj[0][1] = 20;
		obj[0][2] = "Hakuna Matata";
		obj[0][3] = "01-01-1988";
		obj[0][4] = 'M';
		obj[0][5] = 40.50;

		obj[1][0] = "Lalu";
		obj[1][1] = 30;
		obj[1][2] = "Champion";
		obj[1][3] = "01-05-1985";
		obj[1][4] = 'F';
		obj[1][5] = 70.50;
		
		for (int a = 0; a <= 1; a++) {
			for (int b = 0; b <= 5; b++) {
				System.out.print(obj[a][b] + "\t");
			}
			System.out.println("\n");
		}
		
		
		System.out.println("--------------------------------8---------------------------------------");
		
for (int n=4; n>=0; n--)
{
	System.out.println("n = " + n);
}
	}
}
