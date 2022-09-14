package mongodbapisavedata.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mongodbapisavedata.dto.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
