package Repositories;

import entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
    Lesson addLesson(Lesson lesson);
    Lesson editLesson(Lesson lesson);
    boolean deleteLessonById(Long id);
    Lesson getLessonById(Long id);
    List<Lesson> getForTimeLessonsByProfessorId(Long id);
    List <Lesson> getForTimeLessonByGroupStudentsId(Long id);
    boolean deleteLessonsByProfessorId(Long id);
    boolean deleteLessonsByGroupStudentsId(Long id);
}
