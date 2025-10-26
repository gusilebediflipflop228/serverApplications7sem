package entity;

import jakarta.persistence.*;
import lombok.*;

@Data

@Entity
@Table (name = "professor")
public class Professor {
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
}
