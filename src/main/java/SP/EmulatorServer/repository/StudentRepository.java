package SP.EmulatorServer.repository;

import SP.EmulatorServer.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student add(Long studentId);
    Student update(Long studentId);
    void deleteById(Long id);
    Student getById(Long id);
    List<Student> findAll();
}
