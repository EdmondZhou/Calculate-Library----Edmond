/*This class contains methods that perform various math operations.
 * @author Edmond Zhou
 * @version September 25, 2018
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
	public static double toDegrees(double rad) {
		double RadtoDeg;
		RadtoDeg= rad*180/3.14159;
		return RadtoDeg;
	}
	//Converts degrees inputed into radian
	public static double toRadians(double deg) {
		double DegtoRad;
		DegtoRad= deg * 3.14158 / 180;
		return DegtoRad;
	}
	//Accepts 3 doubles and returns 1 double through discriminant
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer = (b*b) - 4 * a * c;
		return answer;
	}
	//Converts a mixed number into a improper fraction
	public static String toImproperFrac(int whole, int numer, int denom) {
		int numerator;
		String answer;
		numerator = whole*denom + numer;
		answer = (numerator + "/" + denom);
		return answer;
	}

	//Converts a improper fraction into a mixed number
	public static String toMixedNum(int numer, int denom) {
		String answer;
		answer = (numer / denom + " " + numer % denom + "/" + denom  );
		return answer;	
	}
	//Converts the form (ax+b)(cx+d) to ax^2+bx+c
	public static String foil(int a, int b, int c, int d, String n ) {
		String answer;
		answer = ((a*c + "n^2 ")+ "+ " + (a * d + b * c) + "n " + b * d );
		return answer;
	}
	//Part 2 start
	//This method will determine if an integer is evenly divisible by another.
	public static boolean isDivisibleBy(int dividend, int divisor) {
		if (divisor == 0) {
			throw new IllegalArgumentException ("Can not divide by zero.");
		}
		boolean answer;
		if (dividend % divisor == 0) {
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
		if (a >= 0) {
			a = a+0.005;
			a = (a * 100);
			int truncate = (int) a;
			double d = (int) truncate;
			d = d * 0.01;
			return d;
		}
		else { 	
			a = a-0.005;
			a = (a * 100);
			int b = (int) a;
			double d = (int) b;
			d = d * 0.01;
			return d;
		}
	}
	//Part 3
	//This method will raise a value to a positive integer power.
	public static double exponent(double base, int power) {
		if (power < 0) {
			throw new IllegalArgumentException ("Please input a positive power.");
		}
		double c = base; 
		for( int exponent = power;exponent != 1;exponent --) {
			base = base * c;
		}
		return base;
	}
	//This method will return the factorial of the value passed.
	public static int factorial(int a) {
		if (a < 1) {
			throw new IllegalArgumentException ("There is no factorial for values less than 1");
		}
		int b = 1;
		for (int c = 1; c <= a; c ++) {
			b = b * c;
		}
		return b;
	}
	//This method will determine if an integer is prime.
	public static boolean isPrime(int a) {
		boolean divisible;
		boolean isPrime = true;
		if (a > 1) {
			for(int i = a - 1; i > 1; i --) {
				divisible = Calculate.isDivisibleBy(a, i);
				if (divisible == true) {
					isPrime = false;
				}
				else {
					isPrime = true;
				}
			}
		}
		else {
			if (a == 1) {
				isPrime = false;
			}
			else {
				isPrime = false;
			}
		}
		return isPrime;
	}
	//This method will find the greatest common factor of 2 integers inputed.
	public static int gcf(int a, int b) {
		int answer = 1;
		for (int c = Calculate.min(a,b);c > 0; c--) {
			if (Calculate.max(a, b) % c == 0 && Calculate.min(a,b) % c == 0) {
				if (c >= answer) {
					answer = c;
				}
			}
		}
		return answer;
	}
	//This method will approximate the square root of the value inputed rounded to the second decimal place.
	public static double sqrt(double a) {
		double root = a;
		double estimate;
		if (a == 0) {
			return root = 0;
		}
		if (a < 0) {
			throw new IllegalArgumentException ("The square root of an negative number is imaginary.");
		}
		if (a > 0) {
			root = a / 2;
			do {
				estimate = root;
				root = (estimate + (a/estimate))/2;
			}
			while ((estimate - root) != 0);
		}
		else {
			root = a;
		}
		return Calculate.round2(root);
	}
}s