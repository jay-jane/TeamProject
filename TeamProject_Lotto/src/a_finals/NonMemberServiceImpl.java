package a_finals;

import java.util.ArrayList;
import java.util.List;


//기능 담당
public class NonMemberServiceImpl {
	NonMemberUtil nmu = new NonMemberUtil();
	NonMembersVO nmv = new NonMembersVO();

	public void register() {
		
		LottoRun lottoRun = new LottoRun();
		w:while(true) {

			try {

				n:while(true) {
					String a = nmu.nextLine("이름: ");
					if(Check.nameCheck(a)) {
						nmv.setName(a);
						break;
					} else {
						System.out.println("-----이름은 한글만 입력해주세요-----");
						continue n;
					}
				}


				b:while(true) {
					String b = nmu.nextLine("생년월일(YYYYMMdd) : ");
					if(Check.birthCheck(b)) {
						if(Check.ageCheck(b)) {
							nmv.setBirthday(b);
							break;
						} else {
							System.out.println("-----미성년자를 구매할 수 없습니다-----");
							System.out.println("-----프로그램을 종료합니다-----");
							break w;
						}
					} else {
						System.out.println("-----생년월일은 숫자만 입력해주세요-----");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
						continue b;
					}
				}

				p:while(true) {
					String c = nmu.nextLine("전화번호 : ");
					if(Check.phoneCheck(c)) {
						nmv.setPhone(c);
						System.out.println("-----확인 완료-----");
						System.out.println("-----비회원으로 진행합니다-----");
						lottoRun.run();
						break w;

					} else {
						System.out.println("-----전화번호는 숫자 11자리만 입력해주세요-----");
						continue p;
					}
				}

			} catch(Exception e) {
				System.out.println(e.getLocalizedMessage());
			}

		}


	}
}
