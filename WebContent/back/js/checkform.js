// JavaScript Document
function checkitemform(){
if(document.form1.name.value===""){
window.alert("请输入商品名称！");
document.form1.name.focus();
return false;
}if(document.form1.price.value==""){
window.alert("请输入商品价格！");
document.form1.price.focus();
return false;
}if(document.form1.storage.value==""){
window.alert("请输入商品库存量！");
document.form1.storage.focus();
return false;
}if(document.form1.discount.value==""){
window.alert("请输入商品折扣！");
document.form1.discount.focus();
return false;
}else{
<<<<<<< HEAD
window.location.href="item_list.html";
=======
window.location.href="item_list.jsp";
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
} 
}

function checkregform(){
if(document.form1.email.value===""){
window.alert("请输入有效的邮箱地址！");
document.form1.name.focus();
return false;
}if(document.form1.password.value==""){
window.alert("请输入密码！");
document.form1.password.focus();
return false;
}if(document.form1.passwordConfirm.value==""){
window.alert("请再次输入密码！");
document.form1.passwordConfirm.focus();
return false;
}else{
<<<<<<< HEAD
window.location.href="home.html";
=======
window.location.href="home.jsp";
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
} 
}

function checkcategoryform(){
if(document.form1.name.value===""){
window.alert("请输入目录名称！");
document.form1.name.focus();
return false;
}else{
<<<<<<< HEAD
window.location.href="category_list.html";
=======
window.location.href="category_list.jsp";
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
} 

}

function checkstorageform(){
if(document.form1.storage.value===""){
window.alert("请输入库存量！");
document.form1.storage.focus();
return false;
}else{
<<<<<<< HEAD
window.location.href="storage_list.html";
=======
window.location.href="storage_list.jsp";
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
} 

}

function checkpriceform(){
if(document.form1.price.value===""){
window.alert("请输入价格！");
document.form1.price.focus();
return false;
}if(document.form1.discount.value===""){
window.alert("请输入库存量！");
document.form1.discount.focus();
return false;
}else{
<<<<<<< HEAD
window.location.href="price_list.html";
=======
window.location.href="price_list.jsp";
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
} 

}

function checkloginform(){
if(document.form1.name.value===""){
window.alert("请输入用户名！");
document.form1.name.focus();
return false;
}if(document.form1.password.value===""){
window.alert("请输入密码！");
document.form1.password.focus();
return false;
}else{
<<<<<<< HEAD
window.location.href="category_list.html";
=======
window.location.href="category_list.jsp";
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
} 

}

function checkusersetform(){

if(document.form1.credit.value===""){
window.alert("请输入积分下限！");
document.form1.credit.focus();
return false;
}if(document.form1.ratio.value===""){
window.alert("请输入积分比例！");
document.form1.ratio.focus();
return false;
}else{
<<<<<<< HEAD
window.location.href="user_admin.html";
=======
window.location.href="user_admin.jsp";
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
} 
}

function checkordercheck(){
	window.alert("审核成功！");
<<<<<<< HEAD
	window.location.href="order_list_refresh.html";		
=======
	window.location.href="order_list_refresh.jsp";		
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
}

function checkorderselect(){
var k=0;
	for(i=0;i<document.form1.ordersn.length;i++){
		if(document.form1.ordersn[i].checked)
		   k=1;
		}
if(k===0){
window.alert("请选择要审核的订单！");
return false;
}else{
<<<<<<< HEAD
window.location.href="order_check.html";
=======
window.location.href="order_check.jsp";
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
} 

}

function checkitemrefresh(){
if(document.form1.name.value===""){
window.alert("请输入商品名称！");
document.form1.name.focus();
return false;
}if(document.form1.price.value==""){
window.alert("请输入商品价格！");
document.form1.price.focus();
return false;
}if(document.form1.storage.value==""){
window.alert("请输入商品库存量！");
document.form1.storage.focus();
return false;
}if(document.form1.discount.value==""){
window.alert("请输入商品折扣！");
document.form1.discount.focus();
return false;
}else{
<<<<<<< HEAD
window.location.href="item_list_refresh.html";
=======
window.location.href="item_list_refresh.jsp";
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
} 
	
}