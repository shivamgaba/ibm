package com.durgasoft;
import java.sql.*;


public class Conndb {
	String name="";
	public String take(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			PreparedStatement ps=con.prepareStatement
					("select * from crediantials");
			//ps.setString(1, uname);
			ResultSet rs=ps.executeQuery();
		while(rs.next()){
			//System.out.println(rs.getString(1));
			 name=rs.getString(1);
			//System.out.println(name);
		}
		
		}
		catch(Exception e){e.printStackTrace();}
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try{
		
			Conndb cb=new Conndb();
			String name=cb.take();
			System.out.println(name);
	}

}
