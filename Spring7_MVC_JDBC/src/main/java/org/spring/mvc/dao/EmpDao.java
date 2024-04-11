package org.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.spring.mvc.bean.Employee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template)
	{
		this.template=template;
	}
	public int save(Employee e)
	{
		String sql="insert into employee(name,salary,designation) values('"+e.getName()+"',"+e.getSalary()+",'"+e.getDesignation()+"')";
		return template.update(sql);
	}
	public int update(Employee e)
	{
		String sql="update employee set name='"+e.getName()+"',salary="+e.getSalary()+",designation='"+e.getDesignation()+"' where id="+e.getId();
		return template.update(sql);
	}
	public int delete(int id)
	{
		String sql="delete from employee where id="+id;
		return template.update(sql);
	}
	public Employee getEmpById(int id)
	{
		System.out.println("ID:"+id);
//		System.out.println("Query:"+sql);
		String sql="select * from employee where id=?";		
		return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	public List<Employee> getEmployees()
	{
		return template.query("select * from employee",new RowMapper<Employee>(){
			public Employee mapRow(ResultSet rs,int row)throws SQLException
			{
				Employee e=new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getDouble(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}
}
