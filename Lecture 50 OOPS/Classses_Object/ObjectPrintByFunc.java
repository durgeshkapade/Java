package Classses_Object;
public class ObjectPrintByFunc {

	public static class car {

		String name;
		int rno;
		double percentage;

	}
// method 
	static void fun(car s){    // car is class
		s.name="kunal";
	}

	public static void main(String[] args) {

		car s1 = new car();
		
		s1.name = "Durgesh";
		s1.rno = 01;
		s1.percentage = 85;

		fun(s1);   // s1 is object
		System.out.println(s1.name);
	}
}                                             