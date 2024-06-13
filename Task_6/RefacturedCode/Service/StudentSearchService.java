package HomeTask_OOP.Task_6.RefacturedCode.Service;

import HomeTask_OOP.Task_6.RefacturedCode.Data.Student;

public interface StudentSearchService {

    Student findStudent(String firstName, String secondName);
}