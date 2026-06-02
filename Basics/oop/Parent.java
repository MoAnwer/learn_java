public class Parent 
{
	public String name;
	public int age;

	public Parent() {} // necessary because we call super() without args

	public Parent (String tName, int tAge) {
		this.name = tName;
		this.age = tAge;
	}

}
