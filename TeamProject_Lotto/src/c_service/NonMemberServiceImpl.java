package c_service;

import static c_utils.NonMemberUtil.*;

import java.util.ArrayList;
import java.util.List;

import c_vo.NonMembersVO;
import lottery.Check;

//기능 담당
public class NonMemberServiceImpl implements NonMemberService{
//	NonMembers[] arr2 = new NonMembers[100]; // 비회원
	List<NonMembersVO> members = new ArrayList<NonMembersVO>();
	
	@Override
	public void list() {
		System.out.println("조회 기능");
		System.out.println("이름\n 생년월일\n 전화번호\n");
		System.out.printf("==================================%n");
		
		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i));
		}
	}

	@Override
	public void register() {
		
		while(true) {
			System.out.println("등록 기능");
			String n = nextLine("이름: ");
			if(Check.nameCheck(n)) {
				members.add(new NonMembersVO(n));
				System.out.println("정상 등록 되었습니다.");
				break;
			} else {
				System.out.println("이름은 한글만 입력해주세요\n");
				continue;
			}
		}
		
		
		
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void remove() {
//		System.out.println("삭제 기능");
//		members.remove(finalIndexBy(nextLine("삭제할 비회원의 전화번호: ")));
//		System.out.println("삭제 완료 되었습니다.");
//	}
	
//	private Student findBy (String phone) {
//		Student student = null;
//		for (Student s : students) {
//			if (s.getNo().equals(no)) {
//				student = s;
//			}
//		}
//		return student;
//	}
//	
//	private int findIndexBy (String no) {
//		int ret = -1;
//		for (int i = 0; i < students.size(); i++) {	
//			if (students.get(i).getNo().equals(no)) {
//				ret = i;
//				break;
//			}
//		}
//		return ret;
//	}
			
	
	
	
	
}
