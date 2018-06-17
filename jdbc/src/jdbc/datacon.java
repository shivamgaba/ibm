package jdbc;
import java.sql.*;
public class datacon {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from emp12");  
			//System.out.println(rs.getInt(1));
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
			}  
			}  