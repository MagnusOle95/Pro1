package Opgave2_Customer_Compare;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Customer[] kunder = new Customer[5];
        Customer c1 = new Customer("jens","karl" ,27);
        Customer c2 = new Customer("jens","madsen" ,30);
        Customer c3 = new Customer("lars","karl" ,40);
        Customer c4 = new Customer("jens","karl" ,90);
        Customer c5 = new Customer("jens","karl" ,45);


        kunder[0] = c1;
        kunder[1] = c2;
        kunder[2] = c3;
        kunder[3] = c4;
        kunder[4] = c5;


        System.out.println(lastcustomer(kunder));

        System.out.println(Arrays.toString(aftercustomer(kunder,c1)));


    }

    public static Customer lastcustomer (Customer[] customers){
        Customer c = customers[0];
        for (int i = 1; i < customers.length ; i++){
            if (c.compareTo(customers[i]) < 0){
                c = customers[i];
            }
        }
        return c;
    }

    public static Customer[] aftercustomer (Customer[] customers,Customer customer){
        Customer[] newCus = new Customer[customers.length];
        int i = 0;

        for (Customer c : customers){
            if (c.compareTo(customer) > 0){
                newCus[i] = c;
                i++;
            }
        }
        return newCus;
    }



}
