package entity;

import lombok.*;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Lesson {
    private Long id;
    private LocalDate startDate;
    private int lessonNumber;
    private Professor professor;
    private GroupStudents groupStudents;
}
