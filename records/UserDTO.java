package records;

import java.util.List;

public record UserDTO(String name, int age, List<String> skills) {
    public UserDTO {
        if(age < 0) throw new IllegalArgumentException("Age cannot be negative");
        name = name.trim().toLowerCase();
    }

    public boolean isAdult() {
        return age >= 18;
    }
}
