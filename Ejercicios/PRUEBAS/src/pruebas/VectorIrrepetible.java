/*
Cree un vector de 10 posisiones para el que el usuario debera ingresar los valores,
pero asegurese de que no se pueda repetir ninguno de los valores que ingresen
en el vector
*/

package pruebas;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class VectorIrrepetible {
Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        int vec[]=new int[10];
        Leer(vec);
    }
    public static void Leer(int v[]){
        int i=0;
        int n=v.length;
        boolean val=false;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese Los 10 elementos del vector:");
        
        for(i=0;i<n;i+=1){
            do{
                System.out.print("vector["+i+"]=");
                v[i]=leer.nextInt();
            }while(verificar(v,i));
        }
        ImprimirVector(v);
    }
    public static boolean verificar(int v1[],int e){
        boolean state=false;
        if(e>0){
            if(BuscarElemento(v1,e,v1[e])!=-1){
                System.out.println("El elemento "+v1[e]+" ya se encuentra en el"
                        + " vector, Ingrese porfavor otro numero:");
                state=true;
            }
        }
        return state;
    }
    
    public static int BuscarElemento(int v[],int n, int x){
        boolean state=false;
        int find=-1;
        
        for(int i=0;i<n;i+=1){
            if(v[i]==x){
                find=i;
            }
        }
        return find;
    }
    
    public static void ImprimirVector(int v[]){
        String s="";
        for(int i=0;(i<v.length);i++){
            s+="Vector ["+ i + "]= " +Integer.toString(v[i])+"\n";
        }
        JOptionPane.showMessageDialog(null,s);
    }
}
