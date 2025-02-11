package exception;

public class throw1 {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
int i=10;
if (i>=18)
{
	System.out.println("eligible for vote");
			
}
else
{
	//System.out.println( "not elligible for vote");
	throw new ArithmeticException("error   not eligible");
}
	}

}
