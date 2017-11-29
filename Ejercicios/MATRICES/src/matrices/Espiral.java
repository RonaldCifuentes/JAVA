/*
El siguiente algoritmo crea una matriz de tamaño m x n,
creando una secuencia de conteo desde el centro y en espiral hacia afuera
*/
package matrices;

import javax.swing.JOptionPane;

public class Espiral {
    public static void main(String[] args){
        int f,c;
        f=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de las\n"
                + "filas de la matriz espiral:"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de las\n"
                + "columnas matriz espiral:"));
        int m[][]=new int[f][c];
        
        
        if(Espiral(m,f,c)){ImprimirMatriz(m,f,c);}
        
    }
    
    public static boolean Espiral(int m[][],int f, int c){
        int i=mitad(f),j=mitad(c);
        int n=f*c;
        int c1=0,c2=0,cc1=1,cc2=1;
        int signo=0;
        System.out.println();
        if(f==c){    
            if(!par(f)&&!par(c)){
                for(int k=1;k<=n;k++){
                    m[i][j]=k;
                    if(c2>=cc2){
                        if(signo==0){signo=1;}else{signo=0;}
                        c2=0;
                        cc2+=2;
                    }
                    c2++;
                    if(c1>=(cc1*2)){
                        c1=0;
                        cc1++;
                    }
                    if(c1<cc1){
                        if(signo==0){
                            i--;
                        }
                        else{
                            i++;
                        }
                    }
                    else{
                        if(signo==0){
                            j--;
                        }
                        else{
                            j++;
                        }
                    }
                    c1++;
                }
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "¡La Matiz debe tener centro!");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "¡Ingrese una matriz Cuadrada!");
        }
        return false;
    }
    
    
    
    public static void ImprimirMatriz(int m[][],int f, int c){
        String s="";
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                if((f*c)<100){
                    if(m[i][j]<10){
                        s+="| "+m[i][j]+" ";
                    }
                    else{
                        s+="|"+m[i][j];
                    }
                }
                else{
                    if(m[i][j]<10){
                        s+="|   "+m[i][j]+"  ";
                    }
                    if((m[i][j]>=10)&&(m[i][j]<100)){
                        s+="|  "+m[i][j]+" ";
                    }
                    if(m[i][j]>=100){
                        s+="| "+m[i][j];
                    }
                }
            }
            s+="|\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
    
    
    public static int mitad(int x){
        int r;
        if(par(x)){
            r=x/2;
        }
        else{
            r=(x-1)/2;
        }
        return r;
    }
    public static boolean par(int x){
        boolean r;
        r=(x%2==0);
        return r;
    }
}
