package SP.EmulatorServer.repository;

import SP.EmulatorServer.entity.Attendance;
import SP.EmulatorServer.entity.GroupStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GroupStudentsRepository extends JpaRepository<GroupStudents, Long> {
    GroupStudents add(Long groupStudentsId);
    GroupStudents update(Long groupStudentsId);
    void deleteById(Long id);
    GroupStudents findGroupStudentsById(Long id);
    List<GroupStudents> getAll();
}
