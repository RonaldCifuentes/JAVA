
package EJERCICIOS;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class EJERCICIO3 {
    
    public static void main(String[] args){
        String s;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print(">>>");
            s = in.nextLine();
            System.out.println(s);
        } while ( !"exit".equals(s));
    }
}


