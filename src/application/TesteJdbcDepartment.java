package application;

import java.util.Scanner;

import model.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class TesteJdbcDepartment {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		System.out.println("==== TEST 1: Department insert  ==== ");
		
		Department dep = new Department(null, "Recursos humanos");

		DepartmentDao department = DaoFactory.createDepartmentDao();
		//department.insert(dep);
		System.out.println(dep);
		
		System.out.println("==== TEST 2: Department update  ==== ");
		//department.update(dep);
		System.out.println("UPDATE Completed!");
		
		System.out.println("==== TEST 3: Department Delete by Id  ==== ");
		System.out.println("enter an id to delete");
		//department.deleteById(Integer.parseInt(scann.nextLine()));
		System.out.println("Delete completed!");
		
		
		System.out.println("==== TEST 3.5: Department Delete by Name  ==== ");
		System.out.println("enter an Name to delete");
		//department.deleteByName(scann.nextLine());
		System.out.println("Delete completed!");
		
		
		System.out.println("==== TEST 4: find by id   ==== ");
		System.out.println("enter an id to find");
		System.out.println(department.findById(Integer.parseInt(scann.nextLine())));
		System.out.println("find completed!");
		
		
		
		
		
		
		System.out.println("==== ======== end ========  ==== ");
	}

}
