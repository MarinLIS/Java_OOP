package HomeTask_OOP.Task_4;

import java.util.List;

/*Задача 4 (домашнее задание)

Создать класс УчительСервис и реализовать аналогично проделанному на семинаре.
Создать класс УчительВью и реализовать аналогично проделанному на семинаре.
Создать класс УчительКонтроллер и реализовать возможность создания, редактирования 
конкретного учителя и отображения списка учителей, имеющихся в системе.
 */
public class TeacherController implements UserController{
    
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    public void removeStudentByFIA(String firstName, String lastName, String middleName) {
        teacherService.removeStudentByFIA(firstName, lastName, middleName);
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> teacherList = teacherService.getSortedTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    List<Teacher> getsortedTeacherListFiO() {
        List<Teacher> teacherList = teacherService.getsortedTeacherListFiO();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.create(firstName, middleName, lastName);
        ;
    }
    
    public List<Teacher> getAllTeacher() {
        return teacherService.getInfoTeachers();
    }

    public void printAllTeacher() {
        teacherView.sendOnConsole(getAllTeacher());
    }

  

}
