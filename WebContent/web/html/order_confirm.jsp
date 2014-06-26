<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page pageEncoding = "UTF-8" import="Database.*, model.*, java.util.*"%>
<html>
<head>
<title>BC2商城</title>
<link href="../css/frame.css" rel="stylesheet" type="text/css"/>
<script language="javascript" type="text/javascript" src="../js/checkform.js">
</script>
</head>

<body>
<%@ include file="header.jsp" %>
	<div id="banner"></div>
	<%
	DB db = DB.getInstance();
	ArrayList<NBProduct> cart = (ArrayList<NBProduct>)session.getAttribute("cart");
	double sumprice = 0, totalprice = 0;
	%>
	<div id="main">
		<div id="search2">
			<div id="searchleft">
				<img src="../image/ico_site.jpg"  id="ico_site"/>
				网站路径：<a href="cart_list.jsp">购物车</a>&gt;&gt;<a href="#"><span class="red">确认订单</span></a>
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
		<div id="double1">
			<div id="doublehead1"><strong>商品清单</strong>&nbsp;<a href="cart_list_edit.jsp"><img src="../image/edit.gif" alt="修改" class="picture"></a></div>
			<div id="doublecontent1">
			<form action="" method="post" enctype="multipart/form-data" name="form1">
				<table id="doublecontenttable1">
				<thead>
					<tr>
						<th>&nbsp;</th>
						<th>商品名</th>
						<th>市场价</th>
						<th>折扣</th>
						<th>您的价格</th>
						<th>数量</th>
					</tr>
					
				</thead>
				<tbody>
				<%for (int i = 0;i<cart.size();i++){
					int zhe = (int)(cart.get(i).getPrice()*100);
					double yourprice = cart.get(i).getPrice()* cart.get(i).getDiscount();
					sumprice += yourprice;
				%>
				  <tr>
					<td><span>1</span></td>		
					<td><%=cart.get(i).getName() %></a></td>
					<td>￥<%=String.format("%.2f", cart.get(i).getPrice()) %></td>
					<td><%=zhe %>折</td>
					<td>￥<%=String.format("%.2f", yourprice) %></td>
					<td>1</td>	
          		  </tr>
          		  <%} %>
				  <tr></tr>
				  <tr>
				  	<td>
						总价
					</td>
					<td>
						<span class="red">商品价格:￥<%=String.format("%.2f", sumprice) %> + 送货费:￥5.00 = ￥<%=String.format("%.2f", sumprice+5) %></span>
					</td>
					<td></td>
					<td></td>
					<td></td>
				  	<td></td>
				  </tr>
				  <tr>
				  <td>本单将产生积分：</td>
				  <td><span class="red"><%=String.format("%.0f",sumprice+5) %></span></td>
				  <td></td>
				  <td></td>
				  <td></td>
				  </tr>
				 </tbody>
            </table>
			</div>
			</div>
			<div id="double2">
			<div id="doublehead2"><strong>送货地址</strong>&nbsp;<a href="address.jsp"><img src="../image/edit.gif" alt="修改" class="picture"></a></div>
			<div id="doublecontent2">
			<table id="itemsearch">
              <tr>
                <th class="itemsearchth" >姓&nbsp;&nbsp;&nbsp;&nbsp;名：</th>
                <td class="itemsearchtd1">华文澜</td>
                <td class="itemsearchtd2">&nbsp;</td>
              </tr>
              <tr>
                <th class="itemsearchth">地&nbsp;&nbsp;&nbsp;&nbsp;址：</th>
                <td class="itemsearchtd1">哈尔滨南岗区西大直街92号</td>
                <td class="itemsearchtd2">&nbsp;</td>
              </tr>
              <tr>
                <th class="itemsearchth">电话号码：</th>
                <td class="itemsearchtd1">13912345678</td>
                <td class="itemsearchtd2"></td>
              </tr>
              <tr>
                <th class="itemsearchth"><span class="inputHeader">支付方式：</span></th>
                <td class="itemsearchtd1">货到付款</td>
                <td class="itemsearchtd2">&nbsp;</td>
              </tr>
              <tr>
                <th class="itemsearchth">&nbsp;</th>
                <td class="itemsearchtd1">&nbsp;</td>
                <td class="itemsearchtd2">请仔细核查信息，确定无误后：
                  <input type="button" name="Submit" value="提交订单" onclick="javascript:window.location.href='/B2C/servlet/MakeOrder'" /></td>
              </tr>
            </table>
			</form>		
			</div>
</div>

	<div id="footer">
		<span id="footerleft"> &nbsp;隐私权 | 版权 | 法律声明 | 电子邮件：admin@163.com </span>
		<span id="footerright"> B2C商城  Power by IBM &nbsp;</span>
	</div>
</body>
</html>
