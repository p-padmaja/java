package javapractice;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        String str= "padma", nstr="";
		        char ch;
		        
		      System.out.print("Original word: ");
		      System.out.println("padma"); 
		        
		      for (int i=0; i<str.length(); i++){
		        ch= str.charAt(i); 
		        nstr= ch+nstr; 
		      }
		      System.out.println("Reversed word: "+ nstr);
		    }
		
	}


