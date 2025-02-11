package collection;

import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> r=new ArrayList<String>();
r.add("A");
r.add("hi");

r.add("hello");
System.out.println(r);
r.add(2,"my");
System.out.println(r);
r.set(2, "vishnu");
System.out.println(r);


System.out.println(r.get(3));
r.remove(2);
System.out.println(r);
if (r.contains("shabna"))
{
	System.out.println("elemeent is present");
	
}
else
{
	System.out.println("not present");
}

if (r.isEmpty())
{
	System.out.println("empty");
	
}
else
{
	System.out.println("not emptyt");
}
ArrayList<String> s=new ArrayList<String>();
if (s.isEmpty())
{
	System.out.println("empty");
	
}
else
{
	System.out.println("not emptyt");
}


	}
	

}
