public class TestClass {

	String testData;

	public TestClass(String testData) {
		this.testData = testData;
	}

	public TestClass() {
		this("TestCase");
	}

	@Override
	public String toString() {
		return "data = " + testData;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		TestClass t = (TestClass) obj;
		return (testData == null ? t.testData == null : testData.equals(t.testData));
	}


	@Override
	public int hashCode() {
		int hash = 1;
		hash = 31 * hash + (this.testData == null ? 0 : testData.hashCode());
		return hash;
	}

	public static void main() {

		TestClass test = new TestClass();
		IO.println(test);

		TestClass t2 = new TestClass();
		IO.println(t2);

		IO.println(test.equals(t2));

	}
}
