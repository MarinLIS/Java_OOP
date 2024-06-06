package HomeTask_OOP.Task_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* Задача 4 (домашнее задание)

Создать класс УчительСервис и реализовать аналогично проделанному на семинаре.
Создать класс УчительВью и реализовать аналогично проделанному на семинаре.
Создать класс УчительКонтроллер и реализовать возможность создания, редактирования 
конкретного учителя и отображения списка учителей, имеющихся в системе.
 */

public class TeacherService<T extends User> {
    private TeacherGroup<Teacher> teacherGroup;
    private  final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }


    public List<Teacher> getInfoTeachers() {
        return teachers;
    }

    public void removeStudentByFIA(String firstName, String lastName, String middleName) {
        Iterator<Teacher> iterator = teacherGroup.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName)
                    && teacher.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
        Collections.sort(teacherList);
        return teacherList;
    }

    public List<Teacher> getsortedTeacherListFiO() {
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
        teacherList.sort(new UserComparator<Teacher>());
        return teacherList;
    }

   
    public void create(String firstName, String middleName, String lastName) {
        int maxId = 0;
        for (Teacher teacher : teachers) {
            if (maxId < teacher.getTeacherId()) {
                maxId = teacher.getTeacherId();
            }
        }
        Teacher teacher = new Teacher(firstName, middleName, lastName, ++maxId);
        teachers.add(teacher);
    }
}
