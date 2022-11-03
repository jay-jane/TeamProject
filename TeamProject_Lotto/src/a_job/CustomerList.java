package a_job;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerList {
//	private final static int MAX_INT = 100;
//	private static int cnt;
	private List<Customer> list = new ArrayList<>();
	
	public void showList() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	void inputCustomerInfo() {
		
		Customer cs = new Customer();
		w:while(true) {
			try {
				id:while(true) {
					System.out.print("ID : ");
					String inputId = CustomerMain.sc.nextLine();
					if(Check.idCheck(inputId)) {
						cs.setId(inputId);
						break;
					} else {
						System.out.println("ID는 영문과 숫자 포함, 6~12자리를 입력하세요");
						continue id;
					}
					
				}
				pw:while(true) {
					System.out.print("비밀번호 : ");
					String inputPw = CustomerMain.sc.nextLine();
					if(Check.pwCheck(inputPw)) {
						cs.setPw(inputPw);
						break;
					} else {
						System.out.println("비밀번호는 8~12자 사이, 영문과 숫자, 특수문자를 포함해야 합니다");
						continue pw;
					}
					
				}
				name:while(true) {
					System.out.print("이름 : ");
					String inputName = CustomerMain.sc.nextLine();
					if(Check.nameCheck(inputName)) {
						cs.setName(inputName);
						break;
					} else {
						System.out.println("한글만 입력해주세요");
						continue name;
					}
					
				}
				birth:while(true) {
					System.out.print("생년월일(YYYYMMdd) : ");
					String inputBirth = CustomerMain.sc.nextLine();
					if(Check.birthCheck(inputBirth)) {
						cs.setBirth(inputBirth);
						break;
					} else {
						System.out.println("생년월일은 숫자만 입력해주세요");
						continue birth;
					}
					
				}
				phone:while(true) {
					System.out.print("연락처 : ");
					String inputPhone = CustomerMain.sc.nextLine();
					if(Check.phoneCheck(inputPhone)) {
						cs.setPhone(inputPhone);
						list.add(cs);
						break w;
					} else {
						System.out.println("하이픈(-) 제외 13자리를 입력해주세요");
						continue phone;
					}
				}
			} catch (Exception e) {
				e.getLocalizedMessage();
			}
		}
	}
	
	
	void CustomerInfo() {
		for(Customer c : list) {
		System.out.println(c);
		}
	}
	
	
}