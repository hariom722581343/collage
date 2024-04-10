import java.util.ArrayList;
import java.util.List;

public class StudentRecordsManager {
    private List<Course> courses;

    public StudentRecordsManager() {
        this.courses = new ArrayList<>();
    }

    public List<Course> getEnrolledCourses(Student student) {
        List<Course> enrolledCourses = new ArrayList<>();
        for (Course course : courses) {
            if (course.getStudentIds().contains(student.getId())) {
                enrolledCourses.add(course);
            }
        }
        return enrolledCourses;
    }

    public void generateTranscript(Student student) {
        System.out.println("Generating transcript for student " + student.getName());
    }

    public void generateAcademicReport(Student student) {
        System.out.println("Generating academic report for student " + student.getName());
    }
}
