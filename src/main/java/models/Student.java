package models;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Student {
    private Long id;
    private String firstname;
    private String lastname;
    private String patronymic;
    private StudentStatus studentStatus;
    private GroupStudents groupStudents;
}
