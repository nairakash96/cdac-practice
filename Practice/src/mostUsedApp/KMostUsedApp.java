package mostUsedApp;

public class KMostUsedApp {

	public static void main(String[] args) {
		int a[] = { 3, 5, 2, 4, 1 };
		int n = a.length;
		int k = 3;
		for(int s:a)
		System.out.print(s);
		
		AltTab(a, n, k);

	}

	private static void AltTab(int[] a, int n, int k) {
		int index = 0;
		index = k % n;
		int x = index;
		int id = a[index];
		while (x > 0) {
			int p = x;
			x--;
			a[p] = a[x];
		}
		a[0] = id;
		System.out.println();
		for(int s:a)
		System.out.print(s);
	}
}
