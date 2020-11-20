package com.unregistered.helper;

import java.sql.Connection;
import java.sql.Statement;

public class CustomerDBUtil{

	public static boolean insertcustomer(String fullname,String email,String phone,String username,String password) {
		
		boolean isSuccess = false;
			try {
				
				Connection con = DBConnect.getConnection();
				Statement stmt = con.createStatement();
				String sql = "insert into customer values (0,'"+fullname+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
				int rs = stmt.executeUpdate(sql); 
				
				if(rs > 0) {
					isSuccess = true;
				}
				else {
					isSuccess = false;
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		
		return isSuccess;
	}
	 
}  
