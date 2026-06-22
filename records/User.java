package records;

import java.util.Date;


public class User 
{
    private int id;
    private String name;
    private String email;
    private int age;
    private Date createAt;

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public User setCreateAt(Date createAt) {
        this.createAt = createAt;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }


    public User setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
