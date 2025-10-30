package Repositories;

import entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Subject addSubject(Subject subject);
    Subject editSubject(Subject subject);
    boolean deleteSubjectById(Long id);
    Subject getSubjectById(Long id);
    List<Subject> getAllSubjects();
}
