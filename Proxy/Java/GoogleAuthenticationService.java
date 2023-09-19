package Proxy.Java;

public class GoogleAuthenticationService implements AuthenticationService {
    @Override
    public void logToApp(String username, String password) {
        System.out.println("Authentication with Google to: " + username);
    }
}
