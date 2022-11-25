package javapractice;
import java.util.Scanner;
public class swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 number:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before swapping the numbers are "+x+ " and " +y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping the numbers are "+x+ " and " +y);
	}

}
