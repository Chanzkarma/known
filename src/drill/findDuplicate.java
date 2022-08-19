package drill;

public class findDuplicate {
	public static void main(String[] args) {
		String str = "This is juts the comercement yet to see a alot";
		int varr = 0;
		char[] input = str.toCharArray();
		int length = str.length();
		// Duplicate Characters
		System.out.println("Duplicate Characters: ");
		for (int i = 0; i < length; i++) // For loop to start the first iteration
		{
			for (int j = i + 1; j < length; j++) {
				if (input[i] == input[j]) {
					System.out.println("Dup-Char: " + input[j]);
					varr = varr++;
					break;
				}
			}
		}
	}

}
