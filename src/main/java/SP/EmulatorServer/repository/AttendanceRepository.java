package SP.EmulatorServer.repository;

import SP.EmulatorServer.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    Attendance add(Long attendanceId);
    Attendance update(Long attendanceId);
    void deleteById(Long attendanceId);
    Optional<Attendance> findById(Long id);
    List<Attendance> findAll();
    Optional<Attendance> findByLessonId(Long lessonId);
    boolean addDataByLessonId(Long lessonId);
    void deleteByLessonId(Long lessonId);
}
