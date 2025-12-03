package SP.EmulatorServer.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data

@Entity
@Table(name = "professors")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String patronymic;

    @CreationTimestamp
    @Column(nullable = false)
    private String created_at;

    @UpdateTimestamp
    @Column(nullable = false)
    private String updated_at;
}
