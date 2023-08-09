package Classses_Object;

public class ObjectCreation {

	public static class Student {

		String name;
		int rno;
		double percentage;                            

	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "kunal";
		s1.rno = 45;
		s1.percentage = 78;

		Student s2 = new Student();
		s2.name = "Durgesh";
		s2.rno = 4;
		s2.percentage = 7;

		System.out.println(s2.name);
	}
}
