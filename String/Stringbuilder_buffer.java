package String;
import java.util.GregorianCalendar;
public class Stringbuilder_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.gc();
		 StringBuffer myStrBuff = new StringBuffer();
		 StringBuilder myStrBuild = new StringBuilder();
		 runStringBuilder(myStrBuild);
		 // Request Garbage Collection to clear the memory
		 System.gc();
		 runStringBuffer(myStrBuff);
		 }
		 private static void runStringBuilder(StringBuilder myStr) {
		 long begin = new  GregorianCalendar ().getTimeInMillis();
		 long initiateMemory = Runtime.getRuntime().freeMemory();
			 	 for	(int	j	=	0;	j	<	50000;	j++)	{
		 myStr.append(":" + j);
		 myStr.insert(j, "Hello");
		 }
	     long	finish	=	new	 GregorianCalendar ().getTimeInMillis();
		 long stopMemory = Runtime.getRuntime().freeMemory();
			 	 System.out.println("Time	Taken	for	String	Builder	Append	Insert:"	+	(finish	-begin));
			 	 System.out.println("Memory	used	String	Builder	Append	Insert:"	+	(initiateMemory	-stopMemory));
		 }
		 private static void runStringBuffer(StringBuffer myStr) {
		 long begin = new  GregorianCalendar ().getTimeInMillis();
		 long initiateMemory = Runtime.getRuntime().freeMemory();
			 	 for	(int	j	=	0;	j	<	50000;	j++)	{
		 myStr.append(" :"+ j);
		 myStr.insert(j, "Hello");
		 }
			 	 long	finish	=	new	 GregorianCalendar ().getTimeInMillis();
		 long stopMemory = Runtime.getRuntime().freeMemory();
			 	 System.out.println("Time	Taken	for	String	Buffer	Append	Insert:"	+	(finish	-begin));
			 	 System.out.println("Memory	used	String	Buffer	Append	Insert:"	+	(initiateMemory	-stopMemory));

	}

}
