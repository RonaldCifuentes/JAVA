package EJERCICIOS;
import java.awt.*;
import java.lang.*;
import java.io.IOException;


public class EJERCICIO2 {
    
    public static void main(String... arg) throws IOException, InterruptedException {
        System.out.println("hola");
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    /*
    public static void main( String[] args ) throws Exception{
        gotoxy(10,10);
        System.out.printf("Hola Mundo");
    }
    public static void gotoxy(int x,int y){
        System.out.printf("%c[%d;%df",0x1B,y,x);
    }
    */
}