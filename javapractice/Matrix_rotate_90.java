package javapractice;
import java.util.Scanner;
public class Matrix_rotate_90 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the matrix:");
		int a[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Rotate Matrix by 90 Degree: ");  
		for(int i=0;i<3;i++) 
		{  
		   for(int j=2;j>=0;j--)  
		   {  
		    System.out.print(" "+a[j][i]+" ");  
		   }  
		System.out.println(" ");  
		}  
	}  

}


