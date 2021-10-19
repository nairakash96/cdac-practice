package Tester;

import java.util.Scanner;

import com.app.StackImpl;

public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			StackImpl st = new StackImpl();
			int ch;
			do {
				System.out.println("\nEnter \n1.PUsh\n2.Pop\n3.ISEmpty\n4.ISFull\n5.Exit");

				ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter element to be added/Pushed");
					st.Push(sc.nextInt());
					break;
				case 2:
					st.Pop();
					break;
				case 3:
					System.out.println(st.IsEmpty());
					break;
				case 4:
					System.out.println(st.IsFull());
					break;
				}
			} while (ch != 5);
			sc.close();
			//hi akash
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
