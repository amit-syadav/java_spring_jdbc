package amit.learns.jdbc.mysql;

import amit.learns.jdbc.entities.Student;

public interface DataSetterDao {

	int insert(Student student);

	void select();
}


