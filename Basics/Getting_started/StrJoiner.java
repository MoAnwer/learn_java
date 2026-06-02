void main() {

	String[] elements = {"foo", "bar", "foobar"};
	String singleString = String.join(" + ", elements);
//	IO.println(singleString);


	StringJoiner sj = new StringJoiner(", ", "[", "]");

	sj.add("php");
	sj.add("java");
	sj.add("js");

	IO.println(sj);


	Stream<String> stringStream = Stream.of("a", "m", "r");
	String joined = stringStream.collect(Collectors.joining(""));
	IO.println(joined);

}
