package Database;

import model.NBOrder;

public class Test {
	public static void main(String[]args){
		DB db=DB.getInstance();
//		NBOrder order=new NBOrder(orderID, userID, orderDate, state, scoreGet, userAddressID)
		NBOrder order =new NBOrder(1, 1, new java.util.Date(2014-1900,6,25), 0, 0, 1, 100.0);
		System.out.println(order);
//		Integer a=db.insertNBOrder(order);
//		System.out.println(a);
	}
}
