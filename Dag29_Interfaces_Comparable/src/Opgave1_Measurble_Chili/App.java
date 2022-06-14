package Opgave1_Measurble_Chili;

public class
App {

    public static void main(String[] args) {

        Measurable[] chillier = new Measurable[4];

        Chili c1 = new Chili("Habanero ",300000);
        Chili c2 = new Chili("Carolina Reaper",2500000);
        Chili c3 = new Chili("Ralapenias",5000);
        Chili c4 = new Chili("Ghost",800000);

        chillier[0] = c1;
        chillier[1] = c2;
        chillier[2] = c3;
        chillier[3] = c4;

        System.out.println("Gennemsnitlige styrke på chillierne " + avg(chillier));

        System.out.println("Chili med største, scoville scala; " + max(chillier));

    }


    public static Measurable max(Measurable[] objekts){
        double sum = 0;
        int indeks = 0;
        for (int i = 0; i < objekts.length;i++){
            if (sum < objekts[i].getMeasure()){
                sum = objekts[i].getMeasure();
                indeks = i;
            }
        }
        return objekts[indeks];
    }

    public static double avg(Measurable[] objekts){
        double avgSum = 0;
        for (Measurable c : objekts){
            avgSum += c.getMeasure();
        }
        return avgSum / objekts.length;
    }

}
