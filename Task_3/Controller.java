package HomeTask_OOP.Task_3;
/*Модифицировать класс Контроллер, добавив в него созданный сервис.
Модифицировать класс Контроллер, добавив в него метод сортирующий 
список потоков, путем вызова созданного сервиса. */

import java.util.List;

public class Controller {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private StreamService streamService;

    public void removeStudentByFIA(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIA(firstName, lastName, middleName);
    }

    List<Student> getsortedStudentListFiO() {
        return studentGroupService.getsortedStudentListFiO();
    }
   
    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams, new StreamComparator());
    }
    
    
}
