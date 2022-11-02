package c_app;

import static c_utils.NonMemberUtil.nextInt;

import c_service.NonMemberService;
import c_service.NonMemberServiceImpl;

public class NonmembersMain {

	public static void main(String[] args) {
		NonMemberService service = new NonMemberServiceImpl();
		// 1. 목록 조회 2. 비회원 등록 3. 비회원 삭제 삭제 5. 종료
		
		for (boolean b = true ; b ;) {
			int input = nextInt("1. 목록 조회 2. 회원(비회원) 등록 3. 회원(비회원) 삭제 5. 종료\n");

			switch (input) {
			case 1:
				System.out.println("목록 조회입니다.");
				service.list();
				break;

			case 2:
				System.out.println("비회원 등록입니다.");
				service.register();
				break;

			case 3:
				System.out.println("비회원 삭제입니다.");
				service.remove();
				break;

			case 4:
				System.out.println("종료합니다.");
				b = false;
				break;

			default:
				System.out.println("올바른 번호를 입력하세요.");
				System.out.println();
				break;
			}
		}


	}

}
