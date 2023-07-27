package day13;
import java.util.*;
public class Hashsetprogram {

	public static void main(String[] args) {
		
      LinkedList<Integer> x=new LinkedList<>();
      x.add(34);
      x.add(67);
      x.add(29);
      x.add(90);
      System.out.println(x);
      
      HashSet<Integer> y=new HashSet<>();
      y.add(12);
      y.add(89);
      y.add(12);
      y.add(99);
      y.add(20);
      y.addAll(Arrays.asList(234,89,456,290,345));
      y.remove(12);
      y.removeAll(y);
      System.out.println(y);
     System.out.println(y.containsAll(Arrays.asList(45,78,34,0)));
     
      
      
      TreeSet<Integer> z=new TreeSet<>();
      z.add(34);
      z.add(56);
      z.add(34);
      z.add(87);
      z.add(45);
      z.addAll(Arrays.asList(45,789,234,890,45));
      z.removeAll(Arrays.asList(45,789,234,890,45));
      System.out.println(z);
      
      
	}

}
