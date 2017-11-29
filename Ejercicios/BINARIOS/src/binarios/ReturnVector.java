package binarios;

import javax.swing.JOptionPane;

public class ReturnVector {
    public static void main(String[] args){
        int a[]={2,6};
        JOptionPane.showMessageDialog(null,"Longitud original: "+a.length);
        ImprimirVector(a);
        a=vector();
        JOptionPane.showMessageDialog(null,"Longitud final: "+a.length);
        ImprimirVector(a);
    }
    
    public static int[] vector(){
        int v[]={10,5,20,5,9,4};
        return v;
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
