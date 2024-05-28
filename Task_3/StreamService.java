package HomeTask_OOP.Task_3;
/*Создать класс ПотокСервис, добавив в него метод сортировки списка 
потоков, используя созданный StreamComparator. */

import java.util.Comparator;
import java.util.List;

public class StreamService {
    public void sortStreams(List<Stream> streams, Comparator<Stream> comparator) {
        streams.sort(comparator);
    }
    
}
