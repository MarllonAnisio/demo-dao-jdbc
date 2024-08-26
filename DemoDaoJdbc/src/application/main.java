package application;

import java.util.Date;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class main {

	public static void main(String[] a) {
		
		
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller( 21, "Bob", "Bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller.toString());
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		
	}
}
