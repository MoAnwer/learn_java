void main() {

	String[] array1 = new String[3];
	Arrays.fill(array1, 1, 2, "mohamed");
	for (String s: array1) {
		IO.println(s);
	}
}
