package SP.EmulatorServer;

import SP.EmulatorServer.entity.GroupStudents;
import SP.EmulatorServer.entity.Student;
import SP.EmulatorServer.entity.enums.StudentStatus;
import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void test() {
        String groupName = "test";
        GroupStudents groupStudents1 = new GroupStudents(922337L, groupName);
        Student student1 = new Student(13513535L, "Timur", "Ashirmametov", "Maratovich", StudentStatus.EXPELLED, groupStudents1);

        System.out.println(groupStudents1);
        System.out.println(student1);
    }
}
