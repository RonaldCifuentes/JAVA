package matrices;

import javax.swing.JOptionPane;



public class p1 {

    public static void main(String[] args) {
        //double x=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero entero"));
        if(IsInt(6)){
            JOptionPane.showMessageDialog(null,"Es entero");
        }
        else{
            JOptionPane.showMessageDialog(null, "No es entero");
        }
    }
    
    public static boolean IsInt(double n){
        boolean r;
        int m;
        m=(int)n;
        r=((m-n)==0);
        return r;
    }
    
}
