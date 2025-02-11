package production;

public class production2 {
	
	int id ;
	String name;
	product1 object;
	public production2(int id, String name, product1 object) {
		super();
		this.id = id;
		this.name = name;
		this.object = object;
	}
	public void disp()
	{
		System.out.println(id +" "+name);
		System.out.println(object.name1+" "+object.code+" "+object.state);
	}
	public static void main(String[] args) {
		product1 on = new product1("Car","TN",123);
		production2 ob= new production2(101,"Vishnu",on);
		ob.disp();
	}
	
}
