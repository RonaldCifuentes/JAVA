package EJERCICIOS;

import javax.swing.JOptionPane;

public class EJERCICIO4 {
    static int n=0,N1=0,N2=1,f=0;
    public static void main( String[] args ){
        leer();
        Fibonacci_dw();
        mostrar();
    }
    
    public static void leer(){
        n=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese hasta que\n"
                + "elemento desea calcular la serie"));
    }
    
    public static void Fibonacci_dw(){
        int i=1;
        if(n!=0){
            do{
                f=N1+N2;
                N1=N2;
                N2=f;
                i++;
            }while(i<n);
        }
    }
    
    
    public static void mostrar(){
        JOptionPane.showMessageDialog(null,"El elemento ("+n+"): "+ f);
    }
}
