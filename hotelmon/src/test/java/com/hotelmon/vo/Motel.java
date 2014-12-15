package com.hotelmon.vo;

import java.util.Scanner;

import com.hotelmon.controller.MotelController;


public class Motel {
	private String floor;	//층	//3층까지
	private String room;	//호	//5호까지
	String name[][] ;	//투숙객

	public String[][] getName() {
		return name;
	}

	public void setName(String[][] name) {
		this.name = name;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	

} //class END
