package HomeTask_OOP.Task_3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private final List<StudentGroup> studentGroupList;
    private int counter;

    @Override
    public boolean hasNext() {
        return counter < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        else {
            return studentGroupList.get(counter++);
        }
    }

    public StreamIterator(Stream stream) {
        this.studentGroupList = stream.getStudentGroups();
        counter = 0;
    }
}
