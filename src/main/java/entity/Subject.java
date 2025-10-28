package entity;

import jakarta.persistence.*;
import lombok.*;

@Data

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
