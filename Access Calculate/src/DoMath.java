/*This class is client code that uses the Calculate Library to perform various mathematical tasks.
 * @author Edmond Zhou
 * @version September 6, 2018
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(2));	
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(3,6));
		System.out.println(Calculate.average(23,22,21));
		System.out.println(Calculate.toDegrees(3.14159/2));
		System.out.println(Calculate.discriminant(2, 4, 3));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7 , 2));
		System.out.println(Calculate.foil(2,3,6,-7, "n"));
		System.out.println(Calculate.isDivisbleBy(5, 2));
		System.out.println(Calculate.absValue(-2.213123));
		System.out.println(Calculate.max(-25, 1000));
		System.out.println(Calculate.max(32, 222, 312));
		System.out.println(Calculate.min(6, 5));
		System.out.println(Calculate.round2(1.227));
		System.out.println(Calculate.exponent(2, 4));
		System.out.println(Calculate.factorial(3));
	}
}
