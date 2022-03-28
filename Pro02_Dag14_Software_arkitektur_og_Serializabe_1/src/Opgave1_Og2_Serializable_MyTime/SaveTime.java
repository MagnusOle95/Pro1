package Opgave1_Og2_Serializable_MyTime;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveTime {

    public static void main(String[] args) {
        MyTime mT = new MyTime();
        mT.increase();
        mT.increase();

        System.out.println(mT.getTime());


        try {
            FileOutputStream f_out = new FileOutputStream("myTime.ser");
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out);
            obj_out.writeObject(mT);
            System.out.println("Tid er gemt: " + mT);
            obj_out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
