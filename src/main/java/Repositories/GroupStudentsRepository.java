package Repositories;

import entity.GroupStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupStudentsRepository extends JpaRepository<GroupStudents, Long> {
    GroupStudents addGroupStudents(GroupStudents groupStudents);
    GroupStudents editGroupStudents(GroupStudents groupStudents);
    boolean deleteGroupStudentsById(Long id);
    GroupStudents getGroupStudentsById(Long id);
    List<GroupStudents> getAllGroupStudents();
}
