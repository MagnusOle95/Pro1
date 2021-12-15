package Opgave4_SøgningIFil;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        System.out.println(linFileSearch("C:/Programmering/Filer/Dag34/Opgave4_tal.txt",982 ));

    }

    public static boolean linFileSearch(String fileName, int target){
        boolean findes = false;
        try {
            File filein = new File(fileName);
            Scanner scan = new Scanner(filein);

            while (!findes && scan.hasNext()) {
                int k = scan.nextInt();
                if (k == target){
                    findes = true;
                }
            }
            scan.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return findes;
    }


}
