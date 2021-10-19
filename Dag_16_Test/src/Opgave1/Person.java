package Opgave1;

public class Person {
	private String firstName;
	private String title;


	public Person(String firstName, String title) {
		this.firstName = firstName;
		this.title = title;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return title + " " + firstName;
	}

	//Hej alle sammen//
}
