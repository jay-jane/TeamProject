package c_service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
	static Scanner sc = new Scanner(System.in);
	public static final String p1 = "^[A-Za-z[0-9]]{6,12}$"; //id검사
	//pw검사
	public static final String p2 = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,12}$";
	public static final String p3 = "^[가-힣\\s]+$"; //이름 검사
	//생년월일 검사 - YYYYMMdd
	public static final String p4 = "^(19[0-9][0-9]|20\\d{2})(0[0-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])$";
	//전화번호 검사
	public static final String p5 = "^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$";
	
	
	static Matcher m;
	
	public static boolean idCheck(String a) {
		
		boolean check = false;		
		m = Pattern.compile(p1).matcher(a);
		if(m.find()) {
			check = true;
		}
		return check;
	}
	
	public static boolean pwCheck(String a) {
		
		boolean check = false;		
		m = Pattern.compile(p2).matcher(a);
		if(m.find()) {
			check = true;
		}
		return check;
	}
	
	public static boolean nameCheck(String a) {
		
		boolean check = false;
		m = Pattern.compile(p3).matcher(a);
		if(m.find()) {
			check = true;
		}
		return check;
	}
	
	public static boolean birthCheck(String a) {
		
		boolean check = false;
		m = Pattern.compile(p4).matcher(a);
		if(m.find()) {
			check = true;
		}
		return check;
	}
	
	public static boolean phoneCheck(String a) {

		boolean check = false;
		m = Pattern.compile(p5).matcher(a);
		if(m.find()) {
			check = true;
		}
		return check;
	}

}