package practicetest;
import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array:");
		int n=sc.nextInt();
		System.out.println("Enter the size of Second array:");
		int m=sc.nextInt();
		int jagged[][]= {new int[n],new int[m]};
		System.out.println("Enter the elements of first array:");
		for(int i=0;i<n;i++) {
			jagged[0][i]=sc.nextInt();
		}
		System.out.println("Enter the elements of second array:");
		for(int i=0;i<m;i++) {
			jagged[1][i]=sc.nextInt();
		}
		for(int i=0;i<jagged.length;i++) {
			for(int j=0;j<jagged[i].length;j++) {
				System.out.print(jagged[i][j]+" ");
			}
			System.out.println();
		}
	}

}
