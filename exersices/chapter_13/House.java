package exersices.chapter_13;

import java.util.ArrayList;

public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(House arg0) {
        if (area > arg0.getArea()) {
            return 1;
        } else if (area < arg0.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        House house1 = new House(1, 175.50);
        House house2 = (House) house1.clone();

        java.util.Date date = new java.util.Date();
        java.util.Date date1 = date;
        java.util.Date date2 = (java.util.Date) (date.clone());
        // System.out.println(date == date1); // true
        // System.out.println(date == date2); // false
        // System.out.println(date.equals(date2)); // true

        
        ArrayList<String> list = new ArrayList<>();
        list.add("New York");
        ArrayList<String> list1 = list;
        ArrayList<String> list2 = (ArrayList<String>) (list.clone());
        list.add("Atlanta");
        System.out.println(list == list1); // true
        System.out.println(list == list2); // false
        System.out.println("list is " + list); 
        System.out.println("list1 is " + list1);
        System.out.println("list2.get(0) is " + list2.get(0)); // New York
        System.out.println("list2.size() is " + list2.size()); // 2
    }
}
