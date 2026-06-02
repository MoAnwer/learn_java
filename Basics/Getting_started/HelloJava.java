public class HelloJava {
	public static void main(String[] args) {
//		double d = 10.5;
//		float f = (float) d;
//		System.out.println("Hello java " + f);

		float f1 = 0f;
		float f2 = -0f;

//		System.out.println(f1 == f2); // true
//		System.out.println(1f / f2); // -Infinity
//		System.out.println(1f / f1); // Infinity
//		System.out.println(Float.POSITIVE_INFINITY / Float.POSITIVE_INFINITY); // NaN
//		System.out.println(3.1415926f);


		int example = -2311;
	//	System.out.println(example);

	//	int demo = 2147483647; //maximum positive integer
	//	System.out.println(demo); //prints 2147483647
	//	demo = demo + 1; //leads to an integer overflow
	//	System.out.println(demo); // prints -2147483648

		double d = 128.99;
//		int b = d; // invalid conversion to int, will throw a compile-time error
		int b = (int) d;
		System.out.println(b);
	}
}
