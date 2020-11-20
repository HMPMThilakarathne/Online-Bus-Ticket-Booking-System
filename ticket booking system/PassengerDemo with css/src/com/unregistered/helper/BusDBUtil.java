package com.unregistered.helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.unregistered.model.Bus;

public class BusDBUtil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static List<Bus> validate(String BusNo, String password) {

		ArrayList<Bus> cus = new ArrayList<>();

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from bus where BusNumber='" + BusNo + "' and password='" + password + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int busID = rs.getInt(1);
				String ownerName = rs.getString(2);
				String contactNo = rs.getString(3);
				String ownerEmail = rs.getString(4);
				String busNo = rs.getString(5);
				String BType = rs.getString(6);
				String NoOfSeats = rs.getString(7);
				String Password = rs.getString(8);

				Bus c = new Bus(busID, ownerName, contactNo, ownerEmail, BusNo, BType, NoOfSeats, password);
				cus.add(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cus;

	}

	public static boolean insertdetails(String ownerName, String contactNo, String ownerEmail, String BusNo,
			String BType, String NoOfSeats, String password) {

		boolean isSuccess = false;

		try {
			Connection con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into bus values (0,'" + ownerName + "','" + contactNo + "','" + ownerEmail + "','"
					+ BusNo + "','" + BType + "','" + NoOfSeats + "','" + password + "')";
			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	public static boolean updateBus(String id, String name, String contact, String email, String BNo, String BType,
			String seats, String Password) {

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update bus set ownerName='" + name + "',contactNo='" + contact + "',ownerEmail='" + email
					+ "',BusNo='" + BNo + "',BType='" + BType + "',NoOfSeats='" + seats + "',password='" + Password + "'"
					+ "where busID ='" + id + "'";
			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;

	}

	public static Bus getBusDetails(String busID) {

		int convertedBusID = Integer.parseInt(busID);

		try {

			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from bus where busID = '" + convertedBusID + "'";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int busId = rs.getInt(1);
				String ownerName = rs.getString(2);
				String contactNo = rs.getString(3);
				String ownerEmail = rs.getString(4);
				String busNo = rs.getString(5);
				String BType = rs.getString(6);
				String NoOfSeats = rs.getString(7);
				String Password = rs.getString(8);

				Bus c = new Bus(busId, ownerName, contactNo, ownerEmail, busNo, BType, NoOfSeats, Password);
				return c;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}
	
	
	public static boolean deleteBus(String busID) {
		
		int convertedBusID = Integer.parseInt(busID);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from bus where busID = '" + convertedBusID + "'";
			int rs = stmt.executeUpdate(sql);
			
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess; 
	
}
	
}


