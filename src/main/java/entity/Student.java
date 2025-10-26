package entity;

import entity.enums.StudentStatus;
import jakarta.persistence.*;
import lombok.*;

@Data

@Entity
@Table (name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="patronymic")
    private String patronymic;

    @Column(name="studentsStatus")
    private StudentStatus studentStatus;

    @Column(name="groupStudents")
    private GroupStudents groupStudents;
}
