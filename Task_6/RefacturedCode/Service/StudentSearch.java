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

    public Student getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<Student> iterator = studentGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.isEmpty()){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    @Override
    Student findStudent(String firstName, String secondName) {
        return null;
    }

    @Override
    List<Student> sortStudents(StudentGroup studentGroup) {
        return null;
    }
}