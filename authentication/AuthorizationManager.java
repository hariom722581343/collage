public class AuthorizationManager {
    public boolean authorize(String role, String permission) {
        if (role != null && role.equals("admin") && permission != null && permission.equals("manage_courses")) {
            return true;
        } else {
            return false;
        }
    }
}
