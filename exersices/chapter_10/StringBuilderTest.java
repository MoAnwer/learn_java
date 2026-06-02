void main () {
    StringBuilder s1 = new StringBuilder("Java");
    StringBuilder s2 = new StringBuilder("HTML");
    s1.append(" is fun");
    s1.append(s2);
    s1.insert(2, "is fun");
    s1.insert(1, s2);
    s1.charAt(2);
    s1.length();
    s1.deleteCharAt(3);
    s1.delete(1, 3);
    s1.reverse();
    s1.replace(1, 3, "Computer");
    s1.substring(1, 3);
    s1.substring(2); 
}