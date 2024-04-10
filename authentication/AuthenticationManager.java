public class AuthenticationManager {
    public boolean authenticate(String username, String password) {
        if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
