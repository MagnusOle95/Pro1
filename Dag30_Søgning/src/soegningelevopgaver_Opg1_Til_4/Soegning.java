package soegningelevopgaver_Opg1_Til_4;

public class Soegning {

    public boolean findUlige(int[] tabel) {
        // TODO Opgave1
        boolean uligetal = false;
        int i = 0;
        while (!uligetal && i < tabel.length){
            int tal = tabel[i];
            if (tal % 2 == 1){
                uligetal = true;
            }else{
                i++;
            }
        }
        return uligetal;
    }

    // her skriver du metoder til opgaverne 2,3,5,6 og 7

    //Opgave 2
    public int findFirsttal(int[] list, int startværdi,int slutværdi){
        int tal = -1;
        int i = 0;
        while (tal == -1 && i < list.length){
            int k = list[i];
            if (k >= startværdi && k <= slutværdi){
                tal = k;
            }else{
                i++;
            }
        }
        return tal;
    }

    //Opgave 3
    public boolean toEnsTal(int[] list){
        boolean toEns = false;
        int i = 0;
        int k = 0;
        int k2 = 0;
        while (!toEns && i < list.length - 1){
            k = list[i];
            k2 = list[i+1];
            if (k == k2){
                toEns = true;
            }else{
                i++;
            }
        }
        return toEns;
    }

    //Opgave 4





}
