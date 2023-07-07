package day04;

public class Returnprogram {

	public static void main(String[] args) {
	      float t,n;
	      t=676327.87333f;
	      n=6666778.783553f;
	      
      int x=add(19,34);
      System.out.println(x);
      float y;
      Returnprogram r=new Returnprogram();
      y=r.add(t, n);
      System.out.println(y);
	}
	
	public static int add(int a,int b)
	{
		return(a+b);
	}
	public float add(float a,float b)
	{
		return(a+b);
	}

}
