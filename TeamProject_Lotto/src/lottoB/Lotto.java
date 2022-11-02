package lottoB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto extends Main{
	Scanner scan = new Scanner(System.in);
	int lottoNum[] = new int [6];
	public int[] random() {
		while(true) {
			System.out.println("========================");
			System.out.println("1. 자동 추첨 || 2. 수동 입력");
			System.out.println("========================");
			System.out.print("> ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1 : 
				System.out.println("자동 추첨을 시작합니다");
				// 번호 생성
				for(int i=0; i<6; i++) {
					lottoNum[i] = (int)(Math.random() * 45) + 1;

					// 중복 번호 제거
					for(int j=0; j<i; j++) {
						if(lottoNum[i] == lottoNum[j]) {
							i--;
							break;
						}
					}
				}
				System.out.print("로또 번호 : ");
				// 번호 출력
				Arrays.sort(lottoNum);
				for(int i=0; i<6; i++) {
					System.out.print(lottoNum[i] + " ");
				}	
				System.out.println();

				break;
			case 2 : //수동으로 입력
				System.out.println("수동으로 입력합니다");
				System.out.print("> ");
				for(int i = 0; i < 6; i++) {
					lottoNum[i] = scan.nextInt();
					for(int j = 0; j < i; j++) {
						if(lottoNum[i] == lottoNum[j]) {
							i--;
							break;
						}
					}

				}
				System.out.print("로또 번호 : ");

				// 번호 출력
				Arrays.sort(lottoNum);
				for(int i=0; i<6; i++) {
					System.out.print(lottoNum[i] + " ");
				}	
				System.out.println();

				break;
			} 
			return lottoNum;
		}
	}

}
