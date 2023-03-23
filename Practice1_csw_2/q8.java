package practice1_csw2;
import java.util.*;
public class q8 {
	 static ArrayList<Integer> leaders(int arr[], int n){
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        int max=arr[n-1];
	        list.add(max);
	        for(int i=n-2;i>=0;i--)
	        {
	            if(arr[i]>=max)
	            {
	                max=arr[i];
	                list.add(max);
	            }
	        }
	        Collections.reverse(list);
	        return list;
	 }
	public static void main(String[] args) {
		int n=6;
		int arr[]= {16,17,4,3,5,2};
        System.out.println(leaders(arr,n));
	}

}
