package Repositories;

import entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    Attendance addAttendance(Attendance attendance);
    Attendance editAttendance(Attendance attendance);
    boolean deleteAttendanceById(Long id);
    Attendance getAttendanceById(Long id);
    List<Attendance> getAllAttendances();
    Attendance editAttendanceByLessonId(Long lessonId); // ? задать вопрос преподавателю
    boolean deleteAttendanceByLessonId(Long lessonId);
}
