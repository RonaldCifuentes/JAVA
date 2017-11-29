package EJERCICIOS;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class CLASE1 {
    public static void main(String[] args){        
        int total;
        Scanner leer=new Scanner(System.in);
        System.out.println("numero1:"); 
        int a=leer.nextByte(); 

        System.out.println("numero2:"); 
        int b=leer.nextInt(); 
        total=a*b; 
        System.out.println("resultado:"+total); 

        pantalla.clrscr(15); 
        pantalla.gotoxy(2,1);System.out.println("ingrese nombre:"); 
        String cad=leer.nextLine(); 
    }
}

