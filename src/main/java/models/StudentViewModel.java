package models;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class StudentViewModel {
    private Long id;
    private String firstname;
    private String lastname;
    private String patronymic;
    private GroupStudentsViewModel groupStudents;
}
