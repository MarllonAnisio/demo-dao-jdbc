package application;

import java.util.Date;
import java.util.List;

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
		System.out.println("");
		
		System.out.println("==== TEST 2: Seller findByDepartment  ==== ");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj1 : list) {
			System.out.println(obj1);
		}
		System.out.println("");
		
		System.out.println("==== TEST 3: Seller findAll  ==== ");
		list = sellerDao.findAll();
		for(Seller obj1 : list) {
			System.out.println(obj1);
		}
		System.out.println("");
		
		System.out.println("==== TEST 4: Seller Insert  ==== ");
		
		Seller newSeller = new Seller(null,"Jhonnathen", "Jhonnathen@gmail.com",new Date(),7500.0,department);
		System.out.println(newSeller);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = "+ newSeller.getId());
		System.out.println("");
		
		System.out.println("=============  END  ============== ");
	}
}
