
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i[]= new int[5];
	i[0]=1;
	i[1]=2;
	i[2]=3;
	i[3]=4;
	//i[4]=5;
	
	for (Integer x : i )
	{
		System.out.println(x);
	}
	
	for (int x : i )
	{
		System.out.println(x);
	}
	
	
	
	char carr[] = new char[3];
	carr[0] = 's';
	carr[1]= 'a';
	//carr[2]='m';
	// no value in any particular index will result in space
	for(Character c : carr)
	{
		System.out.println(c);	
	}
	
	String st[] = new String[4];
	
	st[0]="Hare";
	st[1]="Krishna";
	st[2]="Hare";
	st[3]="Rama";
	for (String x : st)
	{
		if(x.equals("Krishna")) {
		System.out.println(x);
		}
	}
	
	
	double d[] = new double [2];
	d[0]=1.12;
	d[1]=23;
	for (int m=0; m< d.length;m++)
	{ System.out.println(d[m]);
	
	}
	
			
	}
}
