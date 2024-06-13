package HomeTask_OOP.Task_6.OldCode.Service;

import HomeTask_OOP.Task_6.OldCode.Data.Student;
import HomeTask_OOP.Task_6.OldCode.Data.StudentGroup;
import HomeTask_OOP.Task_6.OldCode.Data.Teacher;
import HomeTask_OOP.Task_6.OldCode.Data.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Student getStudentFromStudentGroup(String firstName, String lastName){
        Iterator<Student> iterator = studentGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
               && student.getLastName().equalsIgnoreCase(lastName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент не найден", firstName, lastName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<Student> getSortedStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<Student> getSortedByFIOStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}