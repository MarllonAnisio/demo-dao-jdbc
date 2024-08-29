package application;

import java.util.Scanner;

import model.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class TesteJdbcDepartment {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		System.out.println("==== TEST 1: Department insert  ==== ");
		
		Department dep = new Department(null, "Nome");

		DepartmentDao department = DaoFactory.createDepartmentDao();
		department.insert(dep);
		System.out.println(dep);
		
		System.out.println("==== ======== end ========  ==== ");
	}

}
