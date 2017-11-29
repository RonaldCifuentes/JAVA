package cadenas;

import java.util.Scanner;

public class Cadenas {

    public static void main(String[] args) {
        int c;
        String cad="",pat="";
        Scanner leer=new Scanner(System.in);
        c=leer.nextInt();
        String sal[]=new String[c];
        for(int i=0;i<c;i++){
            cad=leer.next();
            pat=leer.next();
            sal[i]=procesar(cad,pat);
        }
        ImprimirArreglo(sal);
    }
    public static String procesar(String scad, String spat){
        String cs="";
        char cad[]=scad.toCharArray();
        char pat[]=spat.toCharArray();
        char aux[]=new char[scad.length()];
        int m=spat.length();
        
        for(int i=0;i<scad.length();i++){
            aux[i]=Determinar(cad[i],pat[i%m],i,m,(i%m));
        }
        cs=ConvCharToStr(aux,aux.length);
        return cs;
    }
    
    public static String ConvCharToStr(char a[],int n){
        String s="";
        for(int i=0;i<n;i++){
            s+=a[i];//Character.toString(a[i]);
        }
        return s;
    }
    
    
    public static char Determinar(char cad,char pat,int i,int m, int mod){
        char cr=0;
        switch(pat){
            case '+':
                cr=(char)(cad+1);
                break;
            case '-':
                cr=(char)(cad-1);
                break;
            case 'x':
                cr=cad;
                break;
        }
        return cr;
    }
    
    public static void ImprimirArreglo(String a[]){
        int i;
        String s="";
        for(i=0;i<a.length;i++){
            s+=("Cadena Loca "+ i +": "+a[i]+"\n");
        }
        System.out.println(s);
    }
    
}
