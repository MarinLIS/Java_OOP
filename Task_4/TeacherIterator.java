package HomeTask_OOP.Task_4;

import java.util.Iterator;
import java.util.List;

public class TeacherIterator<E> implements Iterator<E> {// данный обьект перебирает обьекты
    private int index;
    private List<E> teacherList;

    public TeacherIterator(List<E> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public boolean hasNext() {// определяет что есть следующий элемент
        return teacherList.size() > index;
    }

    @Override
    public E next() {//выдает следующий элемент
        return teacherList.get(index++);
    }
}
