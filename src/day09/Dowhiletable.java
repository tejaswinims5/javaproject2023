package day09;
import java.util.Scanner;


public class Dowhiletable {

	public static void main(String[] args) {
		
		int table;
		Scanner x=new Scanner(System.in);
		System.out.println("enter value for table:");
		table=x.nextInt();
		int a=1;
		
		do
		{
			System.out.println(table+"X"+a+"="+table*a);
			a=a+1;
			
		}while(a<=10);
		

	}

}
