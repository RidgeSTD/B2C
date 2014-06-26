<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page pageEncoding = "UTF-8"%>
<html>
<head>
<title>BC2商城</title>
<link href="../css/frame.css" rel="stylesheet" type="text/css"/>
<script language="javascript">
function clear(){
document.form1.webUserEntity.email="";
document.form1.webUserEntity.name="";
document.form1.webUserEntity.password="";
document.form1.webUserEntity.passwordConfirm="";
}
function checkcontent(){
if(document.form1.webUserEntity.desc===""&&document.form1.webUserEntity.desc===""){
window.alert("请输入商品名称或商品描述！");
return;
}
}
</script>

</head>

<body>
<%@ include file="header.jsp" %>
	<div id="banner"></div>
	<div id="main">
		<div id="search2">
			<div id="searchleft">
				<img src="../image/ico_site.jpg"  id="ico_site"/>
				网站路径：<a href="home.jsp">首页</a>&gt;&gt;<a href="">商品搜索</a>
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
			<div id="sendnotehead"><strong>商品搜索</strong></div>
			<div id="sendnotecontent">
				<table id="itemsearch">
				   <tr>
					<th>请选择商品类别：</th>
            		<td>
						<select name="catogory">
              				<option>所有类别</option>
             				<option>图书音像</option>
              				<option>时尚生活</option>
              				<option>饰品配件</option>
			  				<option>数码产品</option>
            			</select>
					</td>
          		 </tr>
				 <tr>
				 <th>请选择商品价格：</th>
            		<td>
						<select name="price">
              				<option>不指定</option>
             				<option>0-10元</option>
              				<option>10-30元</option>
              				<option>30-50元</option>
			  				<option>50-100元</option>
              				<option>100元以上</option>
            			</select>
					</td>
          		 </tr>
				 <tr>
				 <th>请选择商品折扣：</th>
            		<td>
					  	<select name="discount">
							<option>所有折扣</option>
              				<option>3折以下</option>
              				<option>3-5折</option>
							<option>5-7折</option>
							<option>7折及以上</option>
            			</select> 
					</td>
          		 </tr>
				 <tr>
				 <th>请输入商品名称：</th>
            		<td>
					<input type="text" name="product" id="inputtext"/>
					</td>
          		 </tr>
				 <tr>
				 <th></th>
				 	<td><input type="button" class="" name="button2" value="搜索" onClick="javascript:window.location.href='item_search_list.jsp'">
				 </tr>
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
