package Practice1_csw_2;
import java.util.*;
public class q18 {
     public static void kthsmallest_element(int arr[],int k){
    	 Arrays.sort(arr);
    	System.out.println(arr[k]);
    		 
    	 
     }
	public static void main(String[] args) {
	   int arr[]= {4,9,10,8,1};
	   int k=2;
	   kthsmallest_element(arr,k);

	}

}
