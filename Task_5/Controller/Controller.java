package HomeTask_OOP.Task_5.Controller;


import java.util.List;

import HomeTask_OOP.Task_5.Model.Student;
import HomeTask_OOP.Task_5.Model.StudyGroup;
import HomeTask_OOP.Task_5.Model.Teacher;
import HomeTask_OOP.Task_5.Model.Type;
import HomeTask_OOP.Task_5.Model.User;
import HomeTask_OOP.Task_5.Service.DataService;
import HomeTask_OOP.Task_5.View.StudentView;
import HomeTask_OOP.Task_5.View.TeacherView;



public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();

    public void createStudent(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public List<User> getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            studentView.printOnConsole(student);
        }
        return userList;
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        service.create(firstName, middleName, middleName, Type.TEACHER);
    }

    public List<User> getAllTeacher() {
        List<User> userList = service.getAllTeacher();
        for (User user : userList) {
            Teacher teacher = (Teacher) user;
            teacherView.printOnConsole(teacher);
        }
        return userList;
    }

    public void createStudyGroup(List<Student> studentList, Teacher teacher) {
        if (studentList != null) {
            StudyGroup studyGroup = new StudyGroup(getAllStudent(), teacher);
            for (Student student : studentList) {
                studyGroup.addStudent(student);
            }
            studyGroup.addTeacher(teacher);
        }
    }

    public void getAllStudyGroup() {
        List<User> studentList = service.getAllStudent();
        for (User user : studentList) {
            studentView.printOnConsole((Student) user);
        }
        List<User> teacherList = service.getAllTeacher();
        for (User user : teacherList) {
            teacherView.printOnConsole((Teacher) user);
        }
    }
    
}
