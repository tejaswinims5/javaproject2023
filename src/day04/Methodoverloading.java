package day04;

public class Methodoverloading {

	public static void main(String[] args) {
	
       add(10,20);
       add(1230.3664f,7830.765f);
       add(1234.5674,125679.2436);
       add(134,87,120);
       Methodoverloading m=new Methodoverloading();
       m.add(1234.873f, 23748.08633f, 136784.68733f);
	}
	
	public static void add(int a,int b)
	{
		System.out.println(a+b);
		
	}

	public static void add (float a,float b)
	{
		System.out.println(a+b);
	}
	
	public static void add(double a, double b)
	
	{
		System.out.println(a+b);
	}
	
	public static void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public void add(float a,float b,float c)
	{
		System.out.println(a+b+c);
	}
}

