package HomeTask_OOP.Task_6.RefacturedCode.Service;

import HomeTask_OOP.Task_6.RefacturedCode.Data.Student;
import HomeTask_OOP.Task_6.RefacturedCode.Data.StudentGroup;

import java.util.List;

abstract class StudentGroupQueryService {
    abstract Student findStudent(String firstName, String lastName);
    abstract List<Student> sortStudents(StudentGroup studentGroup);
}
