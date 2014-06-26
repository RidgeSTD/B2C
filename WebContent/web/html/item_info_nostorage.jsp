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
				<img src="../image/ico_site.jpg"  id="ico_site"/>
				网站路径：<a href="home.jsp">首页</a>&gt;&gt;<a href="#">商品详细信息</a>
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
			<div id="sendnotehead"><strong>商品信息</strong></div>
			<div id="sendnotecontent">
				<table id="creditquery">
				<caption>
				大学物理学.第二册：热学（第2版）
				</caption>
				<tbody>
				<tr>
          <td><img src="../image/dxwl2.jpg" alt="大学物理第四册" class="picture1"></td>
          <td colspan="4" class="tdleftalign">本书是清华大学教材《大学物理学》的第二册，讲述振动与波的一般基本规律和波动光学的基本原理，包括光的干涉、衍射和偏振。除了基本内容外，还专题介绍了全息照相、光学信息处理、液晶等今日物理趣闻和著名物理学家托马斯・杨和菲涅耳的传略。基本内容扼要，附加内容通俗易懂。 本书可作为高等院校的大学物理教材，也可以作为中学物理教师教学或其他读者自学的参考书。</td>
        </tr>
        <tr>
          <td>市场价：￥9.50</td>
          <td>会员价：￥8.08</td>
		  <td>节省：￥1.42</td>
		  <td>库存量：0</td>
		  <td>用户评分：<img src="../image/4star.JPG" alt="喜欢" class="picture"></td>
        </tr>
		<tr>
		  <td></td>
          <td></td>
		  <td></td>
		  <td></td>
		<td><a href="comment_list.htm"><a href="comment_list.jsp">【查看用户评论】</a><br><a href="comment_add.jsp">【参与评论】</a></td>
		</tr>
				 </tbody>
		<tfoot>
		<tr>
			<td></td>
          <td></td>
		  <td></td>
		  <td>
		<span class="inputHeaderGrey">暂无法购买</span>
		</td>
		  <td>
		<a href="favorite.jsp"><img src="../image/put_to_collection.gif" alt="收藏" class="picture"></a>
			</td>
		</tr>
		</tfoot>
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
