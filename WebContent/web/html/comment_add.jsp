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
				网站路径：<a href="home.html">首页</a>&gt;&gt;<a href="item_info.html">商品信息</a>&gt;&gt;<a href="">添加评论</a>
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
			<div id="sendnotehead"><strong>添加评论</strong></div>
			<div id="sendnotecontent">
			<form action="" method="post" enctype="multipart/form-data" name="form1">
				<table id="commenttable">
				   <tr>
					<th>打分：</th>
            		<td><input type="radio" name="radiobutton" value="radiobutton"></td>
              		<td><img src="../image/1star.JPG" alt="1星">很不喜欢</td>
					<td><input type="radio" name="radiobutton" value="radiobutton"></td>
              		<td><img src="../image/2star.JPG" alt="2星">不喜欢</td>
					<td><input type="radio" name="radiobutton" value="radiobutton"></td>
              		<td><img src="../image/3star.JPG" alt="3星">一般</td>
					<td><input type="radio" name="radiobutton" value="radiobutton"></td>
              		<td><img src="../image/4star.JPG" alt="4星">喜欢</td>
					<td><input type="radio" name="radiobutton" value="radiobutton"></td>
              		<td><img src="../image/5star.JPG" alt="5星">很喜欢</td>
          		 </tr>
				 <tr>
				 	<th>评论：</th>
					<td colspan="10">
					<textarea name="webUserEntity.desc" class="textAreaStyle"></textarea>
					</td>
				 </tr>
				 <tr>
				 	<th>&nbsp;</th>
					<td colspan="10">
					<input type="button" class="bt2" name="button2" value="提交" onClick="checkcommentform()">
					&nbsp;<input type="reset" class="bt2"　name="button1" value="重填" onClick="clear()">
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
