package HomeTask_OOP.Task_3;
/*Создать класс StreamComparator, реализующий сравнение количества 
групп входящих в Поток. */

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    public int compare(Stream stream1, Stream stream2){
        return Integer.compare(stream1.studentGroups.size(), stream2.studentGroups.size());
    }
}


