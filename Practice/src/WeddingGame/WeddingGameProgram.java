package WeddingGame;

public class WeddingGameProgram {

	public static void main(String[] args) {
		String str="1230";
		int l=str.length();
		int y=30;
		System.out.println(wedGame(str,y,l));

	}

	private static int wedGame(String str, int l, int y) {
		int count=0;
		int num=0;
		int flag=0;
		for(int i=0;i<str.length();i++) {
			num=num*10+(str.charAt(i)-'0');
			if(num<=y)
				flag=1;
			else
				if(flag==1)
					count++;
			num=str.charAt(i)-'0';
			flag=0;
			if(num<=y)
				flag=1;
			else
				num=0;
		}
		return count;
	}

}
