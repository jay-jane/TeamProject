package c_utils;

import java.util.Scanner;

public class NonMemberUtil {

	private static Scanner scan = new Scanner(System.in);
	
	public static String nextLine(String input) {
		System.out.print(input);
		return scan.nextLine();
	}
	
	public static int nextInt(String input) {
		return Integer.parseInt(nextLine(input));
	}
	
}
