<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page pageEncoding = "UTF-8"%>
<html>
<head>
<title>BC2商城</title>
<link href="../css/frame.css" rel="stylesheet" type="text/css">
   </head>

<body>
<%@ include file="header.jsp" %>
	<div id="banner"></div>
	<div id="main">
		<div id="search2">
			<div id="searchleft">
				<img src="../image/ico_site.jpg" id="ico_site"/>
				网站路径：<a href="home.jsp">首页</a>&gt;&gt;<a href="">收藏夹</a>
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
			<div id="sendnotehead"><strong>我的收藏夹</strong></div>
			<div id="sendnotecontent">
				<table id="favorite">
				<thead>
					<tr>
						<th>No.</th>
						<th>商品名</th>
						<th>图片</th>
						<th>市场价</th>
						<th>会员价</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
				  <tr>
            		<td>
						1
					</td>
					<td>
						<a href="item_info.jsp"><span>大学物理学.第四册：波动与光学（第2版）</span></a>
					</td>
					<td>
						<img src="../image/dxwl4.jpg"/>
					</td>
					<td>
						￥10.00
					</td>
					<td>
						￥8.50
					</td>
					<td>
						<a href="cart_list.jsp"><img src="../image/put_to_cart.gif" class="picture"/></a>&nbsp;<a href="#" onClick="window.confirm('确定删除？')"><img src="../image/delete_item.gif" class="picture" /></a>
					</td>
          		  </tr>
				  <tr>
            		<td>
						2
					</td>
					<td>
						<a href="item_info_nostorage.jsp"><span>大学物理学.第二册：热学（第2版）</span></a>
					</td>
					<td>
						<img src="../image/dxwl2.jpg"/>
					</td>
					<td>
						￥9.50
					</td>
					<td>
						￥8.08
					</td>
					<td>
					<a href="cart_list.jsp"><img src="../image/put_to_cart.gif" class="picture"/></a>&nbsp;<a href="#" onClick="window.confirm('确定删除？')"><img src="../image/delete_item.gif"  class="picture" /></a>
					</td>
          		  </tr>
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
