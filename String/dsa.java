package String;
import java.util.ArrayList;
import java.util.Scanner;
class student{
	String name;
	int rollno;
	student(String name,int rollno){
		name=this.name;
		rollno=this.rollno;
	}
}
public class dsa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<student> arr= new ArrayList<>();
		char y='y';
		while(y=='y') {
			System.out.println("Enter student name:");
			String name=sc.nextLine();
			System.out.println("Enter rollnumber:");
			int rollno=sc.nextInt();
			arr.add(new student(name,rollno));
			System.out.println("Enter more students?y/n");
			y=sc.next().charAt(0);
			
		}
		for(student s:arr) {
			System.out.println(s.name+" "+s.rollno);
		}
		
	}

}
