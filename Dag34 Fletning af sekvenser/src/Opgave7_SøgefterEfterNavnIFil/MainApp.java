package Opgave7_SøgefterEfterNavnIFil;

import com.sun.source.util.TaskListener;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.time.Period;
import java.util.Scanner;


public class MainApp {

    public static void main(String[] args) {
        System.out.println("Fulde navn på personen:" + linFileSearchPerson("C:/Programmering/Filer/Dag34/Opgave7_Navne.txt","Andersen"));

    }

    public static String linFileSearchPerson(String fileName, String target){
        String person = " ";
        try {
         File filein = new File(fileName);
            Scanner scan = new Scanner(filein);

            boolean fundet = false;

            while (!fundet && scan.hasNext()){
                String k = scan.nextLine();
                int i = k.lastIndexOf(" ");

                if (k.substring(i + 1).equals(target)){
                    fundet = true;
                    person = k;
                }
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return person;
    }




}
