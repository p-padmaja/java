package javapractice;
import java.util.Scanner;
public class permutation_of_a_string {
	  private void permute(String str, int l, int r)
	    {
	        if (l == r)
	            System.out.println(str);
	        else {
	            for (int i = l; i <= r; i++) {
	                str = swap(str, l, i);
	                permute(str, l + 1, r);
	                str = swap(str, l, i);
	            }
	        }
	    }
	 
	
	 public String swap(String a, int i, int j) {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i];
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
	
	 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String str=sc.next();
		int n=str.length();
	    permutation_of_a_string permutation = new  permutation_of_a_string();
	     permutation.permute(str, 0, n - 1);
		
		

	}

}
