package parentheses;

import java.util.Scanner;

public class ValidParentheses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		int count = 0;
		int t = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 40)
				count++;
			else
				count--;
			t = Math.max(t, count);
		}
		for (int i = 0; i < t; i++) {
			System.out.print((char) 40);
		}
		for (int i = 0; i < t; i++) {
			System.out.print((char) 41);
		}
		sc.close();
	}

}
