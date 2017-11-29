package EJERCICIOS;
import java.math.BigDecimal;

public class EJERCICIO5 {
    private static double PI=3.1415926535897932384626433832795;
    
    public static void main(String[] args){
        double angulo=toRad(60);
        
        int num=fact(3);
        double r=cos(angulo);
        System.out.println(r);
    }
    public static double cos(double x){
        double suma=0,n=0,p=0.00000001d;
        int k=0;
        do{
            n=Math.pow(-1, k)/fact(2*k)*Math.pow(x,2*k);
            suma+=n;
            k++;
        }while(Math.abs(n)>p);
        return suma;
    }
    public static double toRad(double x){
        double r=(x*PI/180);
        return r;
    }
    public static int fact(int x){
        int f=1;
        while(x>0){
            f*=x--;
        }
        return f;
    }
}
