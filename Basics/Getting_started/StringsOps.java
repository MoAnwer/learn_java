void main() {
	String firstStr = new String("Test123");
	String secondStr = "Test" + 123;

	if (firstStr.equals(secondStr)) {
		// Both Strings have the same content
		IO.println("Equals");
		IO.println("Test" + 123);
	}

	String stringToSwitch = "AB";

	switch(stringToSwitch) {
		case "a":
			IO.println("a");
			break;
		case "Ab":
			IO.println("A"); // the code goes here
			break;
		case "B":
			IO.println("B");
			break;
		default:
			break;
	}

	String yoda = null;

//	IO.println("AB".equals(yoda));

	IO.println("yoda = " + Objects.equals(yoda, "d"));

	String strObj = new String("Hello!");
	String str = "Hello!";

	// The two string references point two strings that are equal
	if (strObj.equals(str)) {
		System.out.println("The strings are equal");
	}

	// The two string references do not point to the same object
	if (strObj != str) {
		System.out.println("The strings are not the same object");
	}

	IO.println("mohamed1".toUpperCase());

	// If we intern a string that is equal to a given literal, the result is
	// a string that has the same reference as the literal.
	String internedStr = strObj.intern();

	if (internedStr == str) {
		System.out.println("The interned string and the literal are the same object");
	}

	String facebook = "https:" + "/"  + "/" + "facebook.com";

	//IO.println(facebook.toUpperCase());

	String lineFromCsvFile = "Mickey;Bolton;123456";
	String dataCells[] = lineFromCsvFile.split(";");

//	for (String cell : dataCells) {
//		IO.println(cell);
//	}

	String lineFromInput = "What    do you need   from me?";
	String words[] = lineFromInput.split("\\s+");

	for (String word : words) {
		IO.println(word);
	}

}
