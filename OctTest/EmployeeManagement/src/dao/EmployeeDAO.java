package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Employee;
import util.GetDBConnection;

public class EmployeeDAO {

	public int addEmployee(Employee e) {
		int x = 0;
		try(Connection conn = GetDBConnection.getConnection();){
			String sql = "insert into employee (name, email, salary, department) values (?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, e.getName());
			ps.setString(2, e.getEmail());
			ps.setDouble(3, e.getSalary());
			ps.setString(4, e.getDepartment());
			
			x = ps.executeUpdate();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return x;
	}

	public int updateEmployee(int id, String ename, String eemail, double esalary, String edepartment) {
		int x = 0;
		try(Connection conn = GetDBConnection.getConnection();){
			String sql = "update employee set name = ?, email = ?, salary = ?, department = ? where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ename);
			ps.setString(2, eemail);
			ps.setDouble(3, esalary);
			ps.setString(4, edepartment);
			ps.setInt(5, id);
			
			x = ps.executeUpdate();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return x;
	}

	public int deleteEmployee(int id) {
		int x = 0;
		try(Connection conn = GetDBConnection.getConnection();){
			String sql = "delete from employee where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			x = ps.executeUpdate();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return x;
	}

	public ArrayList<Employee> getAllEmployee() {
		ArrayList<Employee> list = new ArrayList<Employee>();
		try(Connection conn = GetDBConnection.getConnection();){
			String sql = "select * from employee";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setEmail(rs.getString("email"));
				e.setDepartment(rs.getString("department"));
				e.setSalary(rs.getDouble("salary"));
				list.add(e);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
}
