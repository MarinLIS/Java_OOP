package HomeTask_OOP.Task_6.OldCode.View;

import HomeTask_OOP.Task_6.OldCode.Data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
