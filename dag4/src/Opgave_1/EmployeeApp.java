package Opgave_1;

/*
 * Anvendelses program der opretter Employee objekter og anvender metoder på disse
 */
public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee("Hans","jensen", 35);  /* Tilføget inputage,
		så når man inføger nye ansatte, så skal man også tilføge alderen, og ikke kun navnet */
		e1.printEmployee();

		e1.setName("viggo","hansen");
		e1.setAge(32);   //Tilføger alder 32 til viggo//
		e1.printEmployee();

		e1.setName("karl","larsen");
		e1.setAge(77);
		e1.printEmployee();

		e1.setName("Magnus","Larsen");
		e1.setAge(25);
		e1.printEmployee();

	}

}


