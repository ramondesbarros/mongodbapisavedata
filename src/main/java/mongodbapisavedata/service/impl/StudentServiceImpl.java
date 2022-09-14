package mongodbapisavedata.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mongodbapisavedata.dto.Student;
import mongodbapisavedata.repository.StudentRepository;
import mongodbapisavedata.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void createStudent(Student student) {

		studentRepository.save(student);
	}

	@Override
	public Optional<Student> readStudentById(String id) {

		return studentRepository.findById(id);
	}

	@Override
	public List<Student> readAllStudent(Student student) {

		return studentRepository.findAll();
	}

	@Override
	public void updateStudent(Student student) {

		studentRepository.findById(student.getId());
		// MAP.........................
		studentRepository.save(student);

	}

	@Override
	public void deleteStudent(String id) {

		studentRepository.deleteById(id);
	}
}
