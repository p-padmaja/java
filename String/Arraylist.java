package String;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> p = new ArrayList<>(); 
        p.add("Padmaja");  
        p.add("Ayusha");  
        p.add("Trishna");  
        p.add("shreya");  
         System.out.println("List objects are:  " +p);  
        p.remove("shreya");
        System.out.println("After Removing shreya, List Objects are" +p);  
        p.add("aparna");
        System.out.println("After Adding aparna, List Objects are" +p);  

	}

}
