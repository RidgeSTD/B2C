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
				网站路径：<a href="home.jsp">首页</a>&gt;&gt;<a href="">新用户注册</strong></a>
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
			<div id="sendnotehead"><strong>新用户注册</strong></div>
			<div id="sendnotecontent">
			<form action="/B2C/RegisterAction" method="post"  name="form1">
				<table id="itemsearch">
				   <tr>
					<th class="itemsearchth" >请输入E-mail 地址：</th>
            		<td class="itemsearchtd1">
						<input type="text" name="email" class="inputtext"/>
					</td>
					<td class="itemsearchtd2">
						<span class="red">*&nbsp;必输项	</span>				</td>
          		 </tr>
				 <tr>
				 <th class="itemsearchth">请输入昵称：</th>
            		<td class="itemsearchtd1">
						<input type="text" name="name" class="inputtext"/>
					</td>
					<td class="itemsearchtd2">
						<span class="red">&nbsp;(可选项)	</span>
					</td>
          		 </tr>
				 <tr>
				 <th class="itemsearchth">登录密码：</th>
            		<td class="itemsearchtd1">
					  	<input type="password" name="password" class="inputtext"/>
					</td>
					<td class="itemsearchtd2">
					<span class="red">*&nbsp;必输项	</span>
					</td>
          		 </tr>
				 <tr>
				 <th class="itemsearchth">密码确认：</th>
            		<td class="itemsearchtd1">
					<input type="password" name="passwordConfirm" class="inputtext"/>
					</td>
					<td class="itemsearchtd2">
					<span class="red">*&nbsp;必输项	</span>
					</td>
          		 </tr>
				 <tr>
				 <th></th>
				 	<td><input type="submit" class="bt2" name="button2" value="提交" onClick="checkregform()">
						&nbsp;<input type="reset" class="bt2" name="button1" value="重填" onClick="clear()">
						&nbsp;<input type="button" class="bt2" name="button3" value="返回" onClick="javascript:window.location.href='home.jsp'">
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
