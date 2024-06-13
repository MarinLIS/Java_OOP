package HomeTask_OOP.Task_6.OldCode.Controller;

    import HomeTask_OOP.Task_6.OldCode.Data.User;
    
    import java.time.LocalDate;

    public interface UserController<T extends User> {
    
        void create(String firstName, String lastName, String middleName, LocalDate dateOfBirth);
    }

