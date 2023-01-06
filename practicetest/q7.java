package practicetest;
import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String str=sc.nextLine();
		String word[]=str.split(" ");
		for(int i=0;i<word.length;i++) {
			System.out.println(word[i]);
		}
		
	}

}
