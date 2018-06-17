package controller;
//import model;
import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;

/**
 * Servlet implementation class serv1
 */
@WebServlet("/serv1")
public class serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	    PrintWriter pw=response.getWriter();
	  //  initialdata ob=new initialdata("shivam",1,955725934);
	   // ob.Setid(1);ob.Setname("shivam");ob.Setphone(955725934);
	    //int id=ob.Getid();
	    //String name=ob.Getname();
	    //int phone= ob.Getphone();
	  //  ArrayList list=new ArrayList();//Creating arraylist  
	//	  list.add(id);//Adding object in arraylist  
		//    list.add(name);
		  //  list.add(phone);
		  //Traversing list through Iterator  
		  //Iterator itr=list.iterator();  
		 // while(itr.hasNext()){  
		   //pw.println(itr.next());  
		  }  
		 	
	 
	//}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
}
