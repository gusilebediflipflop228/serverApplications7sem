package entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Data

@Entity
@Table(name = "lesson")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="startDate")
    private LocalDate startDate;

    @Column(name="lessonNumber")
    private int lessonNumber;

    @Column(name="professor")
    private Professor professor;

    @Column(name="groupStudents")
    private GroupStudents groupStudents;
}
