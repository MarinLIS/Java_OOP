package HomeTask_OOP.Task_3;

import java.util.Iterator;
import java.util.List;

/*Создать класс Поток содержащий в себе список УчебныхГрупп 
и реализующий интерфейс Iterable. */
public class Stream implements Iterable<StudentGroup> {
    List<StudentGroup> studentGroups;

    public Stream(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

   
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public String toString() {
        return "Stream:" +
                " student's group: " + studentGroups;
    }
}
