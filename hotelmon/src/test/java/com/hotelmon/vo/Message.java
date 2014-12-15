package com.hotelmon.vo;

public class Message {
	private String onlyInputNum;
	private String askRoonNum;
	private String askFloorNum;
	private String reservation;
	private String programClosing;
	private String processClosing;
	private String askCustName;
	
	public String getAskFloorNum() {
		return askFloorNum;
	}
	public void setAskFloorNum(String askFloorNum) {
		this.askFloorNum = "몇 층에 입실";
	}
	public String getOnlyInputNum() {
		return onlyInputNum;
	}
	public void setOnlyInputNum(String onlyInputNum) {
		this.onlyInputNum = "숫자만 입력가능합니다.";
	}
	public String getAskRoonNum() {
		return askRoonNum;
	}
	public void setAskRoonNum(String askRoonNum) {
		this.askRoonNum = "몇 호에 입실?";
	}
	public String getReservation() {
		return reservation;
	}
	public void setReservation(String reservation) {
		this.reservation = "그 방은 이미 예약중입니다.";
	}
	public String getProgramClosing() {
		return programClosing;
	}
	public void setProgramClosing(String programClosing) {
		this.programClosing = "프로그램을 종료합니다.";
	}
	public String getProcessClosing() {
		return processClosing;
	}
	public void setProcessClosing(String processClosing) {
		this.processClosing = "완료되셨습니다.";
	}
	public String getAskCustName() {
		return askCustName;
	}
	public void setAskCustName(String askCustName) {
		this.askCustName = "고객의 이름은 무엇입니까?";
	}
	
}
