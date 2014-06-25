package Database;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

import model.*;
/**
 * 数据库操作类
 * 大家凡是用到数据库的话都这样写：
 * DB db=DB.getInstance();
 * db.someMethod();

 * @author 赵国铨
 *
 */
public class DB {
	public static void main(String[] args){
		//for testing
	}
	private DB(){
		try{
			//TODO connect to m
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/B2C.NB","root","");
//			Statement s=con.createStatement();
			logger.info("connection set");
//			 ResultSet rsTables = connection.getMetaData().getTables(null, null, "student", null);  
//             if(rsTables.next()){  
//                 logger.info("student table already exsit");  
//             } else {  
//            	 Statement s=connection.createStatement();
//                 s.executeUpdate("create table student (sid Integer,name text,gender text,age Integer,classNum Integer,password text,birthDate date);");
//                 logger.fine("create student success");
//                 
//             }  
//             rsTables.close();
//             rsTables = connection.getMetaData().getTables(null, null, "Admin", null);  
//             if(rsTables.next()){  
//                 logger.info("admin table already exsit");  
//             } else {  
//            	 Statement s=connection.createStatement();
//                 s.executeUpdate("create table admin (aid Integer,password text);");
//                 s.executeUpdate("insert into admin values(1,'admin')");
//                 logger.fine("create admin success");
//             }  
//             rsTables.close();
//             rsTables = connection.getMetaData().getTables(null, null, "score", null);  
//             if(rsTables.next()){  
//                 logger.info("score table already exsit");  
//             } else {  
//            	 Statement s=connection.createStatement();
//                 s.executeUpdate("create table score (aid Integer,className text,score float);");
////                 s.execute("insert into admin values(1,'admin')");
//                 logger.fine("create socre success");
//             }  
//             rsTables.close();
//             connection.close();
             
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}


	public static DB getInstance(){
		if(db!=null){
			return db;
		}
		else{
			db=new DB();
			return db;
		}
	}
	private static DB db=new DB();
	private Connection connection;
//	private PreparedStatement preparedStatement;
	private Logger logger;
	/**
	 * 验证用户
	 * @param email 用户email
	 * @param password
	 * @return 1成功 0失败
	 */
	public Integer validataUser(String email,String password){
		PreparedStatement p;
		try {
			p = connection.prepareStatement("select * from nbuser where email=? and password=?");
			p.setString(1, email);
			p.setString(2,password);
			p.execute();
			logger.info("user " +email+" validated");
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public NBAdmin validateAdmin(String username,String password){
		try {
			PreparedStatement p=connection.prepareStatement("select * from NBAdmin where username=? and password=?");
			p.setString(1, username);
			p.setString(2, password);
			ResultSet rs=p.executeQuery();
			while(rs.next()){
				NBAdmin admin=new NBAdmin(rs.getString(1),rs.getString(2));
				logger.info("return admin");
				return admin;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.severe("get admin failed");
		return null;

	}
	public ArrayList<NBCategory> getNBCategorys(){
		ArrayList<NBCategory> list=new ArrayList<NBCategory>(100);
		try {
			PreparedStatement p=connection.prepareStatement("select * from NBCategory;");
			ResultSet rs=p.executeQuery();
			while (rs.next()){
				NBCategory tempCateory=new NBCategory(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
				list.add(tempCateory);				
			}
			for (NBCategory temp:list){
				//TODO
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	/**
	 * 得到全部订单
	 * @author 赵国铨
	 * 2014年6月25日
	 * @return 订单的ArrayLIst
	 */
	public ArrayList<NBOrder> getNBOrders(){
		ArrayList<NBOrder> list=new ArrayList<NBOrder>(1000);
		Statement s;
		try {
			s = connection.createStatement();
			ResultSet rs = s.executeQuery("select * from NBOrder");
			while(rs.next()){
				NBOrder tempOrder=new NBOrder(rs.getInt(1), rs.getInt(2),new java.util.Date(rs.getDate(3).getTime()), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDouble(7));
				list.add(tempOrder);
				logger.info("order add "+tempOrder);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.severe("get all orders failed");
		}
		return null;

	}
	/**
	 * 获得全部NBOrderInfo
	 * @author 赵国铨
	 * 2014年6月25日
	 * @return NBOrderInfo 的arrayLIst null为获取失败
	 */
	public ArrayList<NBOrderInfo> getNBOrderInfos(){
		ArrayList<NBOrderInfo> orderInfos=new ArrayList<NBOrderInfo>(400);
		try {
			PreparedStatement p = connection.prepareStatement("select * from nborderinfo");
			ResultSet rs=p.executeQuery();
			while (rs.next()){
				NBOrderInfo temp=new NBOrderInfo(rs.getInt(1), rs.getInt(2), rs.getInt(3));
				orderInfos.add(temp);
				logger.info("orderINfo added"+temp);
			}
			logger.info("all orderinfo selected");
			return orderInfos;
		} catch (SQLException e) {
			
			e.printStackTrace();
			logger.severe("get add orderinfo faild");
		}
		return null;
		
	}
	public ArrayList<NBProduct> getNBProducts(){
		return null;

	}
	public ArrayList<NBProductComment> getProductComments(){
		return null;

	}
	public ArrayList<NBUser> getNBUsers(){
		return null;

	}
	public ArrayList <NBUserAddress> getNBUserAddress(){
		return null;

	}
	public ArrayList<NBVIPCategory> getVIPCategorys(){
		return null;

	}
	
	/**
	 * 通过orderID得到NBOrder对象
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param orderID
	 * @return NBOrder对象
	 */
	public NBOrder getNBOrder(Integer orderID){
	
		try {
			PreparedStatement p=connection.prepareStatement("select * from nborder where orderid=?");
			p.setInt(1, orderID);
			ResultSet rs = p.executeQuery();
			while(rs.next()){
				NBOrder tempOrder=new NBOrder(rs.getInt(1), rs.getInt(2),new java.util.Date(rs.getDate(3).getTime()), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDouble(7));
				
				logger.info("order selected "+tempOrder);
				return tempOrder;
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
			logger.severe("get  order"+orderID+"failed");
		}
		return null;
	}
	
	/**
	 * 通过email得到用户的全部订单
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param email
	 * @return 该用户的全部订单
	 */
	public ArrayList<NBOrder> getNBOrdersByUserEmail(String email){
		try {
			ArrayList<NBOrder> orders=new ArrayList<NBOrder>();
			NBUser user=getNBUserByEmail(email);
			PreparedStatement p=connection.prepareStatement("select * from nborder where userID=?");
			p.setInt(1, user.getId());
			ResultSet rs = p.executeQuery();
			while(rs.next()){
				NBOrder tempOrder=new NBOrder(rs.getInt(1), rs.getInt(2),new java.util.Date(rs.getDate(3).getTime()), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDouble(7));
				orders.add(tempOrder);
				logger.info("order selected "+tempOrder);
			}
			logger.info("all orders belongs to "+user+" was selected");
			return orders;
		} catch (SQLException e) {
		
			e.printStackTrace();
			logger.severe("get this user's orders "+email+"failed");
		}
		return null;
	}
	
	/**
	 * 得到某用户的在末段时间的所有订单
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param email 用户email
	 * @param startDate 开始时间
	 * @param endDate 结束时间
	 * @return ordre的ArrayList null 为失败
	 */
	public ArrayList<NBOrder> getNBOrdersByUserEmailAndDateRange(String email,java.util.Date startDate,java.util.Date endDate){
		try {
			ArrayList<NBOrder> orders=new ArrayList<NBOrder>();
			NBUser user=getNBUserByEmail(email);
			PreparedStatement p=connection.prepareStatement("select * from nborder where userID=?");
			p.setInt(1, user.getId());
			ResultSet rs = p.executeQuery();
			while(rs.next()){
				NBOrder tempOrder=new NBOrder(rs.getInt(1), rs.getInt(2),new java.util.Date(rs.getDate(3).getTime()), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDouble(7));
				if(tempOrder.getOrderDate().after(startDate)&&tempOrder.getOrderDate().before(endDate));
					orders.add(tempOrder);
					
				logger.info("order selected "+tempOrder);
			}
			logger.info("all orders belongs to "+user+" in time range was selected");
			return orders;
		} catch (SQLException e) {
		
			e.printStackTrace();
			logger.severe("get this user's orders "+email+"failed");
		}
		return null;
	}
	
	/**
	 * 通过orderID得到全部相关订单信息
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param orderID int 订单的id
	 * @return 全部orderID的相关订单信息的arraylist null为失败
	 */
	public ArrayList<NBOrderInfo> getNBOrderInfosByNBOrderID(Integer orderID){
		ArrayList<NBOrderInfo> orderInfos=new ArrayList<NBOrderInfo>(400);
		try {
			PreparedStatement p = connection.prepareStatement("select * from nborderinfo where orderid=?");
			p.setInt(1, orderID);
			ResultSet rs=p.executeQuery();
			while (rs.next()){
				NBOrderInfo temp=new NBOrderInfo(rs.getInt(1), rs.getInt(2), rs.getInt(3));
				orderInfos.add(temp);
				logger.info("orderINfo added"+temp);
			}
			logger.info("all orderinfo selected");
			return orderInfos;
		} catch (SQLException e) {
			
			e.printStackTrace();
			logger.severe("get "+orderID+"'s orderinfo faild");
		}
		return null;
	}
	/**
	 * 得到productID指定的商品的所有订单信息
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param productID
	 * @return productID指定的商品的所有订单信息
	 */
	public ArrayList<NBOrderInfo> getNBOrderInfosByNBProductID(Integer productID){
		ArrayList<NBOrderInfo> orderInfos=new ArrayList<NBOrderInfo>(400);
		try {
			PreparedStatement p = connection.prepareStatement("select * from nborderinfo where productid=?");
			p.setInt(1, productID);
			ResultSet rs=p.executeQuery();
			while (rs.next()){
				NBOrderInfo temp=new NBOrderInfo(rs.getInt(1), rs.getInt(2), rs.getInt(3));
				orderInfos.add(temp);
				logger.info("orderINfo added"+temp);
			}
			logger.info("all orderinfo selected");
			return orderInfos;
		} catch (SQLException e) {
			e.printStackTrace();
			logger.severe("get product "+productID+" 's orderinfo faild");
		}
		return null;
	}
	public Double getNBOrderPriceByOrderID(Integer orderID){
		ArrayList<NBOrderInfo> orderInfos=getNBOrderInfosByNBOrderID(orderID);
		double price=0.0;
		for(NBOrderInfo o:orderInfos){
			NBProduct p=getNBProductByID(o.getProductID());
			price+=p.getDiscount();
		}
		return null;
	}
	public NBProduct getNBProductByID(Integer id){
		return null;
	}
	public ArrayList<NBProduct> getNBProductsByName(String name){
		return null;
	}
	public ArrayList<NBProductComment> getNBProductCommentsByProductID(Integer productID){
		return null;
	}
	public ArrayList<NBProductComment> getNBProductCommentsByUserEmail(Integer productID){
		return null;
	}
	public NBUser getNBUserByID(Integer id){
		return null;
	}
	public NBUser getNBUserByEmail(String email){
		//remember to set level string
		//using getNBVIPCategoryByscore
		return null;
		
	}
	/**
	 * 获取email对应用户的所有地址信息
	 * @author 赵国铨
	 * @param email email
	 * @return email对应用户的所有地址信息
	 */
	public ArrayList<NBUserAddress> getNBUserAddressesByUserEmail(String email){
		ArrayList<NBUserAddress> addresses=new ArrayList<NBUserAddress>();
		try{
			NBUser user=getNBUserByEmail(email);
			int userID=user.getId();
			PreparedStatement p=connection.prepareStatement("select * from nbuseraddress where userID=?");
			p.setInt(1,userID);
			ResultSet rs=p.executeQuery();
			while (rs.next()){
				NBUserAddress temp=new NBUserAddress(rs.getInt(1), rs.getInt(2), rs.getString(3)
						, rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
				if(temp.getIsActive()==1)
					addresses.add(temp);
				logger.info(temp.toString());
			}
			
			return addresses;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	/**
	 * 通过email获取用户地址 ，包括已经删除的地址
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param email
	 * @return 用户地址的ArrayList
	 * 
	 */
	public ArrayList<NBUserAddress> getNBUserAddressesByUserEmailIncludingInactive(String email){
		ArrayList<NBUserAddress> addresses=new ArrayList<NBUserAddress>();
		try{
			NBUser user=getNBUserByEmail(email);
			int userID=user.getId();
			PreparedStatement p=connection.prepareStatement("select * from nbuseraddress where userID=?");
			p.setInt(1,userID);
			ResultSet rs=p.executeQuery();
			while (rs.next()){
				NBUserAddress temp=new NBUserAddress(rs.getInt(1), rs.getInt(2), rs.getString(3)
						, rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
				addresses.add(temp);
				logger.info(temp.toString());
			}
			
			return addresses;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	public NBVIPCategory getNBVIPCategoryByNBUserEmail(String email){
//		return null;
		NBUser user=getNBUserByEmail(email);
		if(user!=null){
			return getNBVIPCategoryByScore(user.getScore());

		}
		return null;
	}
	public NBVIPCategory getNBVIPCategoryByScore(Integer score){
		ArrayList<NBVIPCategory> cate=new ArrayList<NBVIPCategory>(20);
		try {
			PreparedStatement p=connection.prepareStatement("select * from NBVIPCategory");
			ResultSet rs=p.executeQuery();
			while(rs.next()){
				cate.add(new NBVIPCategory(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4)));
			}
			NBVIPCategory selected=cate.get(0);
			for(NBVIPCategory temp: cate){
				if(temp.getLeastScore()>new Integer(score)){
					continue;
				}
				else{
					if(temp.getLeastScore()<selected.getLeastScore()){
						//select this because it is less
						selected=temp;
					}
					else{
						//continue
						continue;
					}
				}
			}
			return selected;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	//insert section
	// containing insert SQL 
	
	public Integer insertNBAdmin(NBAdmin admin){
		return 0;
	}
	public Integer insertNBCategory(NBCategory c){
		return 0;
	}
	public Integer insertNBOrder(NBOrder order){
		return 0;
	}
	
	/**
	 * 插入orderInfo
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param orderInfo 要插入的对象
	 * @return
	 */
	public Integer insertNBOrderInfo(NBOrderInfo orderInfo){
		try {
			PreparedStatement p = connection.prepareStatement("insert into nborderinfo values(?,?,?)");
			p.setInt(1,orderInfo.getOrderID());
			p.setInt(2,orderInfo.getProductID());
			p.setInt(4, orderInfo.getNumber());
			p.execute();
			
			logger.info(" orderinfo inserted:"+orderInfo);
			return 1;
		} catch (SQLException e) {
			
			e.printStackTrace();
			logger.severe("insert "+orderInfo+"faild");
		}
		return null;
	}
	public Integer insertNBProduct(NBProduct product){
		return 0;
	}
	public Integer insertNBProductComment(NBProductComment comment){
		return 0;
	}
	public Integer insertNBUser(NBUser user){
		try {
			PreparedStatement p =connection.prepareStatement("insert into NBUser values"
					+ "(null,?,?,?,?,?)");
			p.setString(1, user.getEmail());
			p.setString(2,user.getNickname());
			p.setString(3, user.getPassword());
			p.setInt(4, user.getScore());
			p.setDate(5, new java.sql.Date(new java.util.Date().getTime()));
			p.execute();
			logger.info("insert user success"+user);
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * 插入用户地址
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param address NBUserAddress对象  useraddressID ,isactive无需提供，任意值即可
	 * @return 1,0
	 */
	public Integer insertNBUserAddress(NBUserAddress address){
		try {
			PreparedStatement p =connection.prepareStatement("insert into nbuserAddress values"
					+ "(null,?,?,?,?,?,1)");
			p.setInt(1, address.getUserID());
			p.setString(2, address.getReceiverName());
			p.setString(3,address.getAddress());
			p.setString(4, address.getPostCode());
			p.setString(5, address.getTelephone());
			p.setString(6, address.getMobilePhone());
			//is active
			p.execute();
			logger.info("insert useraddress success"+address.toString());
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public Integer insertNBVIPCategory(NBVIPCategory vipCategory){
		return 0;
	}
	
	
	
	
	
	
	//update section
	//includeing UPDATE SQL
	public Integer updateNBAdmin(String username,NBAdmin newAdmin){
		return 0;
	}
	public Integer updateNBCategory(Integer categoryID,NBCategory newCategory){
		return 0;
	}
	
	
	/**
	 * 修改订单信息，只能修改state,score,userAddressID
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param orderID 需要修改的orderID
	 * @param newOrder 新的order对象
	 * @return 1成功 0失败
	 */
	public Integer updateNBOrder(Integer orderID,NBOrder newOrder){
		try {
			PreparedStatement p=connection.prepareStatement("update nborder "
					+ " set state=? ,scoreGet=?,userAddressID=?,where orderid=?");
			p.setInt(1, newOrder.getState());
			p.setInt(2, newOrder.getScoreGet());
			p.setInt(3, newOrder.getUserAddressID());
			p.setInt(4, newOrder.getOrderID());
			p.execute();
			logger.info("update orderinfo fine :"+newOrder);
		} catch (SQLException e) {
		
			e.printStackTrace();
			logger.severe("update order "+newOrder+" failed");
		}
		return null;
	}
	
	/**
	 * 更新NBOrderInfo，其实我觉得主要是更新数量，productID没什么改的需求
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param orderID 对应的order
	 * @param productID 对应的product
	 * @param newOrderInfo 新的OrderInfo对象
	 * @return 1成功更新   0失败
	 */
	public Integer updateNBOrderInfo(Integer orderID,Integer productID,NBOrderInfo newOrderInfo){
		try {
			
			PreparedStatement p = connection.prepareStatement("update nborderinfo set productID=?,number=? where orderID=? and productID=?");
			p.setInt(1, newOrderInfo.getProductID());
			p.setInt(2, newOrderInfo.getNumber());
			p.setInt(3, orderID);
			p.setInt(4,productID);
			p.execute();
			
			logger.info(" orderinfo updated:"+newOrderInfo);
			return 1;
		} catch (SQLException e) {
			
			e.printStackTrace();
			logger.severe("update "+newOrderInfo+"faild");
		}
		return null;
	}
	/**
	 * 只更改order和product确定的订单的数量
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param orderID
	 * @param productID
	 * @param newNum 希望更新的数量
	 * @return 1成功更新   0失败
	 */
	public Integer updateNBOrderInfo(Integer orderID,Integer productID,int newNumber){
		try {
			
			PreparedStatement p = connection.prepareStatement("update nborderinfo set number=? where orderID=? and productID=?");
			p.setInt(2, newNumber);
			p.setInt(3, orderID);
			p.setInt(4,productID);
			p.execute();
			
			logger.info(" orderinfo updated:orderid: "+orderID+"  producctid:"+productID);
			return 1;
		} catch (SQLException e) {
			
			e.printStackTrace();
			logger.severe("update faild");
		}
		return null;
	}
	public Integer updateNBProduct(Integer productID,NBProduct newProduct){
		return 0;
	}

	/**
	 * 更新用户信息，nickname和password
	 * 不需要提供原始 password的方法。
	 * @param email
	 * @param newUser
	 * @return
	 */
	public Integer updateNBUser(String email,NBUser newUser){
		try {
			PreparedStatement p=connection.prepareStatement("update nbuser "
					+ "set nickname=? ,password=? where email=?");
			p.setString(1, newUser.getNickname());
			p.setString(2, newUser.getPassword());
			p.setString(3, email);
			p.execute();
			logger.info("update user success "+newUser);
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * 更新用户信息，nickname和password
	 * @param email
	 * @param password
	 * @param newUser
	 * @return 1,0
	 */
	public Integer updateNBUser(String email,String password,NBUser newUser){
		try {
			PreparedStatement p=connection.prepareStatement("update nbuser "
					+ "set nickname=? ,password=? where email=? and password=?");
			p.setString(1, newUser.getNickname());
			p.setString(2, newUser.getPassword());
			
			p.setString(3, email);
			p.setString(4, password);
			
			p.execute();
			logger.info("update user success "+newUser);
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
	/**
	 * 更新用户地址，由于之前没有加主键，所以更新方式是提供旧的address对象和新的address对象。
	 * @param oldaddress 旧地址
	 * @param newAddress 新地址
	 * @return 成功1，失败0
	 */
	public Integer updateNBUserAddress(NBUserAddress oldaddress,NBUserAddress newAddress){
		try {
			PreparedStatement p=connection.prepareStatement("update nbuseraddress "
					+ "set receiverName=?,address=?,postcode=?,telephone=?,mobilephone=? "
					+ " where useraddressID=?");
			p.setString(1, newAddress.getReceiverName());
			p.setString(2, newAddress.getAddress());
			p.setString(3, newAddress.getPostCode());
			p.setString(4, newAddress.getTelephone());
			p.setString(5, newAddress.getMobilePhone());
			p.setInt(6, oldaddress.getUserAddressID());
			p.execute();
			logger.info("update address success "+newAddress);
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * 更新用户地址，由于之后有加主键，所以更新方式是提供userAddressID和新的address对象。
	 * @param userAddressID 旧地址id
	 * @param newAddress 新地址
	 * @return 成功1，失败0
	 */
	public Integer updateNBUserAddress(int userAddressID,NBUserAddress newAddress){
		try {
			PreparedStatement p=connection.prepareStatement("update nbuseraddress "
					+ "set receiverName=?,address=?,postcode=?,telephone=?,mobilephone=? "
					+ " where useraddressID=?");
			p.setString(1, newAddress.getReceiverName());
			p.setString(2, newAddress.getAddress());
			p.setString(3, newAddress.getPostCode());
			p.setString(4, newAddress.getTelephone());
			p.setString(5, newAddress.getMobilePhone());
			p.setInt(6, userAddressID);
			p.execute();
			logger.info("update address success "+newAddress);
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * 更新白金卡什么玩意的最低积分等
	 * @param categoryID 级别id
	 * @param newVipCategory 新级别
	 * @return 成功1 失败0
	 */
	public Integer updateNBVIPCategoryByID(Integer categoryID,NBVIPCategory newVipCategory){
		return 0;
	}
	
	/**
	 * 更新白金卡什么玩意的最低积分等
	 * @param categoryName 级别名称
	 * @param newVipCategory 新级别对象
	 * @return 成功1 失败0
	 */
	public Integer updateNBVIPCategoryByName(String categoryName,NBVIPCategory newVipCategory){
		return 0;
	}
	
	
	
	// delete section
	
	
	public Integer deleteNBAdmin(NBAdmin admin){
		return 0;
	}

	public Integer deleteNBCategory(NBCategory c){
		return 0;
	}
	public Integer deleteNBOrder(NBOrder order){
		return 0;
	}
	/**
	 * 删除Orderinfo信息，由参数决定删哪个
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param orderInfo 要删这个orderInfo
	 * @return 1成功 0失败
	 */
	public Integer deleteNBOrderInfo(NBOrderInfo orderInfo){
		try {
			
			PreparedStatement p = connection.prepareStatement("delete from nborderinfo where orderID=? and productID=?");
			p.setInt(3, orderInfo.getOrderID());
			p.setInt(4,orderInfo.getProductID());
			p.execute();
			logger.info(" delete orderinfo: success"+orderInfo);
			return 1;
		} catch (SQLException e) {
			
			e.printStackTrace();
			logger.severe("delete orderinfo"+orderInfo+" faild");
		}
		return null;
	}
	public Integer deleteNBProduct(NBProduct product){
		return 0;
	}
	public Integer deleteNBProductComment(NBProductComment comment){
		return 0;
	}
	public Integer deleteNBUser(NBUser user){
		return 0;
	}
	/**
	 * 通过提供原来的对象删除用户送货地址
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param address 希望删除的地址对象
	 * @return 1成功 0失败
	 */
	public Integer deleteNBUserAddress(NBUserAddress address){
		try {
			PreparedStatement p=connection.prepareStatement("update nbuseraddress "
					+ "set isActive=? "
					+ " where useraddressID=?");
			p.setInt(1,0);
			p.setInt(2, address.getUserAddressID());
			p.execute();
			logger.info("delete address success "+address);
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * 通过提供原来的addressID删除用户送货地址
	 * @author 赵国铨
	 * 2014年6月25日
	 * @param address 希望删除的地址对象
	 * @return 1成功 0失败
	 */
	public Integer deleteNBUserAddress(int userAddressID){
		try {
			PreparedStatement p=connection.prepareStatement("update nbuseraddress "
					+ "set isActive=? "
					+ " where useraddressID=?");
			p.setInt(1,0);
			p.setInt(2, userAddressID);
			p.execute();
			logger.info("delete address success ,userAddressid="+userAddressID);
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
			logger.severe("delete this userAdderess failed "+userAddressID);
		}
		return 0;
	}
	public Integer deleteNBVIPCategory(NBVIPCategory vipCategory){
		return 0;
	}
}
