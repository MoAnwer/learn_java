void main() {
/*
	Scanner s = new Scanner(System.in);
	IO.println("Enter the String");
	String str  = s.next();
	char[] a = str.toCharArray();
	IO.println("Enter the character you are looking for");
	IO.println(str);
	String c = s.next();
	char d = c.charAt(0);

	for (int i = 0; i <=  str.length(); i++) {
		if (a[i] == d) {
			if (d >= 'a' && d <= 'z') {
				d-= 32;
			} else if (d >= 'A' && d <= 'Z') {
				d += 32;
			}
			a[i] = d;
			break;
		}
	}

	char[] chars = {'A', 'd', 'a', 'm'};
	str = String.valueOf(chars);
	IO.println(str);


	String str = "this is an example";
	StringTokenizer z = new StringTokenizer(str, "a");

	while(z.hasMoreTokens()) {
		IO.println(z.nextToken());
	}

	String[] el = {"moahmed", "anwer"};
	String single = String.join(",", el);
	IO.println(single);

	StringJoiner joiner = new StringJoiner(", ", "[", "]");
	joiner.add("mohamed");
	joiner.add("anwer");
	IO.println(joiner);


	String st = "10";
	int num = Integer.parseInt(st);
	IO.println(num);

*/


	TestClass test = new TestClass();
	IO.println(test.test);

}
