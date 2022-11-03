package a_job;

public class Customer { //회원 정보 입력
	
	private static String id, pw, name, birth, phone;
	
	public Customer() {
	}
	
	public Customer(String id, String pw, String name, String birth, String phone) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.phone = phone;
	}

	public static String getId() {
		return id;
	}

	public static String getName() {
		return name;
	}

	public static String getBirth() {
		return birth;
	}

	public static String getPhone() {
		return phone;
	}
	
	
	public static String getPw() {
		return pw;
	}

	public static void setPw(String pw) {
		Customer.pw = pw;
	}

	public static void setId(String id) {
		Customer.id = id;
	}

	public static void setName(String name) {
		Customer.name = name;
	}

	public static void setBirth(String birth) {
		Customer.birth = birth;
	}

	public static void setPhone(String phone) {
		Customer.phone = phone;
	}

	public String toString() {
		return "-----회원 정보-----\n" 
	+ "ID : " + id + "\n이름 : " + name + "\n생년월일 : "
				+ birth + "\n연락처 : " + phone;
	}
	
	public void getInfo() {
		System.out.println("-----회원 정보-----");
		System.out.println("ID : " + id);
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + birth);
		System.out.println("연락처 : " + phone);
	}
	
	
}
