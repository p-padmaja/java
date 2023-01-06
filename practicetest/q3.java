package practicetest;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][][]=new int[3][2][3];
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println("Enter marks of student  "+(j+1)+ " of department "+(i+1) );
				int sum=0;
				for(int k=0;k<arr[0][0].length;k++) {
					arr[i][j][k]=sc.nextInt();
					sum+=arr[i][j][k];
				}
				System.out.println("Total mark of student  "+ (j+1) + " of department "+ (i+1) +":"+sum);
			}
		}
//		int total1=0,total2=0,total3=0,total4=0,total5=0,total6=0;
//		int mark1[]=new int[3];
//        System.out.println("Enter the marks of first student:");
//        for(int i=0;i<3;i++) {
//        	
//        	mark1[i]=sc.nextInt();
//        	total1+=mark1[i];
//        }
//        System.out.println("Total mark of the first student is "+total1);
//        int mark2[]=new int[3];
//        System.out.println("Enter the marks of second student:");
//        for(int i=0;i<3;i++) {
//        	
//        	mark2[i]=sc.nextInt();
//        	total2+=mark2[i];
//        }
//        System.out.println("Total mark of the second student is "+total2);
//        int mark3[]=new int[3];
//        System.out.println("Enter the marks of third student:");
//        for(int i=0;i<3;i++) {
//        	
//        	mark3[i]=sc.nextInt();
//        	total3+=mark3[i];
//        }
//        System.out.println("Total mark of the student is "+total3);
//        int mark4[]=new int[3];
//        System.out.println("Enter the marks of forth student:");
//        for(int i=0;i<3;i++) {
//        	
//        	mark4[i]=sc.nextInt();
//        	total4+=mark4[i];
//        }
//        System.out.println("Total mark of the forth student is "+total4);
//        int mark5[]=new int[3];
//        System.out.println("Enter the marks of fifth student:");
//        for(int i=0;i<3;i++) {
//        	
//        	mark5[i]=sc.nextInt();
//        	total5+=mark5[i];
//        }
//        System.out.println("Total mark of the student is "+total5);
//        int mark6[]=new int[3];
//        System.out.println("Enter the marks of sixth student:");
//        for(int i=0;i<3;i++) {
//        	
//        	mark6[i]=sc.nextInt();
//        	total6+=mark6[i];
//        }
//        System.out.println("Total mark of the sixth student is "+total6);
//

	}

}
