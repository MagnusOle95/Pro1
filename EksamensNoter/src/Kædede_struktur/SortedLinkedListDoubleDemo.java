
package Kædede_struktur;

public class SortedLinkedListDoubleDemo {

    public static void main(String[] args) {
        String Jens = "Jens";
        String arne = "Arne";
        String arnø = "Arnø";
        String Frank = "Frank";
        String Jepper = "Jepper";
        String kim = "Frankk";
        String Abe = "Abe";

        SortedLinkedListDouble sortedLinkedListDouble = new SortedLinkedListDouble();

        sortedLinkedListDouble.addElement(Frank);
        sortedLinkedListDouble.addElement(arne);
        sortedLinkedListDouble.addElement(Abe);
        sortedLinkedListDouble.addElement(kim);
        sortedLinkedListDouble.addElement(Jens);
        sortedLinkedListDouble.addElement(arnø);
        sortedLinkedListDouble.addElement(Jepper);


        //Tester om den udskriver begge retninger. altså er forbindelserne sat rigtigt.
        sortedLinkedListDouble.udskrivElementsForFra();
        sortedLinkedListDouble.udskrivElementsBagFra();

        //Tester om slet funktionen virker

        //Sletter Frank midt i listen.
        System.out.println();
        sortedLinkedListDouble.udskrivElementsForFra();
        System.out.println("Frank blev slettet : " + sortedLinkedListDouble.removeElement(Frank));
        sortedLinkedListDouble.udskrivElementsForFra();


        //Sletter abe først i listen og Jepper sidst i listen.
        System.out.println();
        sortedLinkedListDouble.removeElement(Abe);
        sortedLinkedListDouble.udskrivElementsForFra();
        sortedLinkedListDouble.removeElement(Jepper);
        sortedLinkedListDouble.udskrivElementsForFra();

        //Sletter alle ting.
        sortedLinkedListDouble.removeElement(arne);
        sortedLinkedListDouble.removeElement(arnø);
        sortedLinkedListDouble.removeElement(kim);
        sortedLinkedListDouble.removeElement(Jens);
        sortedLinkedListDouble.udskrivElementsForFra();
        System.out.println();

        //ser om den giver en fejl ved sletning. nu da listen er tom.
        System.out.println("Jepper er slettet fra lusten: " + sortedLinkedListDouble.removeElement(Jepper));
        System.out.println();

        //Tilføger emeneter igen. så jeg kan teste min count element.
        sortedLinkedListDouble.addElement(Frank);
        sortedLinkedListDouble.addElement(arne);
        sortedLinkedListDouble.addElement(Abe);
        sortedLinkedListDouble.addElement(kim);
        sortedLinkedListDouble.addElement(Jens);
        sortedLinkedListDouble.addElement(arnø);
        sortedLinkedListDouble.addElement(Jepper);

        sortedLinkedListDouble.udskrivElementsForFra();
        System.out.println("Antal elementer i listen: " + sortedLinkedListDouble.countElements());












    }
}
