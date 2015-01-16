package com.hotelmon.controller;

import java.util.Scanner;

import com.hotelmon.vo.Hotel;

public class HotelController {
	private int floor;
	private int room;
	public static String[ ] [ ] name = new String[3][5];		//투숙객 이름
	
	Hotel hotel = new Hotel();
	
	
	public void checkIn(){
		Scanner sc = new Scanner(System.in);
		String ro, fl, guestName;
		
		while(true){
			try{
				
				System.out.print("몇층에 입실? ");
				fl = sc.nextLine();
				floor = this.inputCheck(fl, 1, 3);
				if ( floor == 0) continue; 	// 0 이 넘어왔다면 while 문으로 돌아가 입력을 다시 받는다

				System.out.print("몇호에 입실? ");
				ro = sc.nextLine();
				room = this.inputCheck(ro, 1, 5);
				if ( room == 0) continue;	// 0 이 넘어왔다면 while 문으로 돌아가 입력을 다시 받는다
				
				if ( name[floor-1][room-1] != null){	//이미 이름이 있다면(예약중)
					hotel.alertMsg(6);
					continue;								//입실하지 않고, 입력을 다시받는다.
				}else{										
															//이름이 없다면 checkIn 시킨다.							
					System.out.print("고객님 이름? ");
					guestName = sc.nextLine();
					
					name[floor-1][room-1] = guestName;
					
					System.out.println( guestName + "님 checkIn 완료 되셨습니다");
					break;
					
				}
			}catch(Exception ex){
				hotel.alertMsg(1);							// int 데이터형에 문자가 들어왔을경우 예외처리
														// 숫자만 입력하세요.
			}
				
		} //while end
	}
	
	public void list(){}
	
	public void update(){}
	
	public void searchRoom(){}
	
	public void checkOut(){
		Scanner sc = new Scanner(System.in);
		String ro, fl, guestName;
		boolean exit=true;
		while(exit){
			try{
				
				System.out.print("몇층에서 퇴실? ");
				fl = sc.nextLine();
				floor = this.inputCheck(fl, 1, 3);
				if ( floor == 0) continue; 		// 0 이 넘어왔다면 입력을 다시 받는다

				System.out.print("몇호에서 퇴실? ");
				ro = sc.nextLine();
				room = this.inputCheck(ro, 1, 5);
				if ( room == 0) continue;		// 0 이 넘어왔다면 입력을 다시 받는다
				
				if ( name[floor-1][room-1] == null){		//방에 이름이 없다면..	
					hotel.alertMsg(7);								//이미 빈방입니다 메세지
					continue;									//퇴실처리 다시
				}else{
					guestName = name[floor-1][room-1];		//방에 이름이 있다면 해당 배열주소 null처리
					name[floor-1][room-1] = null;
					
					System.out.println(guestName + "님 checkOut 완료 되셨습니다");
					break;
					
				}
			}catch(Exception ex){
				hotel.alertMsg(1);							// int 데이터형에 문자가 들어왔을경우 예외처리(숫자만)
			}
				
		} //while end
		
	}
	
	
	
	public int inputCheck(String input, int first, int last){
		int sel = Integer.parseInt(input);
		
		if ( sel < first || sel > last ){			//범위값 외의 숫자를 입력했을경우
			if ( last == 4 ) hotel.alertMsg(4);		//초기메뉴 (1~4)에서 범위값 외의 수를 입력했을경우
			else if ( last == 3 ) hotel.alertMsg(3);	//층수	(1~3)에서 범위값 외의 수를 입력했을경우
			else if ( last == 5 ) hotel.alertMsg(5);	//호수(1~5)에서 범위값 외의 수를 입력했을경우
			
			else return 0;	// 0을 리턴
		}
		
		return sel; //올바른 값을 입력했을경우 입력받은 수를 리턴한다
	}
	
}
