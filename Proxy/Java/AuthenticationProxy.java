package Proxy.Java;

public class AuthenticationProxy implements AuthenticationService {
    private final AuthenticationService googleAuthService = new GoogleAuthenticationService();
    private final AuthenticationService customAuthService = new CustomAuthenticationService();

    @Override
    public void logToApp(String username, String password) {
        if (username.endsWith("@gmail.com")) {
            googleAuthService.logToApp(username, password);
        } else {
            customAuthService.logToApp(username, password);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            AuthenticationService authService = new AuthenticationProxy();

            authService.logToApp("user@gmail.com", "password");

            authService.logToApp("user", "password");
        }
    }
}
