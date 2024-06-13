package HomeTask_OOP.Task_6.RefacturedCode.View;

import HomeTask_OOP.Task_6.RefacturedCode.Data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
