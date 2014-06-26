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
				网站路径：<a href="cart_list.html">购物车</a>&gt;&gt;<a href=""> 确认订单</a>&gt;&gt;<a href=""> <span class="red">订单提交返回信息</span></a>
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
		<div id="double1">
			<div id="doublehead1"><strong>定单提交信息</strong></div>
			<div id="doublecontent1">
			<form action="" method="post" enctype="multipart/form-data" name="form1">
				<table id="doublecontenttable1">
				<tr>
					<td><span class="red">您的订单已提交成功！</span></td>		
				 </tr>
				<tr>
					<td>订单总金额：￥27.10</td>		
				 </tr>
				 <tr>
				 <td>
				 <input type="button" name="button22" value="返回继续购买" onClick="javascript:window.location.href='home.html'"></td>
				 </tr>
				</from> 
            </table>
			</div></div>
			<div id="double2">
			<div id="doublehead2"><strong>商品清单</strong></div>
			<div id="doublecontent2">
			<form action="" method="post" enctype="multipart/form-data" name="form1">
				<table id="favorite">
				<thead>
					<tr>
						<th>No.</th>
						<th>商品名</th>
						<th>市场价</th>
						<th>折扣</th>
						<th>您的价格</th>
						<th>数量</th>
					</tr>
				</thead>
				<tbody>
				  <tr>
            		<td><span class="red">1</span></td>
					<td><a href="item_info.html">大学物理学.第四册：波动与光学（第2版）</a></td>
					<td>￥10.00</td>
					<td>85折</td>
					<td>￥8.50</td>
					<td>1</td>
          		  </tr>
				  <tr>
            		<td><span class="red">2</span></td>
					<td><a href="">大学物理学.第一册：力学（第2版）</a></td>
					<td>￥16.00</td>
					<td>85折</td>
					<td>￥13.60</td>
					<td>1</td>
          		  </tr>
				 </tbody>
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
