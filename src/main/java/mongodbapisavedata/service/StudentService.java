package mongodbapisavedata.service;

import java.util.List;
import java.util.Optional;

import mongodbapisavedata.dto.Student;

public interface StudentService {

	void createStudent(Student student);

	Optional<Student> readStudentById(String id);

	List<Student> readAllStudent(Student student);

	void updateStudent(Student student);

	void deleteStudent(String id);
}
