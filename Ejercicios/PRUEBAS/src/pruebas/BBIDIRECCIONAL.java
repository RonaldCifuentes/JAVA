/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import javax.swing.JOptionPane;

/**
 *
 * @author MAQUINA
 */
public class BBIDIRECCIONAL {
    public static void main(String[] args){
        //int vec[]={8,5,3,4,2,7,9,6,1};
        int vec[]={9,11,3,5,16};
        bbidireccional(vec,vec.length);
        ImprimirVector(vec);
        
    }
    public static void bbidireccional(int v[],int n){
        int i,j,izq,der,ultimo,aux;
        izq=0;
        der=n-1;
        ultimo=n-1;
        
        do{
            

            for(i=der;i>izq;i--){
                if(v[i-1]>v[i]){
                aux=v[i];
                v[i]=v[i-1];
                v[i-1]=aux;
                ultimo=i;
                }
            }
            izq=ultimo;
            
            for(j=izq;j<der;j++){
                if(v[j]>v[j+1]){
                    aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                    ultimo=j;
                }
            }
            der=ultimo;


        }while(izq<der);
        
    }
    public static void ImprimirVector(int v[]){
        String s="";
        for(int i=0;(i<v.length);i++){
            s+="Vector ["+ i + "]= " +Integer.toString(v[i])+"\n";
        }
        JOptionPane.showMessageDialog(null,s);
    }
            
}
