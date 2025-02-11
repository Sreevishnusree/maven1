package aggregation;

public class agree2 {
	public agree2(int id, String name, Aggre1 object) {
		super();
		this.id = id;
		this.name = name;
		this.object = object;
	}
	int id;
	String name;
	Aggre1 object;
public static void main(String[] args) {
	Aggre1 objec=new Aggre1("sree","kk","TN",45666);
	agree2 object1=new agree2(45,"sree",objec);
	object1.display(); 
	
}
public void display()
{
System.out.println(id);
System.out.println(name);
System.out.println(object.city);
System.out.println(object.name); 
System.out.println(object.state);
System.out.println(object.pincode);
}
}
