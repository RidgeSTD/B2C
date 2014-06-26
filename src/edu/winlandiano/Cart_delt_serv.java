package edu.winlandiano;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Cart_delt_serv extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Cart_delt_serv() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] parameter = request.getQueryString().split("=");
		int index = Integer.parseInt(parameter[parameter.length-1]);
		HttpSession session = request.getSession();
		ArrayList<Integer> cart = (ArrayList<Integer>)session.getAttribute("cart");
		cart.remove(index);
		response.sendRedirect("/B2C/web/cart_list.jsp");
	}

	public void init() throws ServletException {
	}

}
