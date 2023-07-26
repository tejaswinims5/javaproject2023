package day11;
import java.util.Scanner;

public class arraystringprog {

	public static void main(String[] args) {
		
		
		
		
		Scanner x=new Scanner(System.in);
		int size;
		System.out.println("enter size of array");
		size=x.nextInt();
		String[] names=new String[size];
		
		System.out.println("enter string value for array");
		for(int y=0;y<size;y++)
		{
			names[y]=x.next();
			
		}
		System.out.println("the array values are");
		for(int i=0;i<size;i++)
		
		{
			System.out.println(names[i]);
		}

	}

}
