package consistentString;

import java.util.Arrays;
import java.util.Vector;

public class ConsistentStringProgram {

	public static void main(String[] args) {
		String str = "ab";
		String[] str2 = { "ad", "bd", "aaab", "baa", "badab" };
		Vector<String> str3 = new Vector<String>(Arrays.asList(str2));
		System.out.println(countString(str, str3));
	}

	private static int countString(String str, Vector<String> str3) {

		int count = str3.size();
		boolean a[] = new boolean[26];

		for (int i = 0; i < str.length(); i++) {
			a[str.charAt(i) - 'a'] = true;
		}
		for (int j = 0; j < str3.size(); j++) {
			for (int i = 0; i < str.length(); i++) {
				if (a[str.charAt(i) - 'a'] == false) {
					count--;
					break;
				}
			}
		}
		return count;
	}

}
