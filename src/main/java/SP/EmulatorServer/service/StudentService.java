package SP.EmulatorServer.service;

import SP.EmulatorServer.entity.Student;
import SP.EmulatorServer.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public  List<Student> getByGroupId(Long groupId) {
        this.studentRepository.getByIdGroup(groupId);
        return List.of();
    }



}
