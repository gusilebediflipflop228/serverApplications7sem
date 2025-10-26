package ViewModels;

import lombok.*;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class AttendanceViewModel {
    private Long id;
    List<StudentViewModel> students;
    private LessonViewModel lesson;
}