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
		return db;
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


	public ArrayList<NBOrder> getNBOrders(){
		ArrayList<NBOrder> list=new ArrayList<NBOrder>(1000);
		Statement s;
		try {
			s = connection.createStatement();
			ResultSet rs = s.executeQuery("select * from NBOrder");
			while(rs.next()){
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	public ArrayList<NBOrderInfo> getNBOrderInfos(){
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
	public NBOrder getNBOrder(Integer orderID){
		return null;
	}
	
	public ArrayList<NBOrder> getNBOrdersByUserEmail(String email){
		return null;
	}
	public ArrayList<NBOrderInfo> getNBOrderInfosByNBOrderID(Integer orderID){
		return null;
	}
	public ArrayList<NBOrderInfo> getNBOrderInfosByNBProductID(Integer productID){
		return null;
	}
	public Double getNBOrderPriceByOrderID(Integer orderID){
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
	public NBUser getUserByID(Integer id){
		return null;
	}
	public NBUser getUserByEmail(String email){
		//remember to set level string
		//using getNBVIPCategoryByscore
		return null;
		
	}
	
	public ArrayList<NBUserAddress> getNBUserAddressesByUserEmail(String email){
		return null;
	}
	public ArrayList<NBUserAddress> getNBUserAddressesByUserEmailIncludingInactive(String email){
		return null;
	}
	public NBVIPCategory getNBVCategoryByNBUserEmail(String eamil){
//		return null;
		
	}
	public NBVIPCategory getNBVCategoryByScore(Integer score){
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
	public Integer insertNBOrderInfo(NBOrderInfo orderInfo){
		return 0;
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
			logger.info("insert user success"+user.getEmail());
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	public Integer insertNBUserAddress(NBUserAddress address){
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
	public Integer updateNBOrder(Integer orderID,NBOrder newOrder){
		return 0;
	}
	public Integer updateNBOrderInfo(Integer orderID,Integer productID,NBOrderInfo newOrderInfo){
		return 0;
	}
	public Integer updateNBProduct(Integer productID,NBProduct newProduct){
		return 0;
	}
//	public Integer updateNBProductComment(NBProductComment comment){
//		return 0;
//	}
	public Integer updateNBUser(String email,NBUser newUser){
		return 0;
	}
	
	/**
	 * 更新用户地址，由于之前没有加主键，所以更新方式是提供旧的address对象和新的address对象。
	 * @param oldaddress 旧地址
	 * @param newAddress 新地址
	 * @return 成功1，失败0
	 */
	public Integer updateNBUserAddress(NBUserAddress oldaddress,NBUserAddress newAddress){
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
	public Integer deleteNBOrderInfo(NBOrderInfo orderInfo){
		return 0;
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
	public Integer deleteNBUserAddress(NBUserAddress address){
		return 0;
	}
	public Integer deleteNBVIPCategory(NBVIPCategory vipCategory){
		return 0;
	}
}
