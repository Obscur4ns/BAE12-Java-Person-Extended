package extended.pets;

public class Cat {

	public String name;

	public int age;

	public String colour;

	// INSERT INTO `cat` (`name`, `age`, `colour`) VALUES (...);
	public Cat(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	// INSERT INTO `cat` () VALUES ();
	public Cat() {
		// Default constructor
	}

	public void print() {
		System.out.println("Name: ");
		System.out.println(this.name);
		System.out.println("Age: ");
		System.out.println(this.age);
		System.out.println("Colour: ");
		System.out.println(this.colour);
	}

	public void speak() {
		System.out.println("Meow");
	}
}
