package com.hotelmon.serviceImpl;

import java.util.Scanner;

import com.hotelmon.service.LodgeService;
import com.hotelmon.vo.Motel;

public class MotelServiceImpl implements LodgeService{
	Motel motel = new Motel();
	String floor = motel.getFloor();
	String room = motel.getFloor();
	String[][] name = motel.getName();
	int intFloor = Integer.parseInt("3");
	int intRoom = Integer.parseInt("5");
	
	
	@Override
	public void checkIn() {
		System.out.print("> 몇층에 투숙? ");
		Scanner sc = new Scanner(System.in);
		floor = inputCheck("3");		
		System.out.print("> 몇호에 투숙? ");
		this.room = inputCheck("5");
		if( this.name[intFloor-1][intRoom-1] != null ){
			System.out.println("# 이미 투숙중인 방입니다.");
			return ;
		}
		System.out.print("> 투숙객 이름? ");
		this.name[intFloor-1][intRoom-1] =sc.nextLine(); 
		System.out.println("# 성공적으로 checkIn 되었습니다.");
		
	}

	@Override
	public void showStatus(String input) {
		System.out.println("\t[ 모텔의 투숙 상태 ]");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++){
				System.out.print((i+1)+"0"+(j+1)+"\t");
			}
			System.out.println("");
			for(int j = 0; j < 5; j++){
				if(this.name[i][j] == null){
					System.out.print("\t");
					continue;
				}
				System.out.print(this.name[i][j]+"\t");
			}
			System.out.println("");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		System.out.println("");
		
	}

	@Override
	public void searchRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkOut() {
		System.out.print("> 몇층에서 퇴실? ");
		floor = inputCheck("3");
		System.out.print("> 몇호에서 퇴실? ");
		room = inputCheck("5");
		if( this.name[intFloor-1][intRoom-1] == null ){
			System.out.println("# 이미 빈 방입니다.");
			return ;
		}
		this.name[intFloor-1][intRoom-1] = null;
		System.out.println("# 성공적으로 checkOut 되었습니다.");
		
	}


	@Override
	public String inputCheck(String input) {
		
		int checkTarget = Integer.parseInt(input);
		int limit=0;
		
		while(true){
			if(checkTarget <= limit && checkTarget > limit){
				return String.valueOf(checkTarget);
			}else {
				System.out.println("범위에 맞는 숫자를 다시 입력해주세요");
			}
			
		} //while end
	}

}
