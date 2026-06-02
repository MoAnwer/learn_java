void main() {

	Set<String> set = new HashSet<String>();
	set.add("red");
	set.add("blue");


	String[] stringArray = set.toArray(new String[set.size()]);

	for (String s : stringArray) {
		IO.println(s);
	}


	List<String> list = new ArrayList<String>(Arrays.asList(stringArray));

	String[] strings = list.stream().toArray(String[]::new);

       for (String s : strings) {
              IO.println(s);
        }

}
