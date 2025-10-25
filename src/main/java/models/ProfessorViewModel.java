package models;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class ProfessorViewModel {
    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
}
