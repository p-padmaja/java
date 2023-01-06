package practicetest;
import java.util.Scanner;
public class q2 {
//bubble sort
	public static void main(String[] args) {
		int arr[]= {56,2,9,67,41,8,0};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array after sorting is:");
		for(int i=0;i<arr.length;i++) {
		    System.out.print(arr[i]+",");
		    
		}
	}

}
