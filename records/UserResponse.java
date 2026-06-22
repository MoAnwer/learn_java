package records;

import java.util.Date;

public record UserResponse(
    int id,
    String name,
    String email,
    int age,
    Date createdAt
) {

    // Static factory method - very common pattern
    public static UserResponse from(User user) 
    {
        return new UserResponse(
            user.getId(),
            user.getName(),
            user.getEmail(),
            user.getAge(),
            user.getCreateAt()
        );
    }
}
