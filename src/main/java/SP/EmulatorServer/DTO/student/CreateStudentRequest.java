package SP.EmulatorServer.DTO.student;

import SP.EmulatorServer.enums.StudentStatus;
import lombok.Data;

@Data
public class CreateStudentRequest {
    private String firstName;
    private String lastName;
    private String middleName;
    private Long groupId;
    private StudentStatus studentStatus;
}
