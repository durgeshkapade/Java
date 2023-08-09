// finding fraction using constructor
// input  16/24    ==== output  2/3
// all fraction include
// 23-7-23
public class findingFraction{

	public static findFraction add(findFraction f1,findFraction f2){
		int numerator = f1.num*f2.den+ f2.num*f1.den;
		int denominator = f1.den*f2.den;

		findFraction f3 =new findFraction(numerator, denominator);
		return f3;
	}
	public static findFraction sub(findFraction f1,findFraction f2){
		int numerator = f1.num*f2.den- f2.num*f1.den;
		int denominator = f1.den*f2.den;

		findFraction f3 =new findFraction(numerator, denominator);
		return f3;
	}
	public static findFraction mul(findFraction f1,findFraction f2){
		int numerator = f1.num*f2.num;
		int denominator = f1.den*f2.den;

		findFraction f3 =new findFraction(numerator, denominator);
		return f3;
	}
	public static findFraction div(findFraction f1,findFraction f2){
		int numerator = f1.num*f2.den;
		int denominator = f1.den*f2.num;

		findFraction f3 =new findFraction(numerator, denominator);
		return f3;
	}

// method	
		public static int gcd(int num,int den){
			int min=Math.min(num, den);

			for (int i = min; i>=1; i--) {
				if(num%i==0 && den%i==0) 
					return i;
				
			}
			return 1;
		}


// class	
		public static class findFraction{

			int num;
			int den;
			// constructor
			public findFraction(int num,int den){
				this.num=num;
				this.den=den;
				simplify();
			}

			public void simplify(){
				int hcf = gcd(num,den);
				num/=hcf;
				den/=hcf;

			}
		
		}
	public static void main(String[] args) {
		
		findFraction f1 = new findFraction(7,14);
		System.out.println("Fraction 1     "+ f1.num +"/"+f1.den);
		findFraction f2 = new findFraction(3,9);
		System.out.println("Fraction 2     "+ f2.num +"/"+f2.den);


		findFraction f3 = add(f1,f2);
		System.out.println("Addition       "+f3.num +"/"+f3.den);
		findFraction f4 = sub(f1,f2);
		System.out.println("Subtraction    "+f4.num +"/"+f4.den);
		findFraction f5 = mul(f1,f2);
		System.out.println("Multiplication "+f5.num +"/"+f5.den);
		findFraction f6 = div(f1,f2);
		System.out.println("Division       "+f6.num +"/"+f6.den);

		



	}
}