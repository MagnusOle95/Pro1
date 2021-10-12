package modelchild;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChildApp {

	public static void main(String[] args) {
		Child c1 = new Child(10, true);// boy 4 years old
		Child c2 = new Child(2, false);// girl 2 years old
		Child c3 = new Child(4, true); // Nyt barn dreng//
		Child c4 = new Child(8, false); //Nyt barn pige//
		Child c5 = new Child(4, true);//Nyt barn dreng//

		System.out.println("Et barn på " + c1.getAge());
		System.out.println("Et barn på " + 2 + " vejer " + c1.getWeight(2));
		System.out.println("Største forøgelse " + c1.getIncrease());

		Indstitution iS1 = new Indstitution("dybøl","dybølsgade");
		iS1.addChild(c1);
		iS1.addChild(c2);
		iS1.addChild(c3);
		iS1.addChild(c4);
		iS1.addChild(c5);
		System.out.println("Gennemsnits alderen på børnende i Indsitutions er: " + iS1.averageAge());
		System.out.println("Antal piger i institution: " + iS1.numberOfGirls());
		System.out.println("Antal drenge i institution: " + iS1.numberOfBoys());
	}

}
