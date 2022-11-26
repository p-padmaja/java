package javapractice;
import java.util.Scanner;

public class permutation_of_a_string1 {
	static void per(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String r;
			r=str.substring(0,i)+str.substring(i+1);
			per(r,ans+ch);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String a=sc.nextLine();
		per(a,"");

	}

}
