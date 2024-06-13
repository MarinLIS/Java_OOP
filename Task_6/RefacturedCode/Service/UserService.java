package HomeTask_OOP.Task_6.RefacturedCode.Service;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {
    List<T> getAll();
    void create(String firstName, String lastName, String middleName, LocalDate dateOfBirth);
}
