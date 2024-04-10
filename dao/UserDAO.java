import java.util.List;

public interface UserDAO {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
    User getUserById(int userId);
    User getUserByUsername(String username);
    List<User> getAllUsers();
}
