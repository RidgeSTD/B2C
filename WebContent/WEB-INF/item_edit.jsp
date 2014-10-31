<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page language="java"contentType = "text/html;
charset = gb2312" pageEncoding = "UTF-8"%>
<% String username = (String)session.getAttribute("username"); %>
<html>
<head>
<title>BC2商城</title>
<link href="../css/frame.css" rel="stylesheet" type="text/css"/>
<script language="javascript" src="../js/checkform.js">

</script>

</head>

<body>
<div id="container">
	<div id="logalleft">
		<div id="logalright">
		<a href="" target="_parent">[<%= username %>] 已登录|</a>
	 	<a href="home.jsp" target="_parent">退出</a>
		</div>
	</div>
	<div id="globallink">
		<ul>
			<li><a href="home.jsp">首页</a></li>
			<li><a href="category_list.jsp">商品管理</a></li>
			<li><a href="order_admin.jsp">订单管理</a></li>
			<li><a href="salesdata_admin.jsp">销售量统计</a></li>
			<li><a href="user_admin.jsp">会员管理</a></li>
			<li><a href="" class="nouseful">&nbsp;</a></li>
			<li><a href="" class="nouseful">&nbsp;</a></li>
			<li><a href="" class="nouseful">&nbsp;</a></li>
		</ul>
	</div>
	<div id="banner"></div>
	<div id="main">
		<div id="search2">
			<div id="searchleft">
				<img src="../image/ico_site.jpg"  id="ico_site"/>
				网站路径：<a href="category_list.jsp">商品管理</a>&gt;&gt;<a href="item_list.jsp">商品列表</a>&gt;&gt;<a href="">商品编辑</a>
			</div>
		</div>
		<div id="sendnote">
			<div id="sendnotehead"><strong>编辑商品</strong></div>
			<div id="sendnotecontent">
			<form action="" method="post" enctype="multipart/form-data" name="form1">
				<table id="itemsearch">
				   <tr>
					<th width="180">商品名称：</th>
            		<td width="360">
					 <input type="text" class="inputttextlarge" name="name" onFocus="nextfield='name'" value="大学物理学.第四册：波动与光学（第2版）" maxlength="25"></td>
					 
					 <td width="142"><span class="red">*必输项</span></td>
          		 </tr>
				 <tr>
				 <th>商品描述：</th>
				 <td><textarea name="desc" class="textAreaStyle">本书是清华大学教材《大学物理学》的第四册，讲述振动与波的一般基本规律和波动光学的基本原理，包括光的干涉、衍射和偏振。除了基本内容外，还专题介绍了全息照相、光学信息处理、液晶等今日物理趣闻和著名物理学家托马斯・杨和菲涅耳的传略。基本内容扼要，附加内容通俗易懂。 本书可作为高等院校的大学物理教材，也可以作为中学物理教师教学或其他读者自学的参考书。</textarea></td>
				 <td></td>
          		 </tr>
				 <tr>
				 <th><span class="inputHeader">商品图片：</span></th>
					<td><img src="../image/dxwl4.jpg" alt="大学物理第4册" class="picture1"><br>
         	 	    <input type="file" name="pic">&nbsp;<input type="submit" name="Submit" value="上传"></td>
					<td></td>
          		 </tr>
				  <tr>
				 <th>市场价：</th>
					<td><input type="text" name="price" class="smallinputext" value="10"></td>
					<td><span class="red">*必输项</span></td>
          		 </tr>
				 <tr>
				 <th>库存量：</th>
				 <td>
				 <input type="text" name="storage" class="smallinputext" value="20">				 </td>
				 <td><span class="red">*必输项</span></td>
				 <tr>
				 <th>折扣：</th>
				 <td>
				 <input type="text" name="discount" class="smallinputext" value="0.85">				 </td>
				  <td><span class="red">*必输项</span></td>
				 </tr>
				 <tr>
				 <th></th>
			 	  <td>
				 <input type="button" name="button2" value="提交" onClick="checkitemform()">
				 	<input type="reset" name="button1" value="重填" onClick="clear()">
				 <input type="button" name="button22" value="返回" onClick="javascript:window.location.href='item_list.jsp'">				  </td> 
				  <td></td>
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