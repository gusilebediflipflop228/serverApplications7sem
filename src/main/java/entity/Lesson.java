package entity;

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groupStudents_id")
    private GroupStudents groupStudents;

    @ManyToMany(mappedBy = "listOfLessons")
    private List<Attendance> listOfAttendance;
}
