package model.dao;

import java.util.List;

import model.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	void deleteByName(String nome);
	Department findById(Integer id);
	List<Department> findAll();
	
}
