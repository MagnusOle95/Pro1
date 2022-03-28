package Opgave1_Og2_Serializable_MyTime;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadTime {

    public static void main(String[] args) {
        try {
            FileInputStream f_in = new FileInputStream("myTime.ser");
            ObjectInputStream obj_in = new ObjectInputStream(f_in);
            Object obj = obj_in.readObject();
            if (obj instanceof MyTime){
                MyTime mT = (MyTime) obj;
                System.out.println(mT);
            }
            obj_in.close();
            f_in.close();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
