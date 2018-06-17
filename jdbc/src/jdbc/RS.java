package jdbc;
import java.sql.*;
import java.io.*;
public class RS {
	public static void main(String...args){
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement ps=con.prepareStatement
				("insert into emp12 values(?,?,?)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("enter user id");
			int id=Integer.parseInt(br.readLine());
			System.out.println("enter user name");
			String name=br.readLine();
			System.out.println("enter user SALARY");
			float salary=Float.parseFloat(br.readLine());
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setFloat(3, salary);
			int i=ps.executeUpdate();
			System.out.println(i+" row inserted");
			System.out.println("enter to continue (y/n)");
			String n=br.readLine();
			if(n.startsWith("n")){
			break;	
			}
		}while(true);
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
