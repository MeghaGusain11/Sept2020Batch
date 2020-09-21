import java.util.ArrayList;

public class PracticeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar = new ArrayList<Integer>(); // generics added
		System.out.println(ar.size());
		ar.add(100);
		System.out.println(ar.size());
		ar.add(101);
		System.out.println(ar.size());
		ar.add(100);
		
		for(Integer f : ar)
		{ System.out.println(f);
	}
System.out.println("--------------------- using stream");
		ar.stream().forEach(cons -> System.out.println(cons)); //no need to give generic
}
}
