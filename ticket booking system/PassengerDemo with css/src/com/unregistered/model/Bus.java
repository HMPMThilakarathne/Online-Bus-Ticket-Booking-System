package com.unregistered.model;

public class Bus {
	private int busID;
	private String ownerName;
	private String contactNo;
	private String ownerEmail;
	private String busNo;
	private String BType;
	private String noOfSeats;
	private String password;

	public Bus(int busID, String ownerName, String contactNo, String ownerEmail, String busNo, String bType,
			String noOfSeats, String password) {
		super();
		this.busID = busID;
		this.ownerName = ownerName;
		this.contactNo = contactNo;
		this.ownerEmail = ownerEmail;
		this.busNo = busNo;
		this.BType = bType;
		this.noOfSeats = noOfSeats;
		this.password = password;
	}

	public int getBusID() {
		return busID;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public String getBusNo() {
		return busNo;
	}

	public String getBType() {
		return BType;
	}

	public String getNoOfSeats() {
		return noOfSeats;
	}

	public String getPassword() {
		return password;
	}

}