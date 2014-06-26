<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page pageEncoding = "UTF-8"%>
<html>
<head>
<title>BC2商城</title>
<link href="../css/home.css" rel="stylesheet" type="text/css">
   </head>

<body>
<%@ include file="header.jsp" %>
	<div id="banner"></div>
	<div id="left">
		<div id="category">
			<h4><span>图书音像</span></h4>
			<ul>
				<li><a href="item_list.jsp">教材</a></li>
				<li><a href="#">外语</a></li>
				<li><a href="#">公务员考试</a></li>
				<li><a href="#">音乐</a></li>
				<li><a href="#">音乐</a></li>
				<li><a href="#">影视</a></li>
			</ul>
			<h4><span>时尚生活</span></h4>
			<ul>
				<li><a href="#">护肤</a></li>
				<li><a href="#">服装</a></li>
				<li><a href="#">手饰</a></li>
				<li><a href="#">箱包</a></li>
				<li><a href="#">小家电</a></li>
				<li><a href="#">运动健身</a></li>
			</ul>
			<h4><span>数据产品</span></h4>
			<ul>
				<li><a href="#">数码相机</a></li>
				<li><a href="#">数码录音笔</a></li>
				<li><a href="#">硬盘</a></li>
				<li><a href="#">MP3</a></li>
				<li><a href="#">耳机</a></li>
				<li><a href="#">数码配件</a></li>
			</ul>
			<h4><span>鲜花速递</span></h4>
			<ul>
				<li><a href="#">玫瑰</a></li>
				<li><a href="#">百合</a></li>
				<li><a href="#">康乃馨</a></li>
				<li><a href="#">太阳花</a></li>
				<li><a href="#">菊花</a></li>
			</ul>
      </div>
	</div>
	<div id="main">
		<div id="search1">
			<div id="searchleft">
				<img src="../image/ico_site.jpg"  id="ico_site"/>
				网站路径：<a href="home.jsp">首页</a>
			</div>
			<div id="searchright">
			  <select name="category" id="searchrightcategory">
				<option value="5">所有类别</option>
                <option value="1">图书音像</option>
                <option value="2">时尚生活</option>
                <option value="3">饰品配件</option>
                <option value="4">数码产品</option>
              </select>
			  <input type="text" name="product" id="textInput" />
			  <input type="button" name="Submit" value="搜索" id="searchbutton" onClick="javascript:window.open('item_search_list.jsp','_parent','')">
				
			</div>
		</div>
		
		
			<div id="recommend">
			<ul>
				<li><a href="item_info.jsp"><img src="../image/dxwl4.jpg"><br><span class="inputHeader">大学物理学.第四册：<br>波动与光学(第2版)<br>
	     <strong>￥8.50</strong> 85折</span></li>
		 		<li><a href="#"><img src="../image/wj.jpg"><br><span class="inputHeader">美瑞贝尔皇冠★最新<br>韩版丝麻质感围巾<br>
	     <strong>￥33.00</strong> 75折</span></li>
		 		<li><a href="#"><img src="../image/ssbs.jpg"><br><span class="inputHeader">时尚芭莎(2007年<br>12月总第162期)<br>
	     <strong>￥16.00 </strong> 80折</span></li>
		 		<li><a href="#"><img src="../image/mm.jpg"><br><span class="inputHeader">晶冻啤酒酵母晚安<br>冻膜(60ML)<br>
	     <strong>￥54.99 </strong> 80折</span></li>
		 		 		<li><a href="#"><img src="../image/mp3.jpg"><br><span class="inputHeader">创新小石头<br>1GB黑色<br>
	     <strong>￥99.00 </strong> 66折</span></li>
			</ul>
			<br>&nbsp;
	    </div>
		<div id="new">
			<ul>
				<li><a href="#"><img src="../image/xydydxt.jpg"><br><span class="inputHeader">下一代移动系统<br>
	     <strong>￥8.50</strong></span></li>
		 		<li><a href="#"><img src="../image/yxqygl.jpg"><br><span class="inputHeader">影响企业管理的<br>125个故事<br>
	     <strong>￥33.00</strong></span></li>
		 		<li><a href="#"><img src="../image/PPT.jpg"><br><span class="inputHeader">别告诉我你懂PPT<br>
	     <strong>￥16.00 </strong></span></li>
		 		<li><a href="#"><img src="../image/bubaoyuan.jpg"><br><span class="inputHeader">不抱怨的世界<br>
	     <strong>￥54.99 </strong> </span></li>
		 		<li><a href="#"><img src="../image/dsn.jpg"><br><span class="inputHeader">迪斯尼的精彩世界<br>
	     <strong>￥130.00 </strong> </span></li>
			</ul>
			<br>&nbsp;
		</div>
		
		<div id="life">
			<ul>
				<li><a href="#"><img src="../image/sssh.gif"><br><span class="inputHeader">18k白金30分钻戒<br>
	     <strong>￥1990</strong></span></li>
		 		<li><a href="#"><img src="../image/jsq.jpg"><br>
		 		<span class="inputHeader">加湿器<br>
	     <strong>￥133.00</strong></span></li>
		 		<li><a href="#"><img src="../image/yf.jpg"><br><span class="inputHeader">波斯登羽绒服<br>
	     <strong>￥316.00 </strong></span></li>
		 		<li><a href="#"><img src="../image/dzh.jpg"><br><span class="inputHeader">花形紫水晶吊坠<br>
	     <strong>￥129.99 </strong> </span></li>
		 		<li><a href="#"><img src="../image/dhj.jpg"><br><span class="inputHeader">ZIPPO打火机<br>
	     <strong>￥115.00 </strong> </span></li>
			</ul>
			<br>&nbsp;
		</div>
	</div>
	<div id="footer">
		<span id="footerleft"> &nbsp;隐私权 | 版权 | 法律声明 | 电子邮件：admin@163.com </span>
		<span id="footerright"> B2C商城  Power by IBM &nbsp;</span>
	</div>
</div>

</body>
</html>
