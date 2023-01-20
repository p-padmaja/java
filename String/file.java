package String;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class file {

	public static void main(String[] args) {
		
		DataInputStream dis=new DataInputStream(System.in);
		try {
//		FileOutputStream fout=new FileOutputStream("C:\\Users\\hp\\Documents\\CSE_O\\2141016197\\chap-16 string\\Myfile.txt",true);
//		BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
//		System.out.println("Enter text(@at the end)");
//        char ch;
//        while((ch=(char)dis.read())!='@') {
//        	bout.write(ch);
//        	//fout.write(ch);
 
//        }
//        bout.close();
       //fout.close();
        FileInputStream fin=new FileInputStream("C:\\Users\\hp\\Documents\\CSE_O\\2141016197\\chap-16 string\\Myfile.txt");
 //        String fname=fin.readLine(); 
        System.out.println("File contents:");
        int ch;
        while ((ch=fin.read())!= -1){
        		System.out.println((char)ch);
		}
		fin.close();
	}
		catch(Exception e){
			System.out.println(e);
		}
		  
	}
}  


