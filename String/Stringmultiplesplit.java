package String;

public class Stringmultiplesplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="hello!Good Afternoon!this is padmaja.!!!";
         String[] arr=str.split("!",0);
         for(String line: arr) {
         System.out.println(line);
         }
	}

}
