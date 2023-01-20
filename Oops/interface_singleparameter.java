
package Oops;
//@FunctionalInterface

public class interface_singleparameter {
	interface A{
		public String announce(String text);
	}

	public static void main(String[] args) {
		A obj1=(text)->{
			return " hello! "+text;
		};
		System.out.println(obj1.announce("This is Padmaja."));
		A obj2=(text)->{
			return "I am a "+text;
		};
		System.out.println(obj2.announce("Web developer."));
	}

}
