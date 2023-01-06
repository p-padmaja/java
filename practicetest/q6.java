package practicetest;
import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="padmaja";
		char arr[]=new char[3];
		str.getChars(0,3,arr,0);
		for(char c:arr) {
			System.out.println(c);
		}
	}

}
