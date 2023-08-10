package day14;

public class Exceptionprogram {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		System.out.println(a+b);
		System.out.println(a-b);
		try 
		{
			System.out.println(a/b);
		    System.out.println(a%b);
		}
		
       catch (Exception e)
		{
    	   System.out.println(e.getMessage());
    	   
		}
		
		finally
		{
			System.out.println("finally block");
			a=40;
			b=25;
			
		}
		System.out.println(a*b);
		System.out.println(a-b);
		
	}

}
