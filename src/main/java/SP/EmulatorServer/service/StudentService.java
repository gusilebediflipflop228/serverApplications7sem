package SP.EmulatorServer.service;

import SP.EmulatorServer.DTO.student.CreateStudentRequest;
import SP.EmulatorServer.DTO.student.EditStudentRequest;
import SP.EmulatorServer.DTO.student.StudentResponse;
import SP.EmulatorServer.entity.GroupStudents;
import SP.EmulatorServer.entity.Student;
import SP.EmulatorServer.mapper.StudentMapper;
import SP.EmulatorServer.repository.GroupRepository;
import SP.EmulatorServer.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private StudentMapper studentMapper;

    public List<StudentResponse> getStudentsByGroup(Long groupId){
        List<Student> students = studentRepository.getStudentsByGroupStudents_Id(groupId);
        List<StudentResponse> studentResponseList = new ArrayList<>();
        for(Student student : students) {
            StudentResponse studentResponse = studentMapper.toResponse(student);
            studentResponseList.add(studentResponse);
        }
        return studentResponseList;
    }

    public StudentResponse getStudentByStudentId(Long studentId){
        Student student = studentRepository.getById(studentId);
        return studentMapper.toResponse(student);
    }

    public StudentResponse addStudent(CreateStudentRequest request){
        Student student = studentMapper.toEntity(request, groupRepository.findById(request.getGroupId()).orElse(null));
        Student savedStudent = studentRepository.save(student);
        return studentMapper.toResponse(savedStudent);
    }

    public StudentResponse updateStudent(EditStudentRequest request){
        Student student = studentRepository.getById(request.getId());
        GroupStudents group = groupRepository.getById(request.getGroupId());
        studentMapper.updateEntity(request, student, group);
        studentRepository.save(student);
        return studentMapper.toResponse(student);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

}
