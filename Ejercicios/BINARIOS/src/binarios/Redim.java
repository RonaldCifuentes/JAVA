package binarios;

import javax.swing.JOptionPane;

public class Redim {
    public static void main(String[] args){
        int v1[]=new int[6];
        v1[0]=10;
        v1[1]=5;
        v1[2]=20;
        ImprimirVector(v1);
    }
    
    public static void Redimensionar(){
        
    }
    
    public static void ImprimirVector(int v[]){
        int i;
        String s="";
        for(i=0;i<v.length;i++){
            s+=("vector["+i+"]="+v[i]+"\n");
        }
        JOptionPane.showMessageDialog(null,s);
    }
}
