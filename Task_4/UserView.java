package HomeTask_OOP.Task_4;

import java.util.List;

public interface UserView<T extends User> {

    public void sendOnConsole(List<T> students);
}
