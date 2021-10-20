package opgave_3_popupvindue_til_addPerson_Opgave_1_Og_2;

public class Person {
	private String firstName;
	private String title;
	private boolean senior;


	public Person(String firstName, String title,boolean senior) {
		this.firstName = firstName;
		this.title = title;
		this.senior = senior;
	}

	@Override
	public String toString() {
		String s = title + " " + firstName;
		if (senior){
			s = s + " (Senior)";
		}
		return s;
	}
}
