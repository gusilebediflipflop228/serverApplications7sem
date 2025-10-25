package entity;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Professor {
    private Long id;
    private String firstname;
    private String lastname;
    private String patronymic;
}
