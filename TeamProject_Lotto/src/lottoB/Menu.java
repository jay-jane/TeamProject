package lottoB;

	import java.util.Scanner;
	 
	public class Menu {
	 
	    public String Select() {
	        
	        System.out.println("시작 하려면 아무 키나 눌려주세요.");
	        Scanner sc = new Scanner(System.in);
	        String key = sc.nextLine();
	        System.out.println("로또 추첨을 시작합니다.");
	        return key;
	    }
	}
