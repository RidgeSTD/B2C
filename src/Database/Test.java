package Database;



import java.sql.PreparedStatement;

import model.*;
import Database.*;

public class Test {
	public static void main(String[]args){
		DB db=DB.getInstance();

		NBUser user=db.getNBUserByEmail("scofiled@163.com");
		System.out.println();
		
		
	}
}
