package amit.learns.jdbc.mysql;

import org.springframework.jdbc.core.JdbcTemplate;

import amit.learns.jdbc.entities.Student;

public class DataSetterDaoImpl implements DataSetterDao {

	 
	JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DataSetterDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub

        String query = "insert into student(id, name, city) values(?,?,?)";

        int inserted_rows = jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return inserted_rows;
	}

}
