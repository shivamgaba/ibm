package pack2;
import java.io.*;
//import javax.servlet.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	    //request.getRequestDispatcher("indexx.html").include(request,response);
		String name=request.getParameter("a1");	
		String pwd=request.getParameter("a2");
		if(pwd.equals("shivam") || pwd.equals("gaba")){
			request.getRequestDispatcher("link.html").include(request,response);
			out.println("welcome"+name);
			HttpSession sess=request.getSession();
			sess.setAttribute("name", name);
			System.out.println("------------"+sess);
		}
		else{
			out.println("sorry, wrong user/pwd");
			request.getRequestDispatcher("indexx.html").include(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
