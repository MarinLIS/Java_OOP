package HomeTask_OOP.Task_3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComparing = o1.getStudentName().compareTo(o2.getStudentName());
        if (resultOfComparing == 0){    
            resultOfComparing = o1.getStudentSurName().compareTo(o2.getStudentSurName());
            if(resultOfComparing == 0){
                return o1.getStudentMidName().compareTo(o2.getStudentMidName());
            }else return resultOfComparing;
        }else{
            return resultOfComparing;
        }
    }
    

}
