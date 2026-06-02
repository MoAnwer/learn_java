public class Child extends Parent {
	public Child(String name, int age) {
		super(name, age);
	}

	public Child() {
		super();
	}

	@Override
	public String toString() {
		return "Name: " + this.name + ", age: " + this.age;
	}
}


public void main() 
{
	Child child = new Child();
	IO.println(child.name + " " + child.age);
}