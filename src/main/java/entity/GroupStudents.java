package entity;


import jakarta.persistence.*;
import lombok.*;

@Data

@Entity
@Table(name = "groupStudents")
public class GroupStudents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
