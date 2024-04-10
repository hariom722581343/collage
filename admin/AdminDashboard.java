import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminDashboard {
    private Map<Department, List<Course>> departmentCoursesMap;
    private Map<Course, List<Student>> courseStudentsMap;
    private Map<Department, List<Instructor>> departmentInstructorsMap;
    private Map<Student, List<Course>> studentCoursesMap;
    private Map<Course, Double> courseSatisfactionMap;

    public AdminDashboard() {
        departmentCoursesMap = new HashMap<>();
        courseStudentsMap = new HashMap<>();
        departmentInstructorsMap = new HashMap<>();
        studentCoursesMap = new HashMap<>();
        courseSatisfactionMap = new HashMap<>();
    }

    public List<Department> getDepartmentsWithHighestEnrollment() {
        int maxEnrollment = 0;
        List<Department> departmentsWithMaxEnrollment = new ArrayList<>();
        for (Department department : departmentCoursesMap.keySet()) {
            int enrollment = departmentCoursesMap.get(department).size();
            if (enrollment > maxEnrollment) {
                maxEnrollment = enrollment;
                departmentsWithMaxEnrollment.clear();
                departmentsWithMaxEnrollment.add(department);
            } else if (enrollment == maxEnrollment) {
                departmentsWithMaxEnrollment.add(department);
            }
        }
        return departmentsWithMaxEnrollment;
    }

    public List<Department> getDepartmentsWithLowestEnrollment() {
        int minEnrollment = Integer.MAX_VALUE;
        List<Department> departmentsWithMinEnrollment = new ArrayList<>();
        for (Department department : departmentCoursesMap.keySet()) {
            int enrollment = departmentCoursesMap.get(department).size();
            if (enrollment < minEnrollment) {
                minEnrollment = enrollment;
                departmentsWithMinEnrollment.clear();
                departmentsWithMinEnrollment.add(department);
            } else if (enrollment == minEnrollment) {
                departmentsWithMinEnrollment.add(department);
            }
        }
        return departmentsWithMinEnrollment;
    }

    public double getAverageGPAByDepartment(Department department) {
        List<Student> students = getStudentsByDepartment(department);
        if (students.isEmpty()) {
            return 0.0;
        }
        double totalGPA = 0.0;
        for (Student student : students) {
            totalGPA += calculateGPA(student);
        }
        return totalGPA / students.size();
    }

    public List<Course> getCoursesWithHighestSatisfaction() {
        double maxSatisfaction = 0.0;
        List<Course> coursesWithMaxSatisfaction = new ArrayList<>();
        for (Course course : courseSatisfactionMap.keySet()) {
            double satisfaction = courseSatisfactionMap.get(course);
            if (satisfaction > maxSatisfaction) {
                maxSatisfaction = satisfaction;
                coursesWithMaxSatisfaction.clear();
                coursesWithMaxSatisfaction.add(course);
            } else if (satisfaction == maxSatisfaction) {
                coursesWithMaxSatisfaction.add(course);
            }
        }
        return coursesWithMaxSatisfaction;
    }

    public List<Student> getStudentsEligibleForHonors() {
        List<Student> eligibleStudents = new ArrayList<>();
        for (Student student : studentCoursesMap.keySet()) {
            if (calculateGPA(student) >= 3.5) {
                eligibleStudents.add(student);
            }
        }
        return eligibleStudents;
    }

    public void recordLog(String log) {
        System.out.println("Recording log: " + log);
    }

    public void performBulkDataImport() {
        System.out.println("Performing bulk data import");
    }

    public void performBulkDataExport() {
        System.out.println("Performing bulk data export");
    }

    public void performBulkDataBackup() {
        System.out.println("Performing bulk data backup");
    }

    private double calculateGPA(Student student) {
        return 3.0;
    }

    private List<Student> getStudentsByDepartment(Department department) {
        List<Student> students = new ArrayList<>();
        for (Student student : studentCoursesMap.keySet()) {
            if (student.getDepartmentId() == department.getId()) {
                students.add(student);
            }
        }
        return students;
    }
}
