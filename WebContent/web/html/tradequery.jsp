<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page pageEncoding = "UTF-8"%>
<html>
<head>
  <title>BC2商城</title>
  <link href="../css/frame.css" rel="stylesheet" type="text/css">
</head>

<body>
  <div id="container">
   <div id="logalleft">
    <div id="logalright">
      <a href="register.jsp" target="_parent">[注册&nbsp;</a>] | 
      <a href="" target="_parent">王小静 已登录| 
        <a href="user_edit.jsp" target="_parent">个人信息维护</a> | 
        <a href="address_daohang.jsp" target="_parent">地址簿</a> |
        <a href="home_nologin.jsp" target="_parent">退出</a>
      </div>
    </div>
    <div id="globallink">
      <ul>
       <li><a href="home.jsp">首页</a></li>
       <li><a href="credit_query.jsp">积分查询</a></li>
       <li><a href="item_search.jsp">商品搜索</a></li>
       <li><a href="favorite.jsp">收藏夹</a></li>
       <li><a href="cart_list.jsp">我的购物车</a></li>
       <li><a href="tradequery.jsp">交易查询</a></li>
       <li><a href="send_notes.jsp">送货说明</a></li>
       <li><a href="" class="nouseful">&nbsp;</a></li>
     </ul>
   </div>
   <div id="banner"></div>
   <div id="main">
    <div id="search2">
     <div id="searchleft">
      <img src="../image/ico_site.jpg" id="ico_site"/>
      网站路径：<a href="home.jsp">首页</a>&gt;&gt;<a href="">历史交易查询</a>
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
 <div id="sendnotehead"><strong>历史交易查询</strong></div>
 <div id="sendnotecontent">
   <form action="/B2C/servlet/Trade_Query_serv" method="post">
    <table id="tradequery">
     <tr>
       <th>请选择起始时间:&nbsp;</th>
       <td>
        <select name="year_st">
         <option>2014</option>
         <option>2013</option>
         <option>2012</option>
         <option>2011</option>
         <option>2010</option>
       </select>
       &nbsp;年&nbsp;
       <select name="month_st">
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
      <select name="day_st">
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
      </select>
      &nbsp;日
    </td>
  </tr>
  <tr>
   <th>请选择结束时间:&nbsp;</th>
   <td>
    <select name="year_en">
      <option>2014</option>
      <option>2013</option>
      <option>2012</option>
      <option>2011</option>
      <option>2010</option>
    </select>
    &nbsp;年&nbsp;
    <select name="month_en">
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
    <select name="day_en">
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
    </select>
    &nbsp;日
  </td>
</tr>
<tr>
 <th>请选择订单状态:&nbsp;</th>
 <td>
  <select name="pay">
    <option>已支付</option>
    <option>未支付</option>
  </select> 
</td>
</tr>
<tr>
 <th></th>
 <td><input type="submit" class="" name="button2" value="查询" ><td>
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
