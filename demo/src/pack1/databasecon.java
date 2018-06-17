package pack1;

import java.sql.*;


public class databasecon {
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(  
					"jdbc:oracle:thin:@localhost:1521:xe","hr","hr"); 
		/*	PreparedStatement ps=con.prepareStatement("insert into emp24 values(?,?,?,?,?,?,?)");
			ps.setInt(1, 2004); 
			ps.setString(2, "shivam");
			ps.setString(3, "gaba");
			ps.setString(4, "M");
			ps.setString(5, "engg");
			ps.setInt(6,2 );
			ps.setInt(7, 21000);
			ps.executeUpdate();
			System.out.println("data inserted check table in db");*/
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from emp12");  
			while(rs.next()){  
			System.out.println(rs.getInt(1));  
			}
			}
		catch(SQLException e){
			System.out.println("error");
		}
	}
}
