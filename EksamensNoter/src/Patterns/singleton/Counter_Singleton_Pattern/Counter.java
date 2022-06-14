package Patterns.singleton.Counter_Singleton_Pattern;

public class Counter {

    //Attributer
    private static Counter instance;
    private int value;


    //Contruktor
    private Counter(){
        this.value = 0;
    }


    //Metode get instance / create instance.
    public static Counter getInstance(){
        if (instance == null){
            instance = new Counter();
        }
        return instance;
    }

    //Metode count()
    public void count(){
        this.value++;
    }

    //Metode time2()
    public void time2(){
        this.value = this.value * 2;
    }

    //Metode zero()
    public void zero(){
        this.value = 0;
    }

    //Metode getValues()
    public int getValues(){
        return this.value;
    }

}
