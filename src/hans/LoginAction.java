package hans;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Database.DB;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginAction() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userEmail = request.getParameter("name");
		String userPassword = request.getParameter("password");
		
		//if(DB.getInstance().validataUser(userEmail, userPassword)==1)
		if(userEmail.equals("admin")&&userPassword.equals("admin"))
		{
			request.getSession().setAttribute("userEmail","michael@163.com");//TODO 
			response.sendRedirect("/B2C/web/html/home.jsp");
		}
		else
		{
			System.out.println("LoginFail");
			response.sendRedirect("/B2C/web/html/login.jsp");
		}
		
	}

}
