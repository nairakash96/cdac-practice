package OuterBracket;

public class RemoveOuterBracket {

	public static void main(String[] args) {
	String str="(()()())(()()())";
	System.out.println(RemoveBracket(str));

	}

	private static String RemoveBracket(String str) {
		String res="";
		int j=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==41)
				j--;
			if(j!=0)
				res+=str.charAt(i);
			if(str.charAt(i)==40)
				j++;
		}
		return res;
	}

}
