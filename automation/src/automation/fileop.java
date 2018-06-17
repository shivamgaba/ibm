package automation;
import java.io.*;
public class fileop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users/IBM_ADMIN/Desktop/shivam.txt");
		BufferedReader bf=null;
		try{
		 bf=new BufferedReader(new FileReader(file));
		 String line=bf.readLine();
		 int i=0;
		// while((i=bf.read())!=-1){
		while(line != null)	{
		 //read line
			System.out.println(line);
			line=bf.readLine();
			// break;
		 }
	}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
