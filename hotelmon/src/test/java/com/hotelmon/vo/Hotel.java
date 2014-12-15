package com.hotelmon.vo;

import java.util.*;

import com.hotelmon.controller.HotelController;

public class Hotel {
	public static String[][] name = new String[3][5]; // 투숙객 이름
	HotelController ck = new HotelController();

	public void alertMsg(int num) {
		switch (num) {
		case 1:
			System.out.println("\n!!! 숫자만 입력가능합니다 !!!");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("\n!!!! 1 ~ " + num + " 숫자만 입력 가능합니다. !!!!");
			process();
			break;

		case 6:
			System.out.println("\n!!! 그 방은 이미 예약중입니다 !!!");
			process();
			break;
		case 7:
			System.out.println("\n!!! 그 방은 이미 빈방입니다 !!!");
			process();
			break;
		case 9:
			System.out.println("\n!!! 프로그램을 종료합니다 !!!");
			break;
		}
	}

	

	public void showStatus() {
		System.out.println("\n\n\t***************  호텔의 투숙상태 *****************");
		// 중첩for if문
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				if (name[i][j] == null) {
					System.out.print("" + (i + 1) + "0" + (j + 1) + "호"
							+ " □\t" + "\t");
				} else {
					System.out.print("" + (i + 1) + "0" + (j + 1) + "호"
							+ " ■\t" + name[i][j] + "\t");
				}
			}
			System.out.println();
		}

	} // end

	public void process() {
		Scanner sc = new Scanner(System.in);

		int sel = 0;
		String input;

		while (true) {
			this.showStatus(); // 체크인 상태를 무조건 보면서 입실퇴실

			try {
				System.out.print("1.투숙  2.퇴실  3.전체보기  4.종료? ");
				input = sc.nextLine();

				sel = ck.inputCheck(input, 1, 4);
			} catch (Exception ex) {
				alertMsg(1); // 숫자만입력하세요
			}

			switch (sel) {
			case 1:
				ck.checkIn();
				break; // 체크인
			case 2:
				ck.checkOut();
				break; // 체크아웃
			case 3:
				this.process();
				break; // 현황보기
			case 4:
				alertMsg(9);
				System.exit(1); // 프로그램을 종료합니다.

			}

		} // while end
	}// end

	

	public void roomReset() { // 모든방 빈방으로 초기화시키기
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				name[i][j] = null;
			}
		}
	} // end

}// class END
