package Practice1_csw_2;
import java.util.*;
public class q13 {
	static String commonPrefixUtil(String str1, String str2) {
        String result = "";
        int n1 = str1.length(), n2 = str2.length();
        for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            result += str1.charAt(i);
        }
 
        return (result);
    }
 
	 static String commonPrefix(String arr[], int n) {
	        String prefix = arr[0];
	 
	        for (int i = 1; i <= n - 1; i++) {
	            prefix = commonPrefixUtil(prefix, arr[i]);
	        }
	 
	        return (prefix);
	    }
	 
	public static void main(String[] args) {
		 String arr[] = {"cat","car","cab"};
		        int n = arr.length;
		 
		        String ans = commonPrefix(arr, n);
		 
		        if (ans.length() > 0) {
		            System.out.printf("The longest common prefix is " + ans);
		        } else {
		            System.out.printf("There is no common prefix");
		        }
	}

}
