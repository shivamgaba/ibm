package controller;
import model.initialdata;
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class serv2
 */
@WebServlet("/serv2")
public class serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String spageid=request.getParameter("page");
		int pageid=Integer.parseInt(spageid);
		int total=1;
		if(pageid==1){}
		else{
			pageid=pageid-1;
			pageid=pageid*total+1;
		}
		initialdata ob=new initialdata("shivam","1","9557259343");
		ArrayList<String> list=new ArrayList<String>();
		ob.Setname("shivam");ob.Setid("1");ob.Setphone("955725934");
		String name=ob.Getname();
		String id=ob.Getid();
		String ph=ob.Getphone();
		//out.println(ob.Getname());
		/*
		//List<initialdata> ob2=new List<initialdata>();
		Iterator it=list.iterator();
		while(it.hasNext()){
			list.add(ob);
		}*/
		list.add(name);
		list.add(id);
		list.add(ph);
		
		ob.Setname("kashish");ob.Setid("2");ob.Setphone("9988675652");
		name=ob.Getname();
		id=ob.Getid();
		ph=ob.Getphone();
		list.add(name);
		list.add(id);
		list.add(ph);
		out.println(list);
		out.print("<h1>Page no."+spageid+"</h1>");
		out.print("<table border='1' cellpadding='4' width=''>");
		out.print("<tr><td>cust_id</td><td>name</td><td>phone</td>");
		//for(String e:list){
		for(int i=0;i<list.size();){
			if(pageid==1){
		out.print("<tr><td>"+list.get(i)+"</td><td>"+list.get(i+1)+"</td><td>"+list.get(i+2)+"</td></tr>");
			break;
			}	
			else if(pageid==2){
			i=i+3;
			out.print("<tr><td>"+list.get(i)+"</td><td>"+list.get(i+1)+"</td><td>"+list.get(i+2)+"</td></tr>");
			break;
			}
			else{
				i=i+3;
			}
		}
		out.print("</table>");
		out.print("<a href='serv2?page=1'>1</a>");
		out.print("<a href='serv2?page=2'>2</a>");
		out.print("<a href='serv2?page=3'>3</a>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
