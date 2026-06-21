package real_world.interfaces;

interface AuthService {
    boolean authenticate(String credentials);
}

class GoogleAuthService implements AuthService {
    @Override
    public boolean authenticate(String token) {
        // Google API logic
        IO.println(" Google API auth logic");
        return true;
    }
}

class BasicAuth implements AuthService {
    @Override
    public boolean authenticate(String pass) {
        // Basic auth logic
        IO.println("Basic auth logic");
        return true;
    }
}

public class MainAuth {
    public static void main(String[] args) {
        AuthService service = new BasicAuth();
        service.authenticate("Token");
    }
    
}
