package EJERCICIOS;

import javax.swing.UIManager;
import EJERCICIOS.Consola;

public class main{
    public static void main(String args[]){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            java.awt.EventQueue.invokeLater(new Runnable(){
                public void run(){
                    new Consola().setVisible(true);
                }
            });
        }
        catch(Exception e) {}
    }
}