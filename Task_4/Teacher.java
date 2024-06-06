package HomeTask_OOP.Task_4;

/*Задача 4 (домашнее задание)

Создать класс УчительСервис и реализовать аналогично проделанному на семинаре.
Создать класс УчительВью и реализовать аналогично проделанному на семинаре.
Создать класс УчительКонтроллер и реализовать возможность создания, редактирования 
конкретного учителя и отображения списка учителей, имеющихся в системе. */

public class Teacher extends User implements Comparable<Teacher>{

    private Integer teacherId;
    

    public Teacher(String firstName, String lastName, String middleName, int teacherId ) {
        super(firstName, lastName, middleName);
        this.teacherId = teacherId;
    }
     
    
    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    
    @Override
    public int compareTo(Teacher o) {
       return this.teacherId.compareTo(o.teacherId);
    }
    @Override
    public String toString() {
        return "Teacher: " +
                "Имя: " + super.getFirstName() +
                ", Отчество: " + super.getMiddleName() +
                ", Фамилия: " + super.getLastName() +
                ", Номер Id: " + teacherId;
    }

}
