package JewelsStone;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JewlsAndStone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String j,s;
		j=sc.next();
		s=sc.next();
		System.out.println(CheckJewel(j,s));
		
		sc.close();

	}

	private static int CheckJewel(String j, String s) {
		int count=0;
		Map<Character, Boolean>mp=new HashMap<>();
		for(int i=0;i<j.length();i++) {
			mp.put(j.charAt(i), true);
		}
		for(int i=0;i<s.length();i++) {
			if(mp.containsKey(s.charAt(i))==true)
				count++;
		}
		return count;
	}

}
