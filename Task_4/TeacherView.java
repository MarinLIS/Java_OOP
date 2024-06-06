package HomeTask_OOP.Task_4;

/*Задача 4 (домашнее задание)

Создать класс УчительСервис и реализовать аналогично проделанному на семинаре.
Создать класс УчительВью и реализовать аналогично проделанному на семинаре.
Создать класс УчительКонтроллер и реализовать возможность создания, редактирования 
конкретного учителя и отображения списка учителей, имеющихся в системе.
 */
import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getTeacherId());
        }
    }
}
