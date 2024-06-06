package HomeTask_OOP.Task_4;

public interface UserController <T extends User> {
    void create(String name, String lastName, String middleName);
}
