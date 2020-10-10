
public class Person {

	public static void main(String[] args) {
		Employee emp= new Employee();

emp.depart = "IT";
emp.isPermanent = false;
emp.name = "Radha";
emp.salary = 100.89;
emp.details();
double bonus= emp.employeeBonus();
System.out.println("Bonus : "+ bonus);
	}

}
