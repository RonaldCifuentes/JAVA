package EJERCICIOS;

import java.util.*;

public class EJERCICIO1 {

    public static void main(String[] args){
        int numero=0,n1=0,cont=0;
        System.out.println("Por favor ingrese el indice del numero hasta\n"
                + "el que desea calcular el cuadrado:");
        Scanner leer = new Scanner(System.in);
        numero=leer.nextInt();
        while(cont<numero){
            n1+=2*(cont)+1;
            cont++;
        }
        
        System.out.println(n1);
    }
    
    private static void gotoxy(int x, int y){
        System.out.println("Hola Mundo");
    }
    
    public static void PintarMuros(){
        
    }
    
    
}
