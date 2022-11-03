package a_finals;

import java.util.Date;

//여러 개의 값을 묶어서 표현하지 위한 클래스 - Value Object(VO)
//getter 와 constructor는 만들지만 setter는 만들지 않는 경우가 많음
//서버나 누군가가 제공해 주는 데이터를 읽을 목적으로 사용하기 때문

public class NonMembersVO {
	//이름, 생일, 전화번호 저장
	private String name;
	private String birthday;
	private String phone;
//	private static NonMembersVO[] arr2 = new NonMembersVO[100];
//	public static int index2;
//	int[] nonmemberArray = new int[3];
	
	//기본 생성자
	public NonMembersVO() {
		super();
	}
	
	
	public NonMembersVO(String name) {
		super();
		this.name = name;
	}

	//매개변수가 전부 있는 생성자
	public NonMembersVO(String name, String birthday, String phone) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getBirthday() {
		
		return birthday;
	}

	public String getPhone() {
		return phone;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	//값을 빠르게 확인하기 위한 메서드
	//디버깅을 위한 메서드 - 개발 과정 중 값을 확인하기 위한 목적
	//== 개발이 끝나면 불필요한 메서드
	@Override
	public String toString() {
		return "NonMembers" + "\n이름:" + name + "\n생일:" + birthday + "\n전화번호: " + phone + "\n"	;
	}

//	@Override 같은 내용인지 확인 - 전화번호
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//		NonMembersVO carVO = (CarVO) o;
//		return Objects.equals(color, carVO.color);
//	}


	
}
