package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import di.Check_Action;

@WebServlet("/Check/*")
public class Check_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
		
		System.out.println(request.getRequestURI());
		System.out.println(request.getContextPath());
		String CheckPath = request.getRequestURI().substring(
				(request.getContextPath()+"/Check/").length() );
		
		System.out.println(CheckPath);
		
		
		String[]arr = CheckPath.split("/");
		if(arr.length==0) {
			
			
		}
		
		
		Check_Action ChAction = (Check_Action)Class.forName("Check."+CheckPath).newInstance();
		ChAction.Check_Action(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("../Bank/Template.jsp");
			rd.forward(request, response);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
