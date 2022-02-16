package Opgave4.Opg4_Dag5_filmandmeldelse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FilmAndmeldelse {

    public static void main(String[] args) {
        Map<String, Integer> summap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Double> avgMap = new HashMap<>();

        try {
            File filein = new File("C:/Programmering/Filer/Pro2/Dag5_Collection_Framework/FilmAndmeldelser.txt");
            Scanner scan = new Scanner(filein);
            int karakter = 0;
            String film = "";

            int count = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < count; i++){
                film = scan.nextLine();
                karakter = Integer.parseInt(scan.nextLine());
                if (summap.containsKey(film)){
                    int tal = summap.get(film);
                    summap.put(film,karakter + tal);
                    int count2 = countMap.get(film);
                    countMap.put(film,count2 + 1);
                }else{
                    summap.put(film,karakter);
                    countMap.put(film,1);
                }
            }

            for (String f : summap.keySet()){
                double avg = 1.0 * summap.get(f) / countMap.get(f);
                avgMap.put(f,avg);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(summap);
        System.out.println(countMap);
        System.out.println(avgMap);
    }

}
