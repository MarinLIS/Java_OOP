package HomeTask_OOP.Task_5.Service;

import java.util.ArrayList;
import java.util.List;

import HomeTask_OOP.Task_5.Model.Student;
import HomeTask_OOP.Task_5.Model.Teacher;
import HomeTask_OOP.Task_5.Model.Type;
import HomeTask_OOP.Task_5.Model.User;

public class DataService {
    private List<User> userList;

    /**
     * Конструктор класса DataService
     */
    public DataService() {
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    /**
     * Создание Id пользователя с учётом его типа
     * @param type тип пользователя
     * @return Id
     */
    private int getFreeId(Type type) {
        int lastId = 1;
        boolean istStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Teacher && !istStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && istStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }

    /**
     * Создание пользователя в зависимости от его типа
     * @param firstName Имя
     * @param secondName Отчество
     * @param lastName Фамилия
     * @param type тип пользователя
     */
    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeId(type);
        if (type == type.STUDENT) {
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }
        if (type == type.TEACHER) {
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }
    }

    /**
     * Поиск пользователя по Id в зависимости от его типа
     * @param type тип пользователя
     * @param id id пользователя
     * @return ФИО пользователя или null если не найден
     */
    public User getUserById(Type type, int id) {
        boolean istStudent = Type.STUDENT == type;
        for (User user : userList) {
            if(user instanceof Teacher && ((Teacher) user).getTeacherId() == id) {
                return user;
            }
            if(user instanceof Student && ((Student) user).getStudentId() == id) {
                return user;
            }
        }
        return null;
    }

    /**
     * Получение списка всех студентов
     * @return список студентов
     */
    public List<User> getAllStudent() {
        List<User> studentList = new ArrayList<>();
        for (User user : userList) {
            if(user instanceof Student) {
                studentList.add(user);
            }
        }
        return studentList;
    }


    /**
     * Получение списка всех учителей
     * @return список учителей
     */
    public List<User> getAllTeacher() {
        List<User> teacherList = new ArrayList<>();
        for (User user : userList) {
            if(user instanceof Teacher) {
                teacherList.add(user);
            }
        }
        return teacherList;
    }
}
