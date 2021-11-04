package Opgave1;

import javax.swing.JOptionPane;

public class E1_16og17_Hello_name {
    public static void main(String[] args) {
        String Personnavn = JOptionPane.showInputDialog("what is your name?");
        System.out.println(Personnavn);
        JOptionPane.showMessageDialog(null, "Hej søde " + Personnavn);
    }
}
