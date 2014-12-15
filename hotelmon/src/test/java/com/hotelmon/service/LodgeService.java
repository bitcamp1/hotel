package com.hotelmon.service;

public interface LodgeService {
	public void checkIn();
	
	public void showStatus(String input);
	
	public void searchRoom();
	
	public void update();
	
	public void checkOut();
	
	public String inputCheck(String input);
}
