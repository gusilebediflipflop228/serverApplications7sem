package SP.EmulatorServer.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(nullable = false)
    private String created_at;

    @UpdateTimestamp
    @Column(nullable = false)
    private String updated_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "attendance_student",
            joinColumns = @JoinColumn(name = "attendance_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> listOfStudents =  new ArrayList<>();
}
