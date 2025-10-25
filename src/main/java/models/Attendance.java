package models;

import lombok.*;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Attendance {
    private Long id;
    private Lesson lesson;
    private List<Student> listOfStudents;
}
