package SP.EmulatorServer.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.List;
import java.time.LocalDate;

@Data

@Entity
@Table(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private int lessonNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groupStudents_id")
    private GroupStudents groupStudents;

    @CreationTimestamp
    @Column(nullable = false)
    private String created_at;

    @UpdateTimestamp
    @Column(nullable = false)
    private String updated_at;
}