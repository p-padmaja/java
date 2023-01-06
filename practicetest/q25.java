package practicetest;
import java.util.Scanner;
public class q25 {

	public static void main(String[] args) {
		int[] curr=new int[] {1,2,5,10,20,50,100,200,500,2000};
		Scanner sc=new Scanner(System.in);
     	System.out.println("Enter the amount: ");
		int n=sc.nextInt();
		int count=0;
		for(int i=curr.length-1;i>=0;i--) {
			int currcount=0;
			while(n/curr[i]>=1) {
				count++;
				n=n-curr[i];
				currcount++;
			}
			if(currcount!=0) 
				System.out.println("No. of "+curr[i]+ " used: "+currcount);
		}
		System.out.println("Total no. of currency used:"+count); 
	}

}
