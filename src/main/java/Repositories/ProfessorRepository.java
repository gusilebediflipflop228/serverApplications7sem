package Repositories;

import entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    Professor addProfessor(Professor professor);
    Professor editProfessor(Professor professor);
    boolean deleteProfessorById(Long id);
    Professor getProfessorById(Long id);
    List<Professor> getAllProfessors();
}
