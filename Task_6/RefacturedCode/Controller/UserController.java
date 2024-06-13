package HomeTask_OOP.Task_6.RefacturedCode.Controller;

    import HomeTask_OOP.Task_6.RefacturedCode.Data.User;
    
    import java.time.LocalDate;

    public interface UserController<T extends User> {
    
        void create(String firstName, String lastName, String middleName, LocalDate dateOfBirth);
    }

