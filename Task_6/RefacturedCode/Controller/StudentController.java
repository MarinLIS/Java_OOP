package HomeTask_OOP.Task_6.RefacturedCode.Controller;

    import HomeTask_OOP.Task_6.RefacturedCode.Data.Student;
    import HomeTask_OOP.Task_6.RefacturedCode.Data.Teacher;
    import HomeTask_OOP.Task_6.RefacturedCode.Service.StudentGroupService;
    import HomeTask_OOP.Task_6.RefacturedCode.Service.StudentService;
    import HomeTask_OOP.Task_6.RefacturedCode.Service.StudentSortService;
    import HomeTask_OOP.Task_6.RefacturedCode.View.StudentView;
    
    import java.time.LocalDate; 
    import java.util.Collections;
    import java.util.List;
    
    public class StudentController implements UserController<Student> {

        private final StudentService dataService = new StudentService();
        private StudentSortService sortService;
        private final StudentGroupService studentGroupService = new StudentGroupService(sortService);
        private final StudentView studentView = new StudentView();
    
        @Override
        public void create(String firstName, String lastName, String middleName, LocalDate dateOfBirth) {
            dataService.create(firstName, lastName, middleName, dateOfBirth);
            studentView.sendOnConsole(dataService.getAll());
        }
    
        public void createStudentGroup(Teacher teacher, List<Student> students){
            studentGroupService.createStudentGroup(teacher, students);
            studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
        }
    
        public void getStudentInStudentGroup(String firstName, String lastName){
            Student student = studentGroupService.getStudentFromStudentGroup(firstName, lastName);
            studentView.sendOnConsole(Collections.singletonList(student));
        }
    
        public void getSortedListStudentFromStudentGroup(){
            List<Student> students = studentGroupService.getSortedStudentGroup();
            studentView.sendOnConsole(students);
        }
    
        public void getSortedListByFIOStudentFromStudentGroup(){
            List<Student> students = studentGroupService.getSortedByFIOStudentGroup();
            studentView.sendOnConsole(students);
        }
    }

