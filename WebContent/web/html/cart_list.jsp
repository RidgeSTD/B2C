<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="model.*,Database.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javax.ws.rs.CookieParam"%>
<%@page pageEncoding="UTF-8" %>
<%@page import ="javax.servlet.http.Cookie" %>
<html>
<head>
<title>BC2商城</title>
<link href="../css/frame.css" rel="stylesheet" type="text/css">
   </head>
<script language="javascript" src="../js/checkform.js">
</script>
<body>
<%@ include file="header.jsp" %>
	<div id="banner"></div>
	<div id="main">
		<div id="search2">
			<div id="searchleft">
				<img src="../image/ico_site.jpg" id="ico_site"/>
				网站路径：<a href="home.jsp">首页</a>&gt;&gt;<a href="">购物车</a>			</div>
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
			<div id="sendnotehead"><strong>购物车内的商品</strong></div>
			<div id="sendnotecontent">
			<%
				DB db = DB.getInstance();
				double totalPrice = 0;
				ArrayList<Integer> cart = (ArrayList<Integer>)session.getAttribute("cart");
				if (!cart.isEmpty()){			
			%>
			<form action="" method="post" enctype="multipart/form-data" name="form1">
				<table id="favorite">
				<thead>
					<tr>
						<th>No.</th>
						<th>商品名</th>
						<th>市场价</th>
						<th>会员价</th>
						<th>为您节省</th>
						<th>数量</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
				<%for (int i = 0;i< cart.size();i++){
					NBProduct product = db.getNBProductByID(cart.get(i));
					double vipPrice = product.getPrice()*product.getDiscount();
					totalPrice += vipPrice;
				 %>
				 
				  <tr>
            		<td><%=i+1 %></td>
					<td><span><%=product.getName() %> </span></td>
					<td>￥<%=String.format("%.2f", product.getPrice()) %></td>
					<td>￥<%=String.format("%.2f", vipPrice)  %></td>
					<td>￥<%=String.format("%.2f", product.getPrice()-vipPrice) %>></td>
					<td><input type="text" name="itemNo<%=i %>" size="1" value="1"></td>
					<td><a href="B2C/servlet/Cart_delt_serv?itemdeleted=<%=i %>" ><img src="../image/delete_item.gif" class="picture"/></a></td>
          		  </tr>
          		  <%} %>
					<tr>
            		<td></td>
					<td></td>
					<td></td>
					<td class="red">总价</td>
					<td class="red">￥<%=String.format(".2f", totalPrice) %></td>
					<td></td>
					<td></td>
					</tr>
					<tr>
            			<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					<td>
					<a href="order_confirm.jsp"><img src="../image/check_account.gif" class="picture"/></a></td>
					</tr>
				 </tbody>
            </table>
			</form> 
			<%}
			else{
			 %>
			 您的购物车空空如也，快去选购吧<br/>
			 <%} %>
			</div>
		</div>
		
	<div id="footer">
		<span id="footerleft"> &nbsp;隐私权 | 版权 | 法律声明 | 电子邮件：admin@163.com </span>
		<span id="footerright"> B2C商城  Power by IBM &nbsp;</span>
	</div>
</div>
</body>
</html>
