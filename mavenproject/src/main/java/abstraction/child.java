package abstraction;

public class child extends abstract1 {
	

	public static void main(String[] args) {
		child  obj=new child();
		obj.string();
		abstract1 obj1=new child();  //reference of an abstract class
		obj1.string();
		// TODO Auto-generated method stub

	}

	@Override
	public void string() {
System.out.println("hi");
		
	}

}
