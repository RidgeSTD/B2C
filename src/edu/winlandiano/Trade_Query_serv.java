package edu.winlandiano;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.NBOrder;
import Database.DB;

public class Trade_Query_serv extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Trade_Query_serv() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@SuppressWarnings("deprecation")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int a = 2;
		a = 3;
		a = 4;
		System.out.println((String)request.getParameter("year_st"));
		System.out.println((String)request.getParameter("month_st"));
		System.out.println((String)request.getParameter("day_st"));
		System.out.println((String)request.getParameter("pay"));
		
		
		int year_st = Integer.parseInt((String)request.getParameter("year_st"));
		int month_st = Integer.parseInt((String)request.getParameter("month_st"));
		int day_st = Integer.parseInt((String)request.getParameter("day_st"));
		Date st_date = new Date(year_st, month_st, day_st);
		
		int year_en = Integer.parseInt((String)request.getParameter("year_en"));
		int month_en = Integer.parseInt((String)request.getParameter("month_en"));
		int day_en = Integer.parseInt((String)request.getParameter("day_en"));
		Date en_date = new Date(year_en, month_en, day_en);
		
		int state = 0;
		String stateString = (String)request.getParameter("buy");
		if ("已支付".equals(stateString)){
			state = 1;
		}
		else{
			state = 0;
		}
		
		DB db = DB.getInstance();
		HttpSession session = request.getSession();
		ArrayList<NBOrder> orderList = db.getNBOrdersByUserEmail((String)session.getAttribute("userEmail"));
		for(NBOrder order : orderList){
			if (order.getOrderDate().after(en_date)){
				orderList.remove(order);
			}
			if (order.getOrderDate().before(st_date)){
				orderList.remove(order);
			}
			if (order.getState()!=state){
				orderList.remove(order);
			}
		}
		session.setAttribute("orderList_hwl", orderList);
		response.sendRedirect("/B2C/web/html/order_list.html");
	}

	public void init() throws ServletException {
	}

}
