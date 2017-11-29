/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author MAQUINA
 */
public class CocktailSort {
    //variables para ordenamientopublic static int izquierda,derecha,ultimo; 
// predefino arreglo 
public static int arreglo[] = {10,23,6,4,223,2,112,3,6,34};
public static void main(String[] args){
    int izquierda = 1;
    int derecha = arreglo.length;
    int ultimo = arreglo.length-1;
    
    do{
        for(int i = arreglo.length-1;i > 0;i--){
            if(arreglo[i-1] > arreglo[i]){
                int aux = arreglo[i];
                arreglo[i] = arreglo[i-1];
                arreglo[i-1] = aux;   ultimo = i;
            }
        }
        izquierda = ultimo+1;
        for(int j=1;j<arreglo[j];j++){
            int aux = arreglo[j];
            arreglo[j] = arreglo[j-1];
            arreglo[j-1] = aux;
            ultimo = j;
        }
        derecha = ultimo-1;
    }while(derecha >= izquierda);

    for(int i=0;i <= arreglo.length-1;i++){      
         System.out.println(arreglo[i]);
    }
  }
}
