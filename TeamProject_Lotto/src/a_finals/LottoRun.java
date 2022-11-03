package a_finals;

public class LottoRun {
	public void run() {
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
        System.out.print("----------내 번호 : ");
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
			System.out.println("\n-----당첨!-----");
		}else {
			System.out.println("\n-----낙첨 되셨습니다-----");
		}
	}
}
