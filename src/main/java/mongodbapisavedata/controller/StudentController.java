package mongodbapisavedata.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mongodbapisavedata.dto.Student;
import mongodbapisavedata.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
		
	public void createStudent(Student student) {
		
		studentService.createStudent(student);		
	}

	public Optional<Student> readStudentById(String id) {
		
		return studentService.readStudentById(id);
	}

	public List<Student> readAllStudent(Student student) {
		
		return studentService.readAllStudent(student);
	}

	public void updateStudent(Student student) {
		
		studentService.updateStudent(student);		
	}

	public void delete(String id) {
		
		studentService.deleteStudent(id);
	}
}
