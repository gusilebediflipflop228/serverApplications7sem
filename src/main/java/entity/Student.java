package entity;

import entity.enums.StudentStatus;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Data

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "studentsStatus")
    private StudentStatus studentStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groupStudents_id")
    private GroupStudents groupStudents;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "listOfStudents")
    private List<Attendance> attendance;
}
