import java.util.List;

public interface InstructorDAO {
    void addInstructor(Instructor instructor);
    void updateInstructor(Instructor instructor);
    void deleteInstructor(int instructorId);
    Instructor getInstructorById(int instructorId);
    List<Instructor> getAllInstructors();
}
