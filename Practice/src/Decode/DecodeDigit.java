package Decode;

import java.util.Scanner;

public class DecodeDigit {

	public static void main(String[] ags) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		System.out.println(decoding(str, n));
		sc.close();
	}

	private static int decoding(String str, int n) 
	{
		int[] count = new int[n + 1];
		count[0] = 1;
		count[1] = 1;
		
		for (int i = 2; i <=n; i++) 
		{
			count[i] = 0;
			if (str.charAt(i-1) > '0')
				count[i] = count[i - 1];
			if (str.charAt(i - 2) == '1' || str.charAt(i - 2) == '2' && str.charAt(i - 1) < '7')
				count[i] += count[i - 2];
		}

		return count[n];
	}

}
