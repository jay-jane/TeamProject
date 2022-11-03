package a_finals;

import java.util.Arrays;
import java.util.Random;

@SuppressWarnings("serial")
public class Machine extends Random {

	int[] ball = new int[6];
	boolean check = true;
	Machine machine;
	public void start()
	{
		if(machine == null)
			machine = new Machine();

		machine.comeDown();
		machine.ballInfo();
	}



	public int nextInt(int max) {
		return super.nextInt(max) + 1;
	}

	//랜덤으로 45 숫자 뽑기
	public int run() {

		int num = this.nextInt(45);

		return num;
	}

	//중복 체크
	public boolean check(int num) {

		for (int i = 0; i < ball.length; i++) {
			if (ball[i] == num) {
				check = false;
				break;
			} else {
				check = true;
			}
		}
		return check;
	}

	//중복 체크 후 배열에 값 넣기
	public int[] comeDown() {
		for (int i = 0; i < ball.length; i++) {
			int num = run();
			if (check(num)) {
				ball[i] = num;
				System.out.println((i + 1) + "번 공은 " + num + " 입니다.");

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else {
				i--;
			}
		}
		return ball;
	}

	//배열 전체 출력
	public void ballInfo()
	{
		System.out.print("이번 주의 당첨 번호는 ");
		System.out.print(Arrays.toString(ball));
		System.out.println("입니다. 축하드립니다~");
	}
}
