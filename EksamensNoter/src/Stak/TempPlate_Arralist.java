package Stak;

import java.util.ArrayList;
import java.util.NoSuchElementException;

//Her implementere vi, stackI interfacet.
public class TempPlate_Arralist implements StackI {

    //Her opretter vi form for liste vi ønsker.
    private ArrayList<Object> list;

    //Her har vi contruktoren der intialisere vores arrayliste.
    public TempPlate_Arralist(){
        list = new ArrayList<Object>();
    }

    //i push, bruger vi den implementerede add metode i arraylist, for at indsætte, det element vi ønsker i arraylisten.
    //i arraylist add metoden, insættes det nye elemtent bagerst i listen.
    @Override
    public void push(Object element) {
        list.add(element);
    }

    //I pop metoden, bruger vi den implementerede remove metode i arraylist, for at slette et specifikt element på et specifikt index.
    // da vi ved at vi det sidste objekt vi satte ind, ligger på den sidste plads i arrayet, derfor bruger vi list.size -1 som index.
    @Override
    public Object pop() {
        if (list.size() <= 0) {
            throw new NoSuchElementException();
        }
        return list.remove(list.size() - 1);
    }

    //i peak, bruger vi den implementerede get metode i en arraylist, for at få det element der ligger bagerst i arraylisten
    // som er det element vi sidst satte ind.
    @Override
    public Object peek() {
        if (list.size() <= 0){
            throw new NoSuchElementException();
        }
        return list.get(list.size() - 1);
    }

    //i Is empty, der bruger vi den implementerede isempty funktion i en arraylist, da vi vil retunere en boolean
    // der fortæller om listen er tom eller ej.
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    //i size, bruger vi den implementerede size funktion i arraylist, for at vi kan retunere hvor stor arraylisten/Stakken er.
    @Override
    public int size() {
        return list.size();
    }


}



