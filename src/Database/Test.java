package Database;



import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.*;
import Database.*;

public class Test {
	public static void main(String[]args){
		DB db=DB.getInstance();
		NBAdmin admin=db.validateAdmin("admin", "admin");
		if(admin!=null){
			System.out.println("admin 登陆成功");
		}
		
		
		Integer userValidate=db.validataUser("michael@163.com", "juhuaduoduo");
		NBUser user=db.getNBUserByEmail("michael@163.com");
		if(userValidate==1){
			System.out.println("user validate");
		}
		
		//新增订单
//		NBOrder order=new NBOrder(0, 1, new java.util.Date(), 0, 100, 1, 0);
//		ArrayList<NBOrderInfo> infos=new ArrayList<NBOrderInfo>();
//		infos.add(new NBOrderInfo(1, 1, 3));
//		NBUserAddress address=db.getNBUserAddressByID(1);
//		
//		NBOrderWrap wrap=new NBOrderWrap(order, infos, user, address);
//		wrap.save();
		
		//新增用户
//		addUser();
		
		//新增address
//		addAddress();
		
		//管理员审核用户1的订单
//		user=db.getNBUserByID(1);
//		ArrayList<NBOrder> orders=db.getNBOrdersByUserEmail(user.getEmail());
//		NBOrder order1=orders.get(1);
//		order1.setState(2);
//		if(db.updateNBOrder(order1.getOrderID(), order1)==1){
//			System.out.print("order已经审核");
//		}
		
		检测所有Get方法();
		
		
	}
	private static void addUser(){
		NBUser newUser=new NBUser(0, "zgq1@b2c", "zgq", "admin", 0, new java.util.Date(), null);
		newUser=db.insertNBUser(newUser);
		System.out.println(newUser);
	}
	public static void addAddress(){
		NBUserAddress newAddress=new NBUserAddress(0, 1, "zgq", "my address", "150000", "0451-88881110", "18646083168", 1);
		newAddress=db.insertNBUserAddress(newAddress);
	}
	public static void 检测所有Get方法(){
		System.out.println(db.getNBCategoryByID(1));
		System.out.println(db.getNBOrder(1));
		System.out.println(db.getNBCategoryByName("考研"));
		System.out.println(db.getNBOrderInfos());
		System.out.println(db.getNBOrderInfosByNBOrderID(1));
		System.out.println(db.getNBOrderInfosByNBProductID(1));
		System.out.println(db.getNBOrders());
		
		System.out.println(db.getNBOrdersByUserEmail("michael@163.com"));
		
		System.out.println(db.getNBOrdersByUserEmailAndDateRange("michael@163.com", new java.util.Date(2013-1900,0,1), new java.util.Date(2014-1900,11,11)));
		System.out.println(db.getNBOrderWrapsByDateRange(new java.util.Date(2013-1900,0,1), new java.util.Date(2014-1900,11,11)));
		
		System.out.println(db.getNBProductByID(1));
		System.out.println(db.getNBProductCommentsByProductID(1));
		System.out.println(db.getNBProductsByCategoryName("图书音像"));
		System.out.println(db.getNBProductsByName("大学"));
		System.out.println(db.getNBUserAddressesByUserEmail("michael@163.com"));
		System.out.println(db.getNBUserByID(1));
		System.out.println(db.getNBUsers());
		System.out.println(db.getNBVIPCategoryByNBUserEmail("michael@163.com"));
		System.out.println(db.getNBVIPCategoryByScore(10));
	}
	private static DB db=DB.getInstance();
}
