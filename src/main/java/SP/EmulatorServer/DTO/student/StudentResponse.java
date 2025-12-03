package SP.EmulatorServer.DTO.student;

import SP.EmulatorServer.enums.StudentStatus;
import lombok.Data;

@Data
public class StudentResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private StudentStatus status;
    private String groupName;
}
