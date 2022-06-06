package Rekursion;

public class Factorial {

    public static void main(String[] args) {

        //Test opgave 1
        System.out.println(factorial(5));

        //Test opgave 2
        System.out.println(power(3,3));

        //Test opgave 2.2
        System.out.println(power2(3, 4));

        //Test Opgave 3
        System.out.println(product(3,3));

        //Test opgave 3.2
        System.out.println(productRus(3, 3));

        //Test opgave 3.2
        System.out.println(productRus(4, 4));

        //Test Opgave 4
        System.out.println(reverse("RANSLIRPA"));

        //Test opgave 5
        System.out.println(sfd(15, 5));

        System.out.println(sfd(5, 15));
    }



    //Opgave 1
    public static int factorial (int n){
        int resultat;
        if (n == 0){
            resultat = 1;
        }else{
            resultat = n * factorial(n - 1);
            }
        return resultat;
        }



      //Opgave 2
    public static int power(int n, int p){
        int resultat = 0;

        if (p == 0){
            resultat = 1;
        }else{
            resultat = power(n,p - 1) * n;
        }
        return resultat;
    }

    //Opgave 2.2
    public static int power2(int n, int p){
        int resultat = 0;

        if (p == 0){
            resultat = 1;
        }
        else if(p % 2 == 1){
            resultat = power2(n, p - 1) * n;
        }
        else if (p % 2 == 0){
            resultat = power2(n * n,p / 2);
        }
        return resultat;
    }


    //Opgave 3
    public static int product(int a, int b){
        int resultalt;

        if (a == 0){
            resultalt = 0;
        }else{
            resultalt = product(a-1, b) + b;
        }
        return resultalt;
    }


    //Opgave 3.3
    public static int productRus(int a, int b){
        int resultat;

        if (a == 0){
            resultat = 0;
        }else if (a % 2 == 1){
            resultat = productRus(a - 1,b) + b;
        }else{
            resultat = productRus(a / 2,b * 2);
        }
        return resultat;
    }


    //Opgave 4
    public static String reverse(String s){
        String resultat;

        if (s.isEmpty()){
            resultat = "";
        }
        else{
            resultat = s.charAt(s.length() - 1) + reverse(s.substring(0,s.length() - 1 ));
        }
        return resultat;

    }

    //Opgave 5
    public static int sfd(int a, int b){
        int resultat = 0;

        if (b <= a && a % b == 0){
            resultat = b;
        }
        if (a < b){
            sfd(b,a);
        }
        else{
            sfd(b,a % b);
        }

        return resultat;
    }









    }


