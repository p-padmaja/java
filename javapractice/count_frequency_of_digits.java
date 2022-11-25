package javapractice;
import java.util.Scanner;
public class count_frequency_of_digits {
 static int frequencyDigits(int n,int d) {
	 int c=0;
	 while(n>0) {
		 if(n%10==d)
			 c++;
		 n=n/10;
	 }
	 return c;
 }
	public static void main(String[] args) {
		int n=112234222;
		int d=2;
		System.out.println(frequencyDigits(n,d));
	}

}
