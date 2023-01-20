package Oops;
import java.util.*;
public class interface_loops {

	public static void main(String[] args) {
		
			 List<Integer> student1 = new ArrayList<Integer>();
			 student1.add(50);
			 student1.add(60);
			 student1.add(70);
			 student1.add(80);
			 student1.add(90);
			 System.out.println("The marks of each subject of student1 is :");
			 student1.forEach((x) -> System.out.println(x));
	}

}
