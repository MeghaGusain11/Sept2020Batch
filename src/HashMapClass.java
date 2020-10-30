import java.util.*;
public class HashMapClass{

	public static void main(String[] args)
	{
		Map<String,String> products = new HashMap<String,String> ();
		products.put("100", "789.19");
		products.put("200","11.27");
		products.put("300", "991.82");
		
		System.out.println(products.get("100"));
		//HashMap - Retreiving all key and their values
		products.forEach((k,v) -> System.out.println("Key = " + k + " value = " + v ));
		
		//topcasting
		Map<Integer,Double> EmpSal = new HashMap<Integer, Double> ();
		EmpSal.put(12,100.100);
		EmpSal.put(11, 56.12);
		EmpSal.put(1,1000.80);
		
	System.out.println(EmpSal.entrySet());
	
	for(Map.Entry<Integer,Double> entry : EmpSal.entrySet())
	{
		System.out.println(entry.getKey() + " " + entry.getValue());
	}
	
	
	
	}
}
