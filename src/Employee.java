
public class Employee {

	public String name;
	public String depart;
	public double salary;
	public boolean isPermanent;
	
	public double employeeBonus()
	{
		salary= salary +200;
		return salary;
	}
	
	
	public void details()
	{
		System.out.println("Emp name : " + name + " ; depart : " + depart+ " ; salary : "+ salary + " ; Ispermanent : " + isPermanent);
	}
}
