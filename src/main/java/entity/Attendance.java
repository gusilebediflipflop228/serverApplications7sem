package entity;


import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@Data

@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="lesson")
    private Lesson lesson;

    @Column(name="listOftudents")
    private List<Student> listOfStudents;
}
