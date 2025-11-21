package SP.EmulatorServer.controller;
import SP.EmulatorServer.entity.Student;
import SP.EmulatorServer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

        @GetMapping("/{groupId}")
        public List<Student> getByGroupId(@PathVariable("groupId") Long groupId) {
            return this.studentService.getByGroupId(groupId);
        }

        @GetMapping("/home")
        public String home() {
            return "Home page";
        }
    }

