// getter is used for the get the private thing 
//which we cant not access using dot(.) operator

// setter is used for the set the private thing 
//which we cant not access using dot(.) operator

package Getter_Setter_this_constructor;

public class studentClass {

	public static void main(String[] args) {

		student s1 = new student();
		s1.rno=25;
		//s1.schoolName = "djak";       // we cant assign to final keyword
		System.out.println(s1.schoolName);

// getter and setter
		//System.out.println(s1.getRno()); // getter
		//s1.setRno(25); // setter
		//System.out.println(s1.getRno());

// Constructor

		/* when Ever the object is created the constructor is call */
		student s2 = new student("Durgesh", 76, 6.4);
		student s3 = new student("kunal", 76, 6.4);
		student s4 = new student("masi", 76, 6.4);
		student s5 = new student("gayu", 76, 6.4);
		System.out.println(s2.name);
		System.out.println(s2.rno);

		System.out.println(s5.name);

// Static Keyword

		System.out.println(student.noOfStudent);

	}
}
