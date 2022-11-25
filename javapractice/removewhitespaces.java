package javapractice;
public class removewhitespaces {

	public static void main(String[] args) {
		String str = "     I   '   am     padmaja     ";
        str = str.replaceAll("\\s", "");
        System.out.println(str);

	}

}
