package Oops;

import Oops.interface_singleparameter.A;

public class interface_multipleparameter {
	interface A{
		public String announce(int a,int b);
	}
	public static void main(String[] args) {
		A obj1=(a,b)->{
			return "marks in math1+math2:"+ (a+b);
		};
		System.out.println(obj1.announce(50,48));
		A obj2=(a,b)->{
			return "marks in sc1+sc2: "+(a+b);
		};
		System.out.println(obj2.announce(47,49));

	}

}
