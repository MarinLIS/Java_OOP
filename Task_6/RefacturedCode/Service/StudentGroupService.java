package HomeTask_OOP.Task_6.RefacturedCode.Service;

import HomeTask_OOP.Task_6.RefacturedCode.Data.Student;
import HomeTask_OOP.Task_6.RefacturedCode.Data.StudentGroup;
import HomeTask_OOP.Task_6.RefacturedCode.Data.Teacher;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;
    private final StudentSearchService searchService;
    private final StudentSortService sortService;

    public StudentGroupService(StudentSearchService searchService, Teacher teacher, List<Student> students, StudentSortService sortService) {
        this.sortService = sortService;
        this.studentGroup = new StudentGroup(teacher, students);
        this.searchService = searchService;
    }

    public StudentGroupService(StudentSortService sortService) {
        this.sortService = sortService;
        this.searchService = new StudentSearchService() {
            @Override
            public Student findStudent(String firstName, String lastName) {
                return null;
            }
        };

    }

    public StudentSearchService getSearchService() {
        return searchService;
    }

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
    public Student getStudentFromStudentGroup(String firstName, String lastName){
        return searchService.findStudent(firstName, lastName);
    }

    public List<Student> getSortedStudentGroup() {
        return sortService.sortStudents();
    }

    public List<Student> getSortedByFIOStudentGroup() {
        return sortService.sortStudents();
    }
}