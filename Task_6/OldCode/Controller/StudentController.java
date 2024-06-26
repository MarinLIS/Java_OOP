﻿package HomeTask_OOP.Task_6.OldCode.Controller;

    import HomeTask_OOP.Task_6.OldCode.Data.Student;
    import HomeTask_OOP.Task_6.OldCode.Data.Teacher;
    import HomeTask_OOP.Task_6.OldCode.Service.StudentGroupService;
    import HomeTask_OOP.Task_6.OldCode.Service.StudentService;
    import HomeTask_OOP.Task_6.OldCode.View.StudentView;
    
    import java.time.LocalDate;
    import java.util.Collections;
    import java.util.List;

    public class StudentController implements UserController<Student> {
      
        private final StudentService dataService = new StudentService();
        private final StudentGroupService studentGroupService = new StudentGroupService();
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

