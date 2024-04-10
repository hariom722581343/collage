import java.util.List;

public interface CourseDAO {
    void addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(int courseId);
    Course getCourseById(int courseId);
    List<Course> getAllCourses();
}
