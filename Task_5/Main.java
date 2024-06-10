package HomeTask_OOP.Task_5;

import java.util.List;

import HomeTask_OOP.Task_5.Controller.Controller;
import HomeTask_OOP.Task_5.Model.Student;
import HomeTask_OOP.Task_5.Model.Teacher;

/* Задача 1 - Data/model
Создать package – model. Работу продолжаем в нем
Реализовать абстрактный класс User и его наследники Student и Teacher.
Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а
наследники собственные параметры (какие, по вашему выбору – Пример:
studentId для Student, teacherId для Teacher)

Задача 2 - Service
Создать package – service. Работу продолжаем в нем
Создать класс DataService с методами в по управлению сущностями User
(create, read) и агрегирующий всех пользователей заведенных в системе
StudentId должны быть созданы по алгоритму – максимальный id в
коллекции + 1. Аналогичноо и для TeacherId. Здесь решение через перебор
элементов и instanceOf

Задача 3 - View/Dto
Создать package – view. Работу продолжаем в нем
Создать класс StudentView, содержащий в себе метод вывода в консоль
данных студента поданных на вход


Задача 4 - Controller
Создать package – controller. Работу продолжаем в нем
Создать класс Controller агрегирующий в себе необходимые классы в виде
полей, а инициализируем прям в поле.
Создаем метод созданиеСтудента – реализующий логику, путем вызова
соответствующих методов интерфейсов:
Создания Студента в сервисе
Возвращение всех студентов в сервисе
Вызов view и передача списка найденных студентов

Домашнее задание
Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и
список Студентов
Создать класс УчебнаяГруппаСервис, в котором реализована функция
(входные параметры - (Teacher, List<Strudent>)) формирования из Студентов
и Преподавателя УчебнойГруппы и возвращения его
Создать метод в Контроллере, в котором формируется учебная группа, путем
вызова метода из сервиса
Все вышеуказанное создать согласно принципам ООП пройдённым на
семинаре
 */
public class Main {
    private static List<Student> studentList;
    private static Teacher teacher;
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Andrew", "Larkin", "Larkin's");
        controller.createStudent("Paul", "Baeg", "Baeg's");
        controller.createStudent("Lara", "Clone", "Clone's");
        controller.createStudent("Eugen", "Cloned", "Cloned's");
        controller.createStudent("Marin", "Lasur", "Lasur's");
        controller.createStudent("Gabil", "Gabil", "Gabil's");
        controller.getAllStudent();

        controller.createTeacher("Alia", "Fazilova", "Abdurakhmanovna");
//        controller.getAllTeacher();

        controller.createStudyGroup(studentList, teacher);;
        controller.getAllStudyGroup();
    }
}

