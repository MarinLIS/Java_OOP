package HomeTask_OOP.Task_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void removeStudentByFIA(String firstName, String lastName, String middleName) {
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentName().equals(firstName) && student.getStudentSurName().equals(lastName)
                    && student.getStudentMidName().equals(middleName)) {
                iterator.remove();
            }
        }
    }

    public List<Student> getsortedStudentListFiO() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new StudentComparator());
        return studentList;
    }
}
