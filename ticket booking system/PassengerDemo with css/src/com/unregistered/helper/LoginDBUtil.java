package com.unregistered.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.unregistered.model.Bus;

public class LoginDBUtil {

	private static boolean isSuccess;

	public static Bus validate(String BusNo, String password) {

		try {

			Connection con = DBConnect.getConnection();
			Statement stmt = con.createStatement();

			String sql = "select * from bus where BusNo='" + BusNo + "' and password='" + password + "'";

			ResultSet rs = stmt.executeQuery(sql);

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
				return c;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}
}
