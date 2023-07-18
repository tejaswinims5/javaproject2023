package day09;
import java.util.Scanner;

public class Fortable {

	public static void main(String[] args) {
		int table;
		Scanner i=new Scanner(System.in);
		System.out.println("enter value for table:");
		table=i.nextInt();
		
		
		
		for(int a=1;a<=10;a=a+1)
		{
			System.out.println(table+"X"+a+"="+table*a);
			
		}
		
		
	}

}
