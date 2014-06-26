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
		NBOrder order=new NBOrder(0, 1, new java.util.Date(), 0, 100, 1, 0);
		ArrayList<NBOrderInfo> infos=new ArrayList<NBOrderInfo>();
		infos.add(new NBOrderInfo(1, 1, 3));
		NBUserAddress address=db.getNBUserAddressByID(1);
		
		NBOrderWrap wrap=new NBOrderWrap(order, infos, user, address);
		wrap.save();
		
		//新增用户
		addUser();
		
		//新增address
		NBUserAddress newAddress=new NBUserAddress(0, 1, "zgq", "my address", "150000", "0451-88881110", "18646083168", 1);
		newAddress=db.insertNBUserAddress(newAddress);
		
		//管理员审核用户1的订单
		user=db.getNBUserByID(1);
		ArrayList<NBOrder> orders=db.getNBOrdersByUserEmail(user.getEmail());
		NBOrder order1=orders.get(1);
		order1.setState(2);
		if(db.updateNBOrder(order1.getOrderID(), order1)==1){
			System.out.print("order已经审核");
		}
		
		
	}
	private void addUser(){
		NBUser newUser=new NBUser(0, "zgq1@b2c", "zgq", "admin", 0, new java.util.Date(), null);
		newUser=db.insertNBUser(newUser);
		System.out.println(newUser);
	}
	private DB db=DB.getInstance();
}
