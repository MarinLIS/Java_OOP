package HomeTask_OOP.Task_6.RefacturedCode.Service;

import HomeTask_OOP.Task_6.RefacturedCode.Data.Student;
import HomeTask_OOP.Task_6.RefacturedCode.Data.StudentGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentSearch extends StudentGroupQueryService{
    private final StudentGroup studentGroup;

    public StudentSearch(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
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
        if(result.isEmpty()){
            throw new IllegalStateException(
                    String.format("Студент не найден", firstName, lastName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента");
        }
        return result.get(0);
    }

    @Override
    Student findStudent(String firstName, String lastName) {
        return null;
    }

    @Override
    List<Student> sortStudents(StudentGroup studentGroup) {
        return null;
    }
}