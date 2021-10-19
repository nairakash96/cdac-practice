package Encrypt;

import java.util.Scanner;

public class EncryptionMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s, n, m, ans;
		s = sc.nextDouble();
		n = sc.nextDouble();
		m = sc.nextDouble();
		ans = Math.pow(s, n);
		ans %= 10;
		ans = Math.pow(ans, m);
		ans %= 1000000007;
		System.out.println("S -> "+s+" N -> "+n+" M -> "+m+" Code -> "+ans);
		sc.close();
	}

}
