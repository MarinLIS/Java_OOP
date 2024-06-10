package HomeTask_OOP.Task_5.Model;
/*Создать класс УчебнаяГруппаСервис, в котором реализована функция
(входные параметры - (Teacher, List<Strudent>)) формирования из Студентов
и Преподавателя УчебнойГруппы и возвращения его */

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<User> studentList;

    public StudyGroup(List<User> studentList, Teacher teacher) {
        this.teacher = teacher;
        this.studentList = studentList;
    }
    
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<User> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(student);
    }

    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudyGroup: " +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }

    
}
