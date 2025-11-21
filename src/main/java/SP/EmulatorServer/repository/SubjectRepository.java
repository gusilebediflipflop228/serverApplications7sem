package SP.EmulatorServer.repository;

import SP.EmulatorServer.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Subject add(Long subjectId);
    Subject update(Long subjectId);
    void deleteById(Long subjectId);
    Subject getById(Long subjectId);
    List<Subject> findAll();
}
