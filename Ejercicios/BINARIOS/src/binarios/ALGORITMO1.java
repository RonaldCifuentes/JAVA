/*
Elaborar un algoritmo de n posiciones de n elementos con n menor que 100 y
construya un menu que permita.

*leer e imprimir el vector
*Insertar un valor en el vector
*Ordenar el vector de manera acendente
*Ordenar el vector de manera decendente
*Insertar un nuevo elemento en el vector ordenado acendente sin dañar el orden
del vector
*Buscar un valor que el usuario escoja y determinar si se encuentra en el vector
*borrar un elemento del vector, sin dejar el espacio nulo en el indice donde fue
eliminado dicho elemento(No se vale llenar el espacio con un nuevo numero)


 */
package binarios;

import java.util.*;
import javax.swing.JOptionPane;

public class ALGORITMO1 {
    static int n,exit=1;
    public static void main(String[] args){
        int vect[];
        n=IngresarTamañoVector();
        vect=new int[n];
        do{
            Menu(vect);
        }while(exit==1);
        
    }
    
    public static void Menu(int v[]){
        int x;
        x=Integer.parseInt(JOptionPane.showInputDialog("Seleccione porfavor una de las siguientes opciones:\n\n"
                + "0) Mostrar el tamaño del vector\n"
                + "1) llenar el vector\n"
                + "2) imprimir el vector\n"
                + "3) Insertar un valor en el vector\n"
                + "4) Ordenar el vector de manera acendente\n"
                + "5) Ordenar el vector de manera decendente\n"
                + "6) Insertar un nuevo elemento en el vector\n"
                + "7) Buscar elemento\n"
                + "8) Borrar un elemento del vector\n"
                + "9) exit\n"));

        switch(x){
            case 0:
                JOptionPane.showMessageDialog(null,"El tamaño del vector es: "+v.length+"\n");
                break;
            case 1:
                LlenarVector(v);
                break;
            case 2:
                ImprimirVector(v);
                break;
            case 3:
                InsertarEnVector(v);
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:

                break;
            case 8:
                
                break;
            case 9:
                exit=0;
                break;
            default:
                break;
        }
    }
    
    public static int IngresarTamañoVector(){
        int x=Integer.parseInt(JOptionPane.showInputDialog("Por Favor Ingrese Un Tamaño Para El Vector:"));
        return x;
    }
    public static void InsertarEnVector(int a[]){
        //System.out.println("El tamaño original es: " + a.length);
        a=Redimensionar(a,n);
        //System.out.println("El tamaño original es: " + a.length);
    }
    
    public static void ImprimirVector(int a[]){
        int i;
        String s="";
        for(i=0;i<a.length;i++){
            s+=("vector["+i+"]="+a[i]+"\n");
        }
        JOptionPane.showMessageDialog(null,s);
    }
    
    public static void LlenarVector(int a[]){
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion:\n"
                    + "Vector["+i+"]="));
        }
        
    }
    
    public static int[] Redimensionar(int a1[],int n1){
        JOptionPane.showMessageDialog(null,"El tamaño original es: " + a1.length);
        int a2[]=new int[n1];
        int i;
        for(i=0;i<n1;i++){
            a2[i]=a1[i];
        }
        
        a1=new int[n1+1];
        for(i=0;i<n1;i++){
            a1[i]=a2[i];
        }
        JOptionPane.showMessageDialog(null,"El tamaño Redimensionado es: " + a1.length);
        return a1;
    }
}
 