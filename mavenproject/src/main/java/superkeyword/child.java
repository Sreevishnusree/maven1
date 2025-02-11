package superkeyword;

public class child extends parent {
	int a=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj=new child();
		obj.disp();
		System.out.println(obj.a);

	}
	public void disp()
	{
		super.main();
		System.out.println("method of child class");
		System.out.println(super.a);
	}
	public child()
	{
		System.out.println("constructor of child class");
	}

}