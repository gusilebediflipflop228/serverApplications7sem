package SP.EmulatorServer.repository;

import SP.EmulatorServer.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    Professor addById(Long professorId);
    Professor updateById(Long professorId);
    void deleteById(Long id);
    Professor getById(Long id);
    List<Professor> findAll();
}
