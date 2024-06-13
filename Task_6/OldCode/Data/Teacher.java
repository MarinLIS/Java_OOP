package HomeTask_OOP.Task_6.OldCode.Data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User {

    private Long teacherId;

    public Teacher(String firstName, String lastName, String middleName, LocalDate dateOfBirth) {
        super(firstName, lastName, middleName, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}