package practicetest;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=0,percentage;
		System.out.print("Enter the number of subject:");
        int n=sc.nextInt();
        int mark[]=new int[n];
        System.out.println("Enter the marks:");
        for(int i=0;i<n;i++) {
        	
        	mark[i]=sc.nextInt();
        	total+=mark[i];
        }
        System.out.println("Total mark of the student is "+total);
        percentage=total/n;
        System.out.println("percentage="+percentage+"%");
	}

}
