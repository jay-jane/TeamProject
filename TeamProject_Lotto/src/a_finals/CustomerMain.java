package a_finals;

import java.util.Scanner;

public class CustomerMain {
	static Scanner sc = new Scanner(System.in);

	public static void showIndex() {
		System.out.println("-----로그인 메뉴-----");
		System.out.printf("%s\t %s\t %s\t %s\t %s\n", "1. 회원등록 후 추첨", "2. 비회원 추첨", "3. 회원 정보", "4. 바로 추첨하기", "0. 종료");
		System.out.print("선택 > ");
	}



	public static void main(String[] args) {

		LottoRun lottoRun = new LottoRun();
		NonMemberServiceImpl nms = new NonMemberServiceImpl();
		CustomerList cl = new CustomerList();
		z:while(true) {
			CustomerMain.showIndex();
			String input = CustomerMain.sc.nextLine();
			switch(input) {
			case "1": //회원등록 후 추첨
				cl.inputCustomerInfo();
				break;
			case "2": //비회원 추첨
				System.out.println("-----비회원으로 진행-----");
				nms.register();
				break z;
			case "3": //회원 정보
				try {
					cl.CustomerInfo();
				} catch (Exception e) {
					System.out.println("-----등록된 회원이 없습니다-----");
				}
				break;
			case "4": //바로 추첨
				try {
					if(cl.getList().get(0) != null) {
						lottoRun.run();
						break;
					}
				} catch (Exception e) {
					System.out.println("-----등록된 회원이 없습니다-----");
					break;
				}
			case "0": //종료
				System.out.println("-----시스템 종료-----");
				break z;
			default:
				System.out.println("-----없는 메뉴입니다-----");
				break;
			}

		}

	}

}
