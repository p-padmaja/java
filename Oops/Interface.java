
package Oops;
@FunctionalInterface
interface A{
	void show(int a);
}
	//int add();
	//String toString();

//class B implements A{
//	 public void show() {
//		 System.out.println("Hii");
//	 }
//}


public class Interface {

	public static void main(String[] args) {
//		A obj=new A() {
//		public void show() {
//			System.out.println("Hii");
//		}
//		};
		A obj=(a)->System.out.println("hii");
		
		obj.show(5); 
	}

}

