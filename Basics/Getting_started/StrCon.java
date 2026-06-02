void main() {

	String a1 = "a", a2 = "b", a3 = "c";
	String s = a1 + a2 + a3;

	IO.println("Native concatenation = "  + s);

	StringBuilder b = new StringBuilder("a");
	b.append("b").append("c").toString();
	IO.println("Builder = " + b);


	StringBuilder buf = new StringBuilder(30);
	buf.append("0123456789");
	buf.append("0123456789"); // reallocation of the internal buffer
	String result = buf.toString(); // Produces a 20-char copy of the string
	IO.println(result);

	IO.println("mohamed ".concat("anwer"));

	StringBuilder bu = new StringBuilder(100);
	for (int i  = 0; i < 100; i++) {
		bu.setLength(0); // Empty buffer
		bu.append("This is line ").append(i).append('\n');
	//	IO.println(bu.toString());
	}


	
}
