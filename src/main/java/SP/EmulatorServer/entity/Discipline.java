package SP.EmulatorServer.entity;

import SP.EmulatorServer.enums.DisciplineName;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "disciplines")
public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true) // чтобы в бд не добавилось с таким же значением
    private DisciplineName name;

    @CreationTimestamp
    @Column(nullable = false)
    private String created_at;

    @UpdateTimestamp
    @Column(nullable = false)
    private String updated_at;
}
