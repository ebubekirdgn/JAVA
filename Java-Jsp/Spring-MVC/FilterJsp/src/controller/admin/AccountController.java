package controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/admin/account")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AccountController()
	{
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		String action = request.getParameter("action");
		
		if (action == null)
			request.getRequestDispatcher("login.jsp").forward(request, response);
		
		else if (action.equalsIgnoreCase("logOut")) 
		{
			session.removeAttribute("username");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123"))
		{
			session.setAttribute("username", username);
			request.getRequestDispatcher("listProduct.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("message", "Account's Invalid");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}
