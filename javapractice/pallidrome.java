package javapractice;

public class pallidrome {
	
	    public static boolean isPalindrome(String str) {
	        String rev = ""; 
	        boolean ans = false;
	 
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }
	        if (str.equals(rev)) {
	            ans = true;
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		String str = "level";
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);

	}

}
