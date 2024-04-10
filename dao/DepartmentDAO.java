import java.util.List;

public interface DepartmentDAO {
    void addDepartment(Department department);
    void updateDepartment(Department department);
    void deleteDepartment(int departmentId);
    Department getDepartmentById(int departmentId);
    List<Department> getAllDepartments();
}
