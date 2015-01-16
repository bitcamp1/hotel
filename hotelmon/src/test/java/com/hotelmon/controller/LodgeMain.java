package com.hotelmon.controller;

import java.util.Scanner;

import com.hotelmon.vo.Hotel;
import com.hotelmon.vo.Motel;

public class LodgeMain {
	MotelController mtc = new MotelController();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		LodgeMain lm = new LodgeMain();
		//lm.getHotelProc();
		
		lm.getMotelProc();
		
	}

	public  void getHotelProc() {
		Hotel ht = new Hotel();
		ht.process();
	}
	public void getMotelProc(){
		System.out.println("\t◀◀◀모텔 숙박 관리시스템▶▶▶");
		MotelController mt = new MotelController();
		
		System.out.print("1.투숙  2.퇴실  3.map  4.종료? ");
		String input = sc.nextLine();
		mtc.showStatus(input);
		
	}
	public void process(String input){
		String sel = input;
		while(true){
			mtc.showStatus(input);
			//System.out.println("\t모텔 숙박 관리");
			//System.out.print("1.투숙  2.퇴실  3.map  4.종료? ");
			
		//	sel = mtc.inputCheck("4");  4로 고정이 이상한데 ??
			
			switch(sel){
				case "1":	//투숙
					System.out.print(">몇층에 투숙? ");
					mtc.checkIn();
					break;
				case "2":	//퇴실
					mtc.checkOut();
					break;
				case "3":	//전체보기
					mtc.showStatus(input);
					break;
				case "4":
					System.out.println("종료하겠습니다.");
					return ;
			}
			
		}//while end
}
}
