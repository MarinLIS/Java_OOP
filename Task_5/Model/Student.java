package HomeTask_OOP.Task_5.Model;

public class Student extends User {
    private int studentId;

    public Student(String firstName, String secondName, String middleName, int studentId) {
        super(firstName, secondName, middleName);
        this.studentId = studentId;
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentId{" +
        "studentId=" + studentId +
        ", firstName='" + super.getFirstName() + '\'' +
        ", lastName='" + super.getLastName() + '\'' +
        ", middleName='" + super.getMiddleName() + '\'' +
        '}';
    }

    
    
}
