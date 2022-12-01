
package javapractice;
import java.util.Scanner;

public class Matrix_addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows and columns of first matrix:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("Enter no. of rows and columns of second matrix:");
		int p=sc.nextInt();
		int q=sc.nextInt();
		if(m==p && n==q) {
			int a[][]=new int[m][n];
			int b[][]=new int[p][q];
			int c[][]=new int[m][n];
			System.out.println("Enter the elements of the first matrix:");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the elements of the second matrix:");
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<q;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			System.out.println(" first matrix:");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println(" second matrix:");
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<q;j++)
				{
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<n;j++)
				{
					for(int k=0;k<q;k++)
					{
						c[i][j]=a[i][j]+b[i][j];
					}
				}
			}
			System.out.println("Matrix after addition:");
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(c[i][j]+" ");
					
				}
				System.out.println();
			}
			
		}
		else {
			System.out.println("Addition is not possible");
		}
		

	}

}
