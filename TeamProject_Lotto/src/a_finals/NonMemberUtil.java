package a_finals;

import java.util.Scanner;

public class NonMemberUtil {

	private static Scanner scan = new Scanner(System.in);
	
	public String nextLine(String input) {
		System.out.print(input);
		return scan.nextLine();
	}
	
	public int nextInt(String input) {
		return Integer.parseInt(nextLine(input));
	}
	
}
