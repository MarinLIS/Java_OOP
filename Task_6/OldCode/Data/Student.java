package HomeTask_OOP.Task_6.OldCode.Data;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(String firstName, String lastName, String middleName, LocalDate dateOfBirth) {
        super(firstName, lastName, middleName, dateOfBirth);
    }

    public Student(String firstName, String lastName, String middleName, LocalDate dateOfBirth, Long studentId) {
        super(firstName, lastName, middleName, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + studentId +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", LastName='" + super.getLastName() + '\'' +
               ", middleName='" + super.getMiddleName() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
