package Opgave2_LæsFraFil_ogDublereTallet;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LæsFraFil_OgDublereTallet_App {

    public static void main(String[] args) {

        try {
            File filein = new File("C:/Programmering/Filer/Opgave2Tal.txt");
            Scanner scan = new Scanner(filein);
            while (scan.hasNext()){
                int tal = Integer.parseInt(scan.nextLine());
                System.out.println(tal * 2);
            }
            scan.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


}
