package SP.EmulatorServer.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.time.LocalDate;

@Data

@Entity
@Table(name = "lesson")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "startDate")
    private LocalDate startDate;

    @Column(name = "lessonNumber")
    private int lessonNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groupStudents_id")
    private GroupStudents groupStudents;
}
