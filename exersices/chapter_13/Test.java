package exersices.chapter_13;

public class Test {
    public static void main(String[] args) {
        Person[] persons = { new Person(3), new Person(4), new Person(1) };
        java.util.Arrays.sort(persons);
        IO.println(java.util.Arrays.toString(persons));
    }
}

class Person implements Comparable<Person> {
    private int id;

    Person(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Person person) {
        if (this.id > person.id) {
            return 1;
        } else if (this.id < person.id) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return """
        { id: %d }""".formatted(this.id);
    }
}