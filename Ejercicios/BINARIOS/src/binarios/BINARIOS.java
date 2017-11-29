package binarios;

import java.util.Scanner;

public class BINARIOS {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String bin;
        do{
            System.out.println("Ingrese un binario");
            bin=leer.nextLine();
        }while(VerificarBin(bin));
        
        
        System.out.println("El numero ingresado es un binario");
    }
    public static boolean VerificarBin(String str){
        boolean b=false;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)=='1')||(str.charAt(i)=='0')){
                b=false;
            }else{
                b=true;
                break;
            }
        }
        return b;
    }
}
