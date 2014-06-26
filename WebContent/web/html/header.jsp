
<div id="container">
	<div id="logalleft">
		<div id="logalright">
		<%@ page import="Database.*,model.*,java.sql.*" contentType="text/html; charset=UTF-8" %>
		<%
		String userEmail = (String)session.getAttribute("userEmail");
		
		if (userEmail == null || "".equals(userEmail)) 
		{
			
		%>
			<a href="register.jsp" target="_parent">[注册]</a> &nbsp;| 
		    <a href="login.jsp" target="_parent">会员登录</a>
	    <% 
	    }
		else 
		{
			//NBUser user = DB.getInstance().getNBUserByEmail(userEmail);
			NBUser user = new NBUser(1,"hanjason@126.com","hans","dddddd",0,new Time(System.currentTimeMillis()),null);
		%>
			<a href="" target="_parent"><%=user.getNickname() %>| 
			<a href="user_edit.jsp" target="_parent">个人信息维护</a> | 
			<a href="address_daohang.jsp" target="_parent">地址簿</a> |
		 	<a href="home_nologin.jsp" target="_parent">退出</a>
		<%
		} 
		%>
		
		</div>
	</div>
	<div id="globallink">
		<ul>
			<li><a href="home.jsp">首页</a></li>
			<li><a href="credit_query.jsp">积分查询</a></li>
			<li><a href="item_search.jsp">商品搜索</a></li>
			<li><a href="favorite.jsp">收藏夹</a></li>
			<li><a href="cart_list.jsp">我的购物车</a></li>
			<li><a href="tradequery.jsp">交易查询</a></li>
			<li><a href="send_notes.jsp">送货说明</a></li>
			<li><a href="" class="nouseful">&nbsp;</a></li>
		</ul>
	</div>
	