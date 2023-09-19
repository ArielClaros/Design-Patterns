package Proxy.Java;

public class CustomAuthenticationService implements AuthenticationService {
    @Override
    public void logToApp(String username, String password) {
        System.out.println("Personalized Authentication to: " + username);
    }
}
