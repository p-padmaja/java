package Practice1_csw_2;
import java.util.*;  
public class q2 {
	 public static boolean areEqual(int arr1[], int arr2[])
	    {
	        int N = arr1.length;
	        int M = arr2.length;
	        if (N != M)
	            return false;
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        for (int i = 0; i < N; i++)
	            if (arr1[i] != arr2[i])
	                return false;
	        return true;
	    }
	public static void main(String[] args) {

        int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };
        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    

	}

}
