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
				网站路径：<a href="home.html">首页</a>&gt;&gt;<a href="send_notes.html">送货说明</a>
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
			<div id="sendnotehead"><strong>送货费用说明</strong></div>
			<div id="sendnotecontent">
			<ul>
			<li>1.系统将会根据您的送货地址来收取送货费：本地5元，外地10元；</li>
			<li>2.会员可以使用积分代替现金，系统会将您在结帐时输入的积分数来换算成现金；</li>
			<li>3.对于本地会员，当购买金额大于300元时，将免收送货费；对于外地会员，当购买金额大于800时，将免收送货费；</li>
			<li>4.对于优惠商品，会员可以获得适当优惠；</li>
			<li>5.最终订单金额将由 商品价格 + 送货费 - 积分代现金 - 优惠 计算得出。</li>
			</ul>
			</div>
		</div>
		
	<div id="footer">
		<span id="footerleft"> &nbsp;隐私权 | 版权 | 法律声明 | 电子邮件：admin@163.com </span>
		<span id="footerright"> B2C商城  Power by IBM &nbsp;</span>
	</div>
</div>

</body>
</html>
