package Opgave5_Heltalskvadratrod_søgning;

public class KvadratRod {

    //Opgave 5 del 1
    public static String kvadratrodLinær(int n){
        int indeks = -1;
        int r = 0;
        while (indeks == -1){
            int tal1 = r * r;
            int tal2 = (r+1) * (r+1);
            if (tal1 <= n && n < tal2){
                indeks = r;
            }else {
                r++;
            }
        }
        return "r:" + indeks;
    }

    //Binær, opgave 5 del 2
    public static String kvadratrodBinær(int n){
        int r = -1;
        int left = 1;
        int right = n;
        int middle = -1;

        while (r == -1 && left <= right){
            middle = (left + right) / 2;
            if (middle * middle <= n && n < (middle + 1) * (middle + 1)){
                r = middle;
            }else if (middle * middle > n){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        return "r:" + r;
    }

    //-----------------------------------------------------------------------------------


    public static void main(String[] args) {

        //opgave 5 del 1.
        for (int i = 0; i < 120; i++){
            System.out.print("n:" + i + " " + kvadratrodLinær(i) + "\n");
            }

        System.out.println("\nTest for om den er det samme\n");

        //Opgave 5 del 2.
        for (int i = 0; i < 120; i++){
            System.out.print("n:" + i + " " + kvadratrodBinær(i) + "\n");
        }

    }

}


