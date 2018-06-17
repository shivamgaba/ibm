package jdbc;

import java.sql.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(  
					"jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from crediantials");
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2));
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
