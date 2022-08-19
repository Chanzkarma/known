package drill;

public class Recursion {

	static int a1 = 0, a2 = 1, a3 = 0;

	static void printFibo(int count) {
		if (count > 0) {
			a3 = a1 + a2;
			a1 = a2;
			a2 = a3;
			System.out.print(" " + a3);
			printFibo(count - 1);
		}
	}

	public static void main(String[] args) {
		int count = 20;
		System.out.print(a1 + " " + a2);
		printFibo(count - 2);
	}
}
