<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<<<<<<< HEAD
=======
<%@ page pageEncoding = "UTF-8"%>
<%@page import="model.*,java.util.*,Database.*"%>
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
<html>
<head>
<title>BC2商城</title>
<link href="../css/frame.css" rel="stylesheet" type="text/css">
<<<<<<< HEAD
   </head>

<body>
<div id="container">
	<div id="logalleft">
		<div id="logalright">
		<a href="register.html" target="_parent">[注册&nbsp;</a>] | 
		<a href="" target="_parent">王小静 已登录| 
		<a href="user_edit.html" target="_parent">个人信息维护</a> | 
		<a href="address_daohang.html" target="_parent">地址簿</a> |
	 	<a href="home_nologin.html" target="_parent">退出</a>
		</div>
	</div>
	<div id="globallink">
		<ul>
			<li><a href="home.html">首页</a></li>
			<li><a href="credit_query.html">积分查询</a></li>
			<li><a href="item_search.html">商品搜索</a></li>
			<li><a href="favorite.html">收藏夹</a></li>
			<li><a href="cart_list.html">我的购物车</a></li>
			<li><a href="tradequery.html">交易查询</a></li>
			<li><a href="send_notes.html">送货说明</a></li>
			<li><a href="" class="nouseful">&nbsp;</a></li>
		</ul>
	</div>
	<div id="banner"></div>
=======
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
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
	<div id="main">
		<div id="search2">
			<div id="searchleft">
				<img src="../image/ico_site.jpg"  id="ico_site"/>
<<<<<<< HEAD
				网站路径：<a href="home.html">首页</a>&gt;&gt;<a href="">积分查询</a>
			</div>
			<div id="searchright2">
			  <input type="text" name="product" id="textInput"/>
			  <input type="button" name="Submit" value="搜索" id="searchbutton" onClick="javascript:window.open('item_search_list.html','_parent','')">
=======
				网站路径：<a href="home.jsp">首页</a>&gt;&gt;<a href="">积分查询</a>
			</div>
			<div id="searchright2">
			  <input type="text" name="product" id="textInput"/>
			  <input type="button" name="Submit" value="搜索" id="searchbutton" onClick="javascript:window.open('item_search_list.jsp','_parent','')">
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
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
<<<<<<< HEAD
			<div id="sendnotehead"><strong>当前积分：</strong></div>
=======
			<div id="sendnotehead"><strong>当前积分<%=credit.getScore() %></strong></div>
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
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
<<<<<<< HEAD
				  <tr>
            		<td>
						<a href="order_info.html">1483728</a>
					</td>
					<td>
						2007-10-01 10:25:04
					</td>
					<td>
						￥30.18
					</td>
					<td>
						30
					</td>
          		  </tr>
				  <tr>
            		<td>
						<a href="#">1483729</a>
					</td>
					<td>
						2007-10-12 16:02:24
					</td>
					<td>
						￥70.00
					</td>
					<td>
						70
					</td>
          		  </tr>
=======
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
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
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
