package records;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            UserResponse.from
                (
                    new User()
                        .setId(73245434)
                        .setAge(20)
                        .setCreateAt(new Date("04/15/2023"))
                        .setEmail("mo@mail.com")
                        .setName("mohamed")
                )
        );
    }
}
