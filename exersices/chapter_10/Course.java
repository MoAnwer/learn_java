package exersices.chapter_10;

import java.util.Arrays;
import java.util.StringJoiner;

public class Course {
    private String courseName;
    private String[] students = new String[3];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (!isFull()) {
            students[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            resizeAndAdd(student);
        }
    }

    private void resizeAndAdd(String student) {
        String[] newStudentArray = Arrays.copyOf(students, (students.length * 2));
        this.students = newStudentArray;
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    // Exercise hear
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i] != null && students[i].equals(student)) {
                students[i] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    public String showStudents()
    {
        StringJoiner j = new StringJoiner(", ", "[", "]");

        for (String student : students) 
        {
            if (student != null) 
            {
                j.add(student);
            }
        }

        return j.toString();
    }

    public boolean isFull() {
        return numberOfStudents >= students.length ? true : false;
    }

    public static void main(String[] args) {

        Course course = new Course("Java");

        course.addStudent("Mohamed");
        course.addStudent("Ali");
        course.addStudent("Adam");
        course.addStudent("Osama");
        course.addStudent("Osama");
        course.addStudent("Osama");
        course.addStudent("Osama");
        course.addStudent("Osama");
        course.addStudent("Osama");
        course.addStudent("Osama");
        course.addStudent("omar");

        IO.println(course.showStudents() + " " + course.numberOfStudents);
        
        course.dropStudent("Mohamed");
        course.dropStudent("omar");

        IO.println(course.showStudents() + " " + course.numberOfStudents);

    }
}