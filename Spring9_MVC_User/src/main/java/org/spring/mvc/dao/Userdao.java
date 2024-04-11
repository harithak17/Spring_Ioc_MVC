package org.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.spring.mvc.beans.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Userdao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(User e) {
		int sub = 0;
		if (e.isSubscribed() == true)
			sub = 1;

		String sql = "insert into users(name, email, phone, dob, subscribed, gender, country) values('" + e.getName()
				+ "','" + e.getEmail() + "'," + e.getPhone() + ",'" + e.getDob() + "','" + sub + "','" + e.getGender()
				+ "','" + e.getCountry() + "')";
		return template.update(sql);
	}

	public List<User> getUsers() {
		return template.query("select * from users", new RowMapper<User>() {
			public User mapRow(ResultSet rs, int row) throws SQLException {
				User e = new User();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setPhone(rs.getString(4));
				e.setDob(rs.getString(5));
				e.setSubscribed(rs.getBoolean(6));
				e.setGender(rs.getString(7));
				e.setCountry(rs.getString(8));
				return e;
			}
		});
	}

	public int delete(int id) {
		String sql = "delete from users where id=" + id;
		return template.update(sql);
	}

	public User getUserById(int id) {
		String sql = "select * from users where id=?";
		System.out.println("ID:" + id);
		System.out.println("Query:" + sql);
		return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<User>(User.class));
	}

	public int update(User u) {
		
		System.out.print("Inside Update");
		System.out.println(u);
		String sql = "update users set name='" + u.getName() + "',email='" + u.getEmail() + "',phone='" + u.getPhone()
				+ "',dob='" + u.getDob() + "',subscribed='" + getSubs(u.isSubscribed()) + "',gender='" + u.getGender()
				+ "',country='" + u.getCountry() + "'where id=" + u.getId();
		return template.update(sql);
	}

	private int getSubs(boolean val) {
		int s = 0;
		if (val == true)
			s = 1;
		return s;
	}
}
