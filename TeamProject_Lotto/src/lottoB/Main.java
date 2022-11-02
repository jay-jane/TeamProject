package lottoB;

public class Main {
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Machine machine = new Machine();
        Menu menu = new Menu();
        lotto.random();
        while (true) {
            String key = menu.Select();
 
            if (key != null) {
                machine.start();
                break;
            }
        }
        
        int[] lot = lotto.lottoNum;
        int[] ballNum = machine.ball;
        int result = 0;
        for(int i = 0; i < 6; i++) {
        	if(lot[i] == ballNum[i]) {
        		result = 1;
        		System.out.print(lot[i] + " ");
        	}else {
        		result = 0;
        		System.out.print(lot[i] + " ");
        	}
        }
        if(result == 1) {
        	System.out.println("\n당첨 되셨습니다");
        }else {
        	System.out.println("\n낙첨 되셨습니다");
        }
	}
}
