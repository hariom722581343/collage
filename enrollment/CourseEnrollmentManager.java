public class CourseEnrollmentManager {
    public void enrollStudent(Student student, Course course) {
        course.addStudent(student);
        student.addCourse(course);
        System.out.println("Enrolled student " + student.getName() + " in course " + course.getName());
    }

    public void withdrawStudent(Student student, Course course) {
        course.removeStudent(student);
        student.removeCourse(course);
        System.out.println("Withdrawn student " + student.getName() + " from course " + course.getName());
    }
}
