package pruebas;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BURBUJA {

    public static void main(String[] args){
        String s="";
        int []vect={5,7,4,2,6,1,3};
        int i;
        for(i=0;i<4;i++){
            Burbuja(vect,vect.length);
        }
        for(i=0;i<vect.length;i++){
            s+=Integer.toString(vect[i]);
        }
        JOptionPane.showMessageDialog(null,s);
    }
    public static void Burbuja(int a[], int n){
        int i,j, aux;
        for(i=2;i<n;i+=1){
            for(j=0;j<=(n-i);j+=1){
                if(a[j]>a[j+1]){
                    aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }
            }
        }
    }
}
