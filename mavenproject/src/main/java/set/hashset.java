package set;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
	public  static  void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> ar=new HashSet<String>();
ar.add("hi");
ar.add("namasta");
ar.add("boo");
System.out.println(ar);
Iterator<String> var1=ar.iterator();

while(var1.hasNext())
{

	System.out.println(var1.next());
	
}
var1.remove();
System.out.println(ar);
	}


	}



