package exception;

public class throws1 {
	
		public static void main(String[] args) throws NullPointException {
			
		
			// TODO Auto-generated method stub
	int i=10;
	if (i>=18)
	{
		System.out.println("eligible for vote");
				
	}
	else
	{
		//System.out.println( "not elligible for vote");
		throw new NullPointException("error   not eligible");
	}
		}

	}


