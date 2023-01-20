package String;

public class stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="hello!this is padmaja.";
         String[] arr=str.split("!");
         for(String line: arr) {
         System.out.println(line);
         }
	}

}
