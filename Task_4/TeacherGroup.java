package HomeTask_OOP.Task_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup<E extends User> implements Iterable<Teacher>{ // этот обьект что-то может, например сам себя перебрать
    private List<E> teacherList;

    public List<E> getTeacherList() {
        return teacherList;
    }

    public TeacherGroup() {
        teacherList = new ArrayList<>();
    }

    public void addTeacher(E teacher) {
        teacherList.add(teacher);

    }

    // public Iterator<Teacher> iterator() {
    //     return new TeacherIterator(teacherList);
    // }

    public void sortByNameTeacher() {
        teacherList.sort(new UserComparator<>());
    }

    @Override
    public Iterator<Teacher> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    

    
}
