/*This class is client code that uses the Calculate Library to perform various mathematical tasks.
 * @author Edmond Zhou
 * @version September 6, 2018
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(2));	
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(3,6));
		System.out.println(Calculate.average3(23,22,21));
		System.out.println(Calculate.toDegrees(3.14159/2));
		System.out.println(Calculate.discriminant(2, 4, 3));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
	}
}
