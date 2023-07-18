package day09;
import java.util.Scanner;

public class Whiletable {

	public static void main(String[] args) {
		
		
		int table;
		Scanner scan=new Scanner(System.in);
				System.out.println("enter the vaule for table:");
		table =scan.nextInt();
		int a=1;
		while(a<=10)
		{
			System.out.println(table+"X"+a+"="+table*a);
			a=a+1;
		}
		
		
	}

}
