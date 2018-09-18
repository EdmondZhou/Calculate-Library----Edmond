/*This class contains methods that perform various math operations.
 * @author Edmond Zhou
 * @version September 6, 2018
 */
public class Calculate {
	//returns the square of the input
	public static int square(int num) {
		int answer;
		answer = num*num;
		return answer; 
	}
	//returns the cube of the input
	public static int cube(int num) {
		int answer;
		answer = num*num*num;
		return answer;
	}
	//averages 2 inputed numbers
	public static double average(double num1,double num2) {
		double Avg;
		Avg = (num1+num2)/2;
		return Avg;
	}
	//Averages 3 inputed numbers
	public static double average(double num1,double num2, double num3) {
		double Avg;
		Avg = (num1+num2+num3)/3;
		return Avg;
	}
	//Converts radian input into degrees
	public static double toDegrees(double num) {
		double RadtoDeg;
		RadtoDeg= num*180/3.14159;
		return RadtoDeg;
	}
	//Accepts 3 doubles and returns 1 double through discriminant
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer = (b*b) - 4 * a * c;
		return answer;
	}

	//Converts a mixed number into a improper fraction
	public static String toImproperFrac(int whole, int num, int denom) {
		int numerator;
		String answer;
		numerator = whole*denom + num;
		answer = (numerator + "/" + denom);
		return answer;
	}

	//Converts a improper fraction into a mixed number
	public static String toMixedNum(int num, int denom) {
		String answer;
		answer = (num / denom + " " + num % denom + "/" + denom  );
		return answer;	
	}
	//Converts the form (ax+b)(cx+d) to ax^2+bx+c
	public static String foil(int a, int b, int c, int d, String n ) {
		String answer;
		answer = ((a*c + "n^2 ")+ " + " + (a * d + b * c) + "n " + " " + b * d );
		return answer;
	}
	//Part 2 start
	//This method will determine if an integer is evenly divisible by another.
	public static boolean isDivisbleBy(int a, int b) {
		boolean answer;
		if (a%b == 0) {
			answer = true;
		}
		else {
			answer = false;
		}
		return answer;
	}
	//This method will return the absolute value of the number inputed. 
	public static double absValue(double a) {
		if (a >= 0);
		else { 
			a =  (a * -1);
		}
		return a;
	}
	//This method will return the larger number of the inputed two.
	public static double max(double a, double b) {
		if (a > b) {
			return a;
		}	
		else {
			return b;
		}
	}
	//This method will return the larger number of the inputed three.
	public static double max(double a, double b, double c) {
		if (a > b) {
			if (a > c) {
				return a;
			}
		}	
		else {
			if (b > c) {
				return b;
			} }
		return c;
	}
	//This method will return the smaller of the values inputed.
	public static int min(int a, int b) {
		if (a < b) {
			return a;
		}
		else {
			return b;
		}
	}
	//This method will round a double to the second decimal place.
	public static double round2(double a) {
		a = a+0.005;
		a = (a * 100);
		int b = (int) a;
		double d = (int) b;
		d = d * 0.01;
		return d;
	}
	//Part 3
	//This method will raise a value to a positive integer power.
	public static double exponent(double a, int b) {
		double c = a; 
		for( int exponent = b;exponent != 1;exponent --) {
		a = a * c;
		}
		return a;
	}
	//This method will return the factorial of the value passed.
	public static int factorial(int a) {
		int b = a;
		for(int c = a; c != 0; c --) {
		a = b * c;
		}
	return a;
	}
}