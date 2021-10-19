package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringCalculator {
	static int count;
	

	public int add(String input) {
		int sum = 0;
		count++;
		if (input.isEmpty()) {
			return 0;
		} else {
			String[] str = tocknize(input);
			List<Integer> number = Convert(str);
			List<Integer> neg = LessThan(number);
			if (neg.size() > 0) {
				throw new RuntimeException("Negative not Allowed :" + neg);
			} else {
				for (Integer s : number) {
					if (s > 1000) {
						continue;
					}
					sum += s;
				}
				return sum;
			}
		}
	}

	public int GetCalledCount() {
		return count;
	}

	private List<Integer> LessThan(List<Integer> number) {
		List<Integer> num = new ArrayList<>();
		for (Integer n : number) {
			if (n < 0)
				num.add(n);
		}
		return num;
	}

	private List<Integer> Convert(String[] str) {
		ArrayList<Integer> num = new ArrayList<>();
		for (String s : str)
			num.add(Integer.parseInt(s));
		return num;
	}
	
	private static String[] tocknize(String text) {
		if (text.startsWith("//")) {
			Matcher m = Pattern.compile("//(.)\n(.*)|//(/[[*{3}]]/)\\n(.*)").matcher(text);
			m.matches();
			String customDelimitor = m.group(1);
			String number = m.group(2);
			return number.split(Pattern.quote(customDelimitor));
		} else {
			String[] num = text.split(",|\n");
			return num;
		}
	}
	private static String passDelimitor(String text) {
		String delimit = text.substring(2);
		if (delimit.startsWith("[")) {
			return delimit.substring(1, delimit.length() - 1);
		}
		return Pattern.quote(delimit);
	}
}
