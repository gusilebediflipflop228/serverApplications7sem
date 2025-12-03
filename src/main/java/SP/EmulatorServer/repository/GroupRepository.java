package SP.EmulatorServer.repository;

import SP.EmulatorServer.entity.GroupStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<GroupStudents, Long> {
    Optional<GroupStudents> findById(Long id);
    void deleteById(Long id);
}
