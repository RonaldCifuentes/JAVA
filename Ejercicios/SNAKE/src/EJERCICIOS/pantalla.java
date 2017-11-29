
package EJERCICIOS;

public class pantalla{ 

    public static void clrscr(int n) { 
        for (int i = 0; i < n; i ++) 
        System.out.println(" " ); 
    } 
    public static void gotoxy(int c,int f){
        for( int i=0;i<c;i++) 
        { 
        System.out.println("\n "); 
        } 
        for(int j=0;j<f;j++) 
        { 
        System.out.println(" "); 
        }
    } 
} 