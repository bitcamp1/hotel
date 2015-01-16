package com.hotelmon.controller;

import com.hotelmon.serviceImpl.MotelServiceImpl;

public class MotelController {
	MotelServiceImpl motel = new MotelServiceImpl();
	private int floor;	//층	//3층까지
	private int room;	//호	//5호까지
	String name[][] = new String[3][5];	//투숙객
	
public void checkIn(){
		
	}//end
	
	public void showStatus(String input){
		motel.showStatus(input);
	} //end
	
	public void search(){}
	public void update(){}
	public void checkOut(){
		
	}//end
	
	public String inputCheck(String input){
		String temp="";
		return temp;
	}//end
	
	
	
	
}
