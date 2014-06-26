<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page pageEncoding = "UTF-8"%>
<html>
<head>
<title>BC2商城</title>
<link href="../css/frame.css" rel="stylesheet" type="text/css"/>
<script language="javascript" src="../js/checkform.js"></script>
</head>

<body>
<%@ include file="header.jsp" %>
	<div id="banner"></div>
	<div id="main">
		<div id="search2">
			<div id="searchleft">
				<img src="../image/ico_site.jpg"  id="ico_site"/>
				网站路径：<a href="home.html">首页</a>&gt;&gt;<a href=""> 会员登录</a>
			</div>
						<div id="searchright2">
			  <input type="text" name="product" id="textInput"/>
			  <input type="button" name="Submit" value="搜索" id="searchbutton" onClick="javascript:window.open('item_search_list.html','_parent','')">
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
			<div id="sendnotehead"><strong> 会员登录</strong></div>
			<div id="sendnotecontent">

			<form action="/B2C/LoginAction" method="get" name="form1">
				<table id="itemsearch">
				   <tr>
					<th class="itemsearchth" >用户名：</th>
            		<td class="itemsearchtd1">
					<input type="text" class="inputtext" name="name" onFocus="nextfield='name'" value="" maxlength="25">
					</td>
					<td class="itemsearchtd2">
					</td>
          		 </tr>
				 <tr>
				 <th class="itemsearchth">密&nbsp;&nbsp;码：</th>
            		<td class="itemsearchtd1">
					<input type="password" class="inputtext" name="password" onFocus="nextfield='name'" value="" maxlength="25">
					</td>
					<td class="itemsearchtd2"><a href="pwd_find.html"><span class="red">忘记密码？</span></a></td>
          		 </tr>
				
				 <tr>
				 <th></th>
				 	<td><input type="submit" name="button2" value="登陆" onClick="checkloginform()">
						&nbsp;<input type="reset" name="button1" value="重填" onClick="clear()">
						&nbsp;
					</td>
				 </tr>
        </table>
		</form>		
			</div>
		</div>
		
	<div id="footer">
		<span id="footerleft"> &nbsp;隐私权 | 版权 | 法律声明 | 电子邮件：admin@163.com </span>
		<span id="footerright"> B2C商城  Power by IBM &nbsp;</span>
	</div>
</div>

</body>
</html>
