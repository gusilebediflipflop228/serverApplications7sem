package SP.EmulatorServer.controller;


import SP.EmulatorServer.DTO.student.CreateStudentRequest;
import SP.EmulatorServer.DTO.student.EditStudentRequest;
import SP.EmulatorServer.DTO.student.StudentResponse;
import SP.EmulatorServer.entity.Student;
import SP.EmulatorServer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudentsByGroup/{id}")
    public List<StudentResponse> getStudentsByGroup(@PathVariable Long id){
        return studentService.getStudentsByGroup(id);
    }

    @GetMapping("/getStudentById/{id}")
    public StudentResponse getStudentById(@PathVariable Long id){
        return studentService.getStudentByStudentId(id);
    }

    @PostMapping("/addStudent")
    public StudentResponse addStudent(@RequestBody CreateStudentRequest request){
        return studentService.addStudent(request);
    }

    @PutMapping("/editStudent")
    public StudentResponse editStudent(@RequestBody EditStudentRequest request) {
        return studentService.updateStudent(request);
    }

    @DeleteMapping("/deleteStudent")
    public void deleteStudent(@RequestBody Long id){
        studentService.deleteStudent(id);
    }
}
