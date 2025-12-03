package SP.EmulatorServer.mapper;

import SP.EmulatorServer.DTO.student.CreateStudentRequest;
import SP.EmulatorServer.DTO.student.EditStudentRequest;
import SP.EmulatorServer.DTO.student.StudentResponse;
import SP.EmulatorServer.entity.GroupStudents;
import SP.EmulatorServer.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public Student toEntity(CreateStudentRequest createStudentRequest, GroupStudents group) {
    Student s = new Student();
    s.setFirstName(createStudentRequest.getFirstName());
    s.setLastName(createStudentRequest.getLastName());
    s.setMiddleName(createStudentRequest.getMiddleName());
    s.setStudentStatus(createStudentRequest.getStudentStatus());
    s.setGroupStudents(group);
    return s;
    }

    public StudentResponse toResponse(Student student){
        StudentResponse sr = new StudentResponse();
        sr.setFirstName(student.getFirstName());
        sr.setLastName(student.getLastName());
        sr.setMiddleName(student.getMiddleName());
        sr.setId(student.getId());
        sr.setGroupName(student.getGroupStudents().getName());
        sr.setStatus(student.getStudentStatus());
        return sr;
    }

    public void updateEntity(EditStudentRequest request, Student student, GroupStudents group) {
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setMiddleName(request.getMiddleName());
        student.setStudentStatus(request.getStatus());
        student.setGroupStudents(group);
    }
}
