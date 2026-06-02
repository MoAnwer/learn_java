void main() {
	String s = "This is an example";
	String a = s.substring(11);
	String b = s.substring(5, 10);
	String c = s.substring(5, s.length()-3);
	IO.println(c);
	
	IO.println(System.getProperty("line.separator"));
}
