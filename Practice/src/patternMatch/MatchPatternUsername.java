package patternMatch;

import java.util.ArrayList;
import java.util.Scanner;

public class MatchPatternUsername {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String>arr=new ArrayList<>();
		String pattern="((?=.*[0-9])(?=.*[A-Z])(?=.*[@#*-]).{5,10})";
		for(int i=0;i<2;i++) {
			arr.add(sc.next());
		}
		for(int i=0;i<2;i++) {
			if(arr.get(i).matches(pattern))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}

}
