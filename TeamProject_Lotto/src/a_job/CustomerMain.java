package a_job;

import java.util.Scanner;

public class CustomerMain {
	static Scanner sc = new Scanner(System.in);

	public static void showIndex() {
		System.out.println("-----로그인 메뉴-----");
		System.out.printf("%s\t %s\t %s\t %s\n", "1. 회원등록 후 추첨", "2. 비회원 추첨", "3. 회원 목록", "5. 종료");
		System.out.print("선택 > ");
	}
	


	public static void main(String[] args) {

		CustomerList cl = new CustomerList();
		w:while(true) {
			CustomerMain.showIndex();
			String input = CustomerMain.sc.nextLine();
			switch(input) {
			case "1": //회원등록 후 추첨
				CustomerList.inputCustomerInfo();
				CustomerList.CustomerInfo();
				break;
			case "2": //비회원 추첨
				System.out.println("-----비회원으로 진행-----");
				break;
			case "3": //회원 목록
				break;
			case "5": //종료
				System.out.println("-----시스템 종료-----");
				break w;
				default:
					System.out.println("-----없는 메뉴입니다-----");
					break;
			}
				
		}

	}

}
