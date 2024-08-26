package application;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class main {

	public static void main(String[] a) {
		
		
		
		Department obj = new Department(1, "Books");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("==== TEST 1: Seller findById  ==== ");
		Seller seller = sellerDao.findById(3);
	
		System.out.println(seller);
		System.out.println("=============  END  ============== ");
	}
}
