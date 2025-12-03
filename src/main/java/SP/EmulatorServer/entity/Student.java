package SP.EmulatorServer.entity;

import SP.EmulatorServer.enums.StudentStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.List;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String middleName;

    @Enumerated(EnumType.STRING)
    @Column(name = "studentsStatus")
    private StudentStatus studentStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groupStudents_id")
    private GroupStudents groupStudents;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "listOfStudents")
    private List<Attendance> attendance;

    @CreationTimestamp
    @Column(nullable = false)
    private String created_at;

    @UpdateTimestamp
    @Column(nullable = false)
    private String updated_at;
}
