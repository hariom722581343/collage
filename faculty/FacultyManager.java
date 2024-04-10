import java.util.ArrayList;
import java.util.List;

public class FacultyManager {
    private List<Course> courses;

    public FacultyManager() {
        this.courses = new ArrayList<>();
    }

    public List<Course> getCoursesByInstructor(Instructor instructor) {
        List<Course> instructorCourses = new ArrayList<>();
        for (Course course : courses) {
            if (course.getInstructorId() == instructor.getId()) {
                instructorCourses.add(course);
            }
        }
        return instructorCourses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void updateCourse(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId() == course.getId()) {
                courses.set(i, course);
                break;
            }
        }
    }

    public void deleteCourse(int courseId) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId() == courseId) {
                courses.remove(i);
                break;
            }
        }
    }
}
