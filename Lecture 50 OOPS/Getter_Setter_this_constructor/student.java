package Getter_Setter_this_constructor;

public class student {
	
	String name;
	int rno;
	double percentage;

	//private int rno=24;
	final String schoolName ="BTS";  // this is final we can not change
	

// Getter
	public int getRno(){
		return rno;
	}

// Setter
	public void setRno(int roll){
		rno = roll;
	}

// This keyword

	/*  this keyword is used to identify attribute of same class	.....     
	 if we not apply this for same name the 
	compiler can't understand which i will used  */

	// public void setRno(int rno){
	// 	this.rno = rno;                    
	// }                                   

// Constructor

		public student() {

		}

		// public student(String naam,int roll,double per){
		// 	name = naam;
		// 	rno = roll;
		// 	percentage = per;
		// }  
		public student(String name,int rno,double percentage){
			this.name = name;
			this.rno = rno;
			this.percentage = percentage;
		}                                                                                                                                                                        
		
// Static keyword  
    /* it is used to access the variable (or) function without creating a object using class */

	static int noOfStudent =1;


	

	

	public static void main(String[] args) {
	
	}

}
