package mathsOper;

import java.util.Scanner;

public class RootOfEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, c, d, r1, r2;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = b * b - 4 * a * c;
		if (d > 0) {
			r1 = (-b + Math.sqrt(d)) / (2 * a);
			r2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("Root1 = " + r1);
			System.out.println("Root2 = " + r2);
		} else if (d == 0) {
			r1 = r2 = -b / (2 * a);
			System.out.println("Root1 = " + r1);
			System.out.println("Root2 = " + r2);
		} else {
			double r = -b / (2 * a);
			double i = Math.sqrt(d) / (2 * a);
			System.out.println("Root1 = " + r + " + " + i + "i");
			System.out.println("Root2 = " + r + " - " + i + "i");
		}
		sc.close();
	}

}
