package SP.EmulatorServer.ViewModel;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class LessonViewModel {
    private Long id;
    private LocalDate startDate;
    private int lessonNumber;
    private ProfessorViewModel professor;
}
