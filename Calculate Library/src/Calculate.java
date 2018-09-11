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
	public static double average3(double num1,double num2, double num3) {
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
		answer = (num / denom + " " + num % denom + " / " + denom  );
		return answer;	
	}
	//Converts the form (ax+b)(cx+d) to ax^2+bx+c
	public static String foil(int a, int b, int c, int d, String n ) {
		String answer;
		answer = ((a*c + "n^2 ")+ " + " + (a * d + b * c) + "n " + " " + b * d );
		return answer;
	}
	
}