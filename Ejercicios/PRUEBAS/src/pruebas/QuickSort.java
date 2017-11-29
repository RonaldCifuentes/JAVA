package pruebas;

import javax.swing.JOptionPane;

public class QuickSort {
    public static void main(String[] args){
        int vec[]={8,5,3,4,2,7,9,6,1};
        ImprimirVector(quicksort(vec,0,8));
    }
    public  static int[] quicksort(int v[], int izq, int der){
        int pivote=v[izq]; // tomamos primer elemento como pivote
        int i=izq; // i realiza la búsqueda de izquierda a derecha
        int j=der; // j realiza la búsqueda de derecha a izquierda
        int aux;
        
        while(i<j){            // mientras no se crucen las búsquedas
            while(v[i]<=pivote && i<j)i++; // busca elemento mayor que pivote
            while(v[j]>pivote)j--;         // busca elemento menor que pivote
            if (i<j) {                      // si no se han cruzado                      
                aux= v[i];                  // los intercambia
                v[i]=v[j];
                v[j]=aux;
            }
        }
        v[izq]=v[j]; // se coloca el pivote en su lugar de forma que tendremos
        v[j]=pivote; // los menores a su izquierda y los mayores a su derecha
        if(izq<j-1){
            quicksort(v,izq,j-1); // ordenamos subarray izquierdo
        }
        if(j+1 <der){
            quicksort(v,j+1,der); // ordenamos subarray derecho
            
        }
        return v;
    }
    
    public static void ImprimirVector(int v[]){
        String s="";
        for(int i=0;(i<v.length);i++){
            s+="Vector ["+ i + "]= " +Integer.toString(v[i])+"\n";
        }
        JOptionPane.showMessageDialog(null,s);
    }
}