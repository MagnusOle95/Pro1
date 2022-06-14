package interfaces.Ordresystem_Discount_Interface;

import java.time.LocalDate;

public class TestApp {

    public static void main(String[] args) {
        //Opretter, produkterne
        Product p1 = new Product(203040,"Cola" ,12);
        Product p2 = new Product(203041,"Fanta" ,14);
        Product p3 = new Product(208080,"Ost" ,26);
        Product p4 = new Product(204021,"Mælk" ,9.95);
        Product p5 = new Product(972040,"Chokolade" ,18);

        //Opretter kunder
        Customer c1 = new Customer("Frank", LocalDate.of(1987,8 ,22 ));
        Customer c2 = new Customer("Benny",LocalDate.of(2000,1 , 3));

        //Opretter orderns til kunden.
        Order o1 = new Order(202020);
        o1.createOrderLine(5, p1);
        o1.createOrderLine(2, p4);
        c1.addOrder(o1);

        Order o2 = new Order(202021);
        o2.createOrderLine(1, p3);
        o2.createOrderLine(1, p5);
        c1.addOrder(o1);


        Order o3 = new Order(202022);
        o3.createOrderLine(2, p3);
        o3.createOrderLine(2, p2);
        c2.addOrder(o3);

        Order o4 = new Order(202023);
        o4.createOrderLine(4, p5);
        o4.createOrderLine(2, p3);
        c2.addOrder(o4);

        Order o5 = new Order(202024);
        o3.createOrderLine(4, p2);
        o3.createOrderLine(1, p1);
        c2.addOrder(o5);

        Order o6 = new Order(202025);
        o4.createOrderLine(5, p4);
        o4.createOrderLine(2, p2);
        c2.addOrder(o6);

        //Tester discount for kunde 1 med procentvis discound
        System.out.println("Samlede pris for ordre for kunde 1: " + c1.totalBuy());

        PercentDiscount pd = new PercentDiscount(30);
        c1.setDiscount(pd);

        System.out.println("Samlede pris for ordre for kunde 1 med percentes discound: " + c1.totalBuy());

        //Tester discound for kunde 2 med fixed discound

        System.out.println("Samlede pris for ordre kunde 2: " + c2.totalBuy());

        FixedDiscount fd = new FixedDiscount(50,300);
        c2.setDiscount(fd);

        System.out.println("Samlede pris for ordre kunde 2 med fixed discount: " + c2.totalBuy());

        // tester dicount med alders rabat.
        AgeDiscount ad = new AgeDiscount(30);
        c2.setDiscount(ad);

        System.out.println("Samlede pris for odre kunde 2 med age discount: " + c2.totalBuy());






    }
}
