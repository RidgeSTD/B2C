package edu.winlandiano;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Database.DB;
import model.NBOrder;
import model.NBOrderInfo;
import model.NBOrderWrap;
import model.NBProduct;
import model.NBUser;
import model.NBUserAddress;

public class MakeOrder extends HttpServlet {
	public MakeOrder() {
		super();
	}

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
		HttpSession session = request.getSession();
		DB db = DB.getInstance();
		ArrayList<NBProduct> cart = (ArrayList<NBProduct>)session.getAttribute("cart");
		double totalPrice = 0;
		ArrayList<NBOrderInfo> orderList = new ArrayList<NBOrderInfo>();
		NBUser user = db.getNBUserByEmail((String)session.getAttribute("userEmail"));
		
		for (NBProduct eachNbProduct : cart){
			totalPrice += eachNbProduct.getPrice()*eachNbProduct.getDiscount();
			NBOrderInfo tmpInfo = new NBOrderInfo(0, eachNbProduct.getId(), 1);
		}
		
		Calendar calendar = Calendar.getInstance();		
		Date today = new Date(calendar.get(calendar.YEAR),calendar.get(calendar.MONTH),calendar.get(calendar.DATE));
		NBOrder newOrder = new NBOrder(0, user.getId(), today, 0, (int)totalPrice, 1);
		NBUserAddress orderAddress = db.getNBUserAddressByID(1);
		NBOrderWrap wrap = new NBOrderWrap(newOrder, orderList, user, orderAddress);
		wrap.save();
		request.setAttribute("totalPrice", totalPrice);
		response.sendRedirect("/B2C/order_success.jsp");
	}

	public void init() throws ServletException {
	}

}
