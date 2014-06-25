<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page language="java"contentType = "text/html;
charset = gb2312" pageEncoding = "GBK"%>
<% String username = (String)session.getAttribute("username"); %>
<html>
<head>
<title>BC2商城</title>
<link href="../css/frame.css" rel="stylesheet" type="text/css">
<script language="javascript">
function clear(){
document.form1.webUserEntity.user="";
document.form1.webUserEntity.order="";
}
</script>
   </head>

<body>
<div id="container">
	<div id="logalleft">
		<div id="logalright">
		<a href="" target="_parent">[<%= username %>] 已登录|</a>
	 	<a href="home.html" target="_parent">退出</a>
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
				<img src="../image/ico_site.jpg" id="ico_site"/>
				网站路径：<a href="">销售量统计</a>
			</div>
		</div>
		<div id="sendnote">
			<div id="sendnotehead"><strong>销售量查询</strong></div>
			<div id="sendnotecontent">
				<form action="" method="post" enctype="multipart/form-data" name="form1">
				<table id="tradequery">
				   <tr>
					<th>起始时间:&nbsp;</th>
            		<td>
						<select name="year">
							<option>2014</option>
							<option>2013</option>
              				<option>2012</option>
              				<option>2011</option>
              				<option>2010</option>
              				<option>2009</option>
              				<option>2008</option>
              				<option>2007</option>
              				<option>2006</option>
              			</select>
						&nbsp;年&nbsp;
						<select name="month">
              				<option>01</option>
             				<option>02</option>
              				<option>03</option>
              				<option>04</option>
			  				<option>05</option>
              				<option>06</option>
              				<option>07</option>
              				<option>08</option>
              				<option>09</option>
              				<option>10</option>
              				<option>11</option>
              				<option>12</option>
            			</select>
						&nbsp;月&nbsp;
						<select name="day">
              				<option>01</option>
              				<option>02</option>
              				<option>03</option>
              				<option>04</option>
			  				<option>05</option>
              				<option>06</option>
              				<option>07</option>
              				<option>08</option>
              				<option>09</option>
              				<option>10</option>
              				<option>11</option>
              				<option>12</option>
              				<option>13</option>
              				<option>14</option>
              				<option>15</option>
              				<option>16</option>
              				<option>17</option>
              				<option>18</option>
              				<option>19</option>
              				<option>20</option>
              				<option>21</option>
              				<option>22</option>
              				<option>23</option>
              				<option>24</option>
              				<option>25</option>
              				<option>26</option>
              				<option>27</option>
              				<option>28</option>
              				<option>29</option>
              				<option>30</option>
              				<option>31</option>
              				
              				
              				               
            			</select>
						&nbsp;日
					</td>
          		 </tr>
				 <tr>
				 <th>结束时间:&nbsp;</th>
            		<td>
						<select name="year">
							<option>2014</option>
							<option>2013</option>
              				<option>2012</option>
              				<option>2011</option>
              				<option>2010</option>
              				<option>2009</option>
              				<option>2008</option>
              				<option>2007</option>
              				<option>2006</option>
              			</select>
						&nbsp;年&nbsp;
						<select name="month">
              				<option>01</option>
             				<option>02</option>
              				<option>03</option>
              				<option>04</option>
			  				<option>05</option>
              				<option>06</option>
              				<option>07</option>
              				<option>08</option>
              				<option>09</option>
              				<option>10</option>
              				<option>11</option>
              				<option>12</option>
            			</select>
						&nbsp;月&nbsp;
						<select name="day">
              			<option>01</option>
              				<option>02</option>
              				<option>03</option>
              				<option>04</option>
			  				<option>05</option>
              				<option>06</option>
              				<option>07</option>
              				<option>08</option>
              				<option>09</option>
              				<option>10</option>
              				<option>11</option>
              				<option>12</option>
              				<option>13</option>
              				<option>14</option>
              				<option>15</option>
              				<option>16</option>
              				<option>17</option>
              				<option>18</option>
              				<option>19</option>
              				<option>20</option>
              				<option>21</option>
              				<option>22</option>
              				<option>23</option>
              				<option>24</option>
              				<option>25</option>
              				<option>26</option>
              				<option>27</option>
              				<option>28</option>
              				<option>29</option>
              				<option>30</option>
              				<option>31</option>              
            			</select>
						&nbsp;日
					</td>
          		 </tr>
				 <tr>
				 <th>类别：</th>
            		<td>
					  	<select name="category">
			    <option value="5">所有类别</option>
                <option value="1">图书音像</option>
                <option value="2">时尚生活</option>
                <option value="3">饰品配件</option>
                <option value="4">数码产品</option>
              </select> 
					</td>
          		 </tr>
				 <tr>
				 <th></th>
				 	<td><input type="button" class="bt2" name="button22" value="查询" onClick="javascript:window.location.href='salesdata_list.html'"><td>
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
