package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import model.Department;
import model.dao.DepartmentDao;

public class DepartmentDaoJDBC implements DepartmentDao{
	
	private Connection conn;
	
	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	public void insert(Department obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("INSERT INTO department\r\n"
					+ "(Name)\r\n"
					+ "VALUES(?)",Statement.RETURN_GENERATED_KEYS);
			st.setString(1, obj.getName());
			int rowsAffected = st.executeUpdate();
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			}else {
				throw new DbException("UNEXPECTED ERROR! NO ROWS AFFECTED!!!");
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatemant(st);
		}
		
	}

	@Override
	public void update(Department obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("UPDATE department\r\n"
					+ "		SET Name = ?\r\n"
					+ "		WHERE Id = ?");
			
			st.setString(1, obj.getName());
			st.setInt(2, obj.getId());
			st.executeUpdate();
			
			int  rowsAffected = st.executeUpdate();
			if(rowsAffected == 0) {
				throw new DbException("Update Fail");
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatemant(st);
		}
		
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM department\r\n"
					+ "WHERE Id = ?");
			
			st.setInt(1, id);
			int rows = st.executeUpdate();
			if(rows == 0) {
				throw new DbException("Delete Unsuccessful");
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatemant(st);
		}
		
	}

	@Override
	public Department findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByName(String nome) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM department\r\n"
					+ "WHERE Name = ?");
			
			st.setString(1, nome);
			int rows = st.executeUpdate();
			if(rows == 0) {
				throw new DbException("Delete Unsuccessful");
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatemant(st);
		}
		
	}

}
