package HomeTask_OOP.Task_6.RefacturedCode.Service;

import HomeTask_OOP.Task_6.RefacturedCode.Data.Student;

import java.util.List;

public interface SortStudentGroup extends StudentSortService{
    @Override
    List<Student> sortStudents();
}