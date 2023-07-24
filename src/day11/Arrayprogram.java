package day11;
import java.util.Scanner;

public class Arrayprogram {

	public static void main(String[] args) {
		
		int x[];
		x=new int[10];
		
		Scanner y=new Scanner(System.in);
		
		System.out.println("enter value for array");
		for(int i=0;i<x.length;i++)
		{
			x[i]=y.nextInt();
			
		}
		System.out.println("printing array values...........");

		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
			
		}
		System.out.println("for each loop...........");
		
		for(int m:x)
		{
			System.out.println(m);
		}
		
		System.out.println("reversing array");
		for(int s=x.length-1;s>=0;s=s-1)
		{
			System.out.println(x[s]);
		}
		y.close();
	}
	

}
