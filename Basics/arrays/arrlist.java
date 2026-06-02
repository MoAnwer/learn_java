

void main() {

//	String[] strArr = {"foo", "bar", "baz"};

//	List<String> strList = Arrays.asList(strArr);

//	strList.add("mohamed"); // Throw exception

//	for(String a : strList) {
//		IO.println(a);
//	}

/*
	String[] stringArray = {"foo", "bar", "baz"};
	List<String> stringList =  new ArrayList<String>(Arrays.asList(strArr));

	stringList.add("mohamed"); // This no throw any exception

       for(String a : stringList) {
                IO.println(a);
        }




	String[]  stringArray =  {"foo", "ba", "baz"};

	List<String> stringList = new ArrayList<>();
	stringList.addAll(Arrays.asList(stringArray));


        for(String a : stringArray) {
                IO.println(a);
        }


	Integer[] arr = {1, 2, 3}; // primitive array of int
	System.out.println(Arrays.asList(arr).contains(1));



	String[] arrayOfStrings = new String[10];

	List<String> list = new ArrayList<String>(Arrays.asList(arrayOfStrings));

	list.add("mohamed");

	for(String a : list) {
                IO.println(a);
        }



	List<Integer> integerList = Arrays.asList(1, 2, 3);
	List<? extends Number> numberList = integerList;

	Stream<Integer> intStream = Stream.of(1, 2, 3, 4);
	Stream<Double> doubleStream = Stream.of(new Double[] {1.2, 2.3, 0.23});

	Set<String> set = new HashSet<String>();
	set.add("red");
	set.add("blue");

	// although set is a Set<String>, toArray() returns an Object[] not a String[]
	String[] objectArray = set.toArray(new String[0]);

	IO.println(objectArray[1]);




//	String[] names = {"John", "Steve", "Shane", "Adam", "Ben"};
//	Arrays.sort(names, 0, names.length, Collection.reverseOrder());
//	IO.println("String array after sorting in ascending order : " + Arrays.toString(names));


	Course[] courses = new Course[4];
	courses[0] = new Course(101, "Java", 200);
	courses[1] = new Course(201, "Ruby", 300);
	courses[2] = new Course(301, "Python", 400);
	courses[3] = new Course(401, "Scala", 500);
	IO.println("Object array before sorting : " + Arrays.toString(courses));
	Arrays.sort(courses);
	IO.println("Object array after sorting in natural order : " + Arrays.toString(courses));


*/


}
