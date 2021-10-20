package Opgave1;

public class Person {
	private String firstName;
	private String title;
	private String senior;


	public Person(String firstName, String title,String senior) {
		this.firstName = firstName;
		this.title = title;
		this.senior = senior;
	}

	@Override
	public String toString() {
		return title + " " + firstName + " " + senior;
	}
}
