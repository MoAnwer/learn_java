package exersices.chapter_11.exersices;

import java.math.BigDecimal;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    @Override
    public String toString() {
        return "Person class";
    }
}

class Employee extends Person {
    private String office;
    private BigDecimal salary;
    private java.util.Date dateHire;

    @Override
    public String toString() {
        return "Emoloyee class";
    }
}

class Student extends Person {
    public final String FRESH_MAN = "freshman";
    public final String SOPHOMORE = "sophomore";
    public final String JUNIOR = "junior";
    public final String SENIOR = "senior";
    private String classStatus;

    @Override
    public String toString() {
        return "Student class";
    }
}

class Faculty extends Employee {
    private Double officeHourse;
    private int rank;

    @Override
    public String toString() {
        return "Faculty class";
    }
}

class Staff extends Employee {
    private String title;

    @Override
    public String toString() {
        return "Staff class";
    }
}