<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page pageEncoding = "UTF-8"%>
<%@page import="model.*,java.util.*,Database.*"%>
<html>
<head>
<title>BC2商城</title>
<link href="../css/frame.css" rel="stylesheet" type="text/css">
</head>

<body>
<%@ include file="header.jsp" %>
	<div id="banner"></div>
	
	
	<%
	DB db = DB.getInstance();
	System.out.println("hahaha!the session = "+(String)session.getAttribute("userEmail"));
	int i=1;
	i=2;
	NBUser user = db.getNBUserByEmail((String)session.getAttribute("userEmail"));
	ArrayList<NBOrder> orderList = db.getNBOrdersByUserEmail((String)session.getAttribute("userEmail"));
	%>
	
	<jsp:useBean id="credit" class="model.NBUser" scope="request"></jsp:useBean>
	<div id="main">
		<div id="search2">
			<div id="searchleft">
				<img src="../image/ico_site.jpg"  id="ico_site"/>
				网站路径：<a href="home.jsp">首页</a>&gt;&gt;<a href="">积分查询</a>
			</div>
			<div id="searchright2">
			  <input type="text" name="product" id="textInput"/>
			  <input type="button" name="Submit" value="搜索" id="searchbutton" onClick="javascript:window.open('item_search_list.jsp','_parent','')">
			</div>
			<div id="searchright1">
			  <select name="category" id="searchrightcategory">
				<option value="5">所有类别</option>
                <option value="1">图书音像</option>
                <option value="2">时尚生活</option>
                <option value="3">饰品配件</option>
                <option value="4">数码产品</option>
              </select>
			  </div>
		</div>
		<div id="sendnote">
			<div id="sendnotehead"><strong>当前积分<%=credit.getScore() %></strong></div>
			<div id="sendnotecontent">
				<table id="creditquery">
				<caption>
				积分明细
				</caption>
				<thead>
					<tr>
						<th>订单号</th>
						<th>下单时间</th>
						<th>订单金额</th>
						<th>获得积分</th>
					</tr>
				</thead>
				<tbody>
				<%
				System.out.println(orderList.toString());
				for (NBOrder order : orderList){ 
				%>
				  <tr>
            		<td>
						<a href="/servlet/Queren?orderID=<%=order.getOrderID()%>"><%=order.getOrderID() %></a>
					</td>
					<td>
						<%=order.getOrderDate() %>
					</td>
					<td>
						<%=order.getPrice()%>
					</td>
					<td>
						<%=order.getScoreGet() %>
					</td>
          		  </tr>
				 <%} %>
				 </tbody>
            </table>	
			</div>
		</div>
		
	<div id="footer">
		<span id="footerleft"> &nbsp;隐私权 | 版权 | 法律声明 | 电子邮件：admin@163.com </span>
		<span id="footerright"> B2C商城  Power by IBM &nbsp;</span>
	</div>
</div>

</body>
</html>
