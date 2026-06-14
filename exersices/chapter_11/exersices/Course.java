package exersices.chapter_11.exersices;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (null != student && student.length() != 0) {
            students.add(student);
            numberOfStudents++;
        }
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        if (students.contains(student)) {
            students.remove(student);
            numberOfStudents--;
        }
    }

    public String showStudents()
    {
        return students.toString();
    }


    public static void main() {

        Course course = new Course("Java");

        course.addStudent("");
        course.addStudent("Ali");
        course.addStudent("Adam");
        course.addStudent("Osama");
        course.addStudent("pro"); 
        course.addStudent("omar");

        IO.println(course.showStudents() + " " + course.numberOfStudents);
        
        course.dropStudent("Mohamed");
        course.dropStudent("9");

        IO.println(course.showStudents() + " " + course.numberOfStudents);

    }
}
