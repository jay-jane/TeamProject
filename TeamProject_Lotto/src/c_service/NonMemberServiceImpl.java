package c_service;

import java.util.ArrayList;
import java.util.List;


//기능 담당
public class NonMemberServiceImpl {
	NonMemberUtil nmu = new NonMemberUtil();
	NonMembersVO nmv = new NonMembersVO();
	
	public void register() {
	w:while(true) {
		
		try {
			
		n:while(true) {
			String a = nmu.nextLine("이름: ");
			if(Check.nameCheck(a)) {
				nmv.setName(a);
				break;
			} else {
				System.out.println("이름은 한글만 입력해주세요\n");
				continue n;
			}
		}
		
		
		b:while(true) {
			String b = nmu.nextLine("생년월일(YYYY/MM/dd) : ");
			if(Check.birthCheck(b)) {
				nmv.setBirthday(b);
				break;
			} else {
				System.out.println("생년월일은 숫자만 입력해주세요\n");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
				continue b;
			}
		}
			
		p:while(true) {
			String c = nmu.nextLine("전화번호 : ");
			if(Check.phoneCheck(c)) {
				nmv.setPhone(c);
				System.out.println("비회원 가입 완료");
				break w;
			
			} else {
				System.out.println("전화번호는 숫자 11자리만 입력해주세요\n");
				continue p;
			}
		}
		
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

	
}
}
