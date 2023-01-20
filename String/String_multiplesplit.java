package String;

public class String_multiplesplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello!Good Afternoon,this is padmaja.";
        String[] arr=str.split("[!,.]");
        for(String line: arr) {
        System.out.println(line);
	}
	}
}
