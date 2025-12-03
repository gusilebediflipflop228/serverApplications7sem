package SP.EmulatorServer.repository;

import SP.EmulatorServer.entity.Attendance;
import SP.EmulatorServer.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
