package test.com;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int save(Employee emp) {
		String sql="insert into emps values("+emp.getId()+",'"+emp.getName()+"','"+emp.getCity()+"')";
		return jdbcTemplate.update(sql);
	}
	public int update(Employee emp) {
		String sql1="update emps set name='"+emp.getName()+"' where id="+emp.getId();
		return jdbcTemplate.update(sql1);
	}
	public int delete(Employee emp) {
		String sql="delete from emps where id=" + emp.getId();
		return jdbcTemplate.update(sql);
	}

}
