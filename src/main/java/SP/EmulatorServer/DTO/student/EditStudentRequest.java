package SP.EmulatorServer.DTO.student;

import SP.EmulatorServer.enums.StudentStatus;
import lombok.Data;

@Data
public class EditStudentRequest {
    Long Id;
    String firstName;
    String middleName;
    String lastName;
    Long groupId;
    StudentStatus status;
}
