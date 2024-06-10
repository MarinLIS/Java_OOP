package HomeTask_OOP.Task_5.Model;

public class Teacher extends User {

    private int teacherId;

    public Teacher(String firstName, String secondName, String middleName , int teacherId) {
        super(firstName, secondName, middleName);
        this.teacherId = teacherId;
    }
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "TeacherId{" +
        "teacherId=" + teacherId +
        ", firstName='" + super.getFirstName() + '\'' +
        ", lastName='" + super.getLastName() + '\'' +
        ", middleName='" + super.getMiddleName() + '\'' +
        '}';
    }

    

    
}
