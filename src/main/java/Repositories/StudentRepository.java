package Repositories;

import entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student addStudent(Student student);
    Student editStudent(Student student);
    boolean deleteStudentById(Long id);
    Student getStudentById(Long id);
    List<Student> getAllStudents();
}
