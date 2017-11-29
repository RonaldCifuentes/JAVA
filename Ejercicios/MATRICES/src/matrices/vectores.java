package matrices;
import java.util.*;

public class vectores {
    static double Af,Pf,are,per;
    public static void main(String[] Args){
        int i=1,opc;
        Scanner lea=new Scanner(System.in);
        System.out.println("Ingrese La cantidad de veces que desea ingresar los datos:");
        int D=lea.nextInt();
        double Va[]=new double[D];
        double Vp[]=new double[D];

        for(i=0;i<D;i++){
            System.out.println("Digite el numero de la figura que desea analizar\n"
                    + "1) triangulo\n"
                    + "2) cuadrado\n"
                    + "3) rectangulo\n"
                    + "4) rombo");
            opc=lea.nextInt();
            switch(opc){
                case 1:
                    int B,H,l1,l2,l3;
                    System.out.println("Ingrese la base del triangulo");
                    B=lea.nextInt();
                    System.out.println("Ingrese la altura del triangulo");
                    H=lea.nextInt();
                    System.out.println("Ingrese el primer lado del triangulo");
                    l1=lea.nextInt();
                    System.out.println("Ingrese el segundo lado del triangulo");
                    l2=lea.nextInt();
                    System.out.println("Ingrese el tercer lado del triangulo");
                    l3=lea.nextInt();
                    Af=areaT(B,H);
                    Pf=perimetroT(l1,l2,l3);
                    System.out.println("El area es: "+Af);
                    System.out.println("El perimetro es:"+Pf);
                    break;
                case 2:
                    int A;
                    System.out.println("Ingrese un lado del cuadrado");
                    A=lea.nextInt();
                    Af=areac(A);
                    Pf=perimetroc(A);
                    System.out.println("El area es: "+Af);
                    System.out.println("El perimetro es:"+Pf);
                    break;
                case 3:
                    int b,h;
                    System.out.println("Ingrese la base del rectangulo");
                    b=lea.nextInt();
                    System.out.println("Ingrese la altura del rectangulo");
                    h=lea.nextInt();
                    Af=arear(b,h);
                    Pf=perimetror(b,h);
                    System.out.println("El area es: "+Af);
                    System.out.println("El perimetro es:"+Pf);
                    break;
                case 4:
                    int a,D1,d;
                    System.out.println("Ingrese el lado del rombo");
                    a=lea.nextInt();
                    System.out.println("Ingrese la diagonal mayor");
                    D1=lea.nextInt();
                    System.out.println("Ingrese la diagonal menor");
                    d=lea.nextInt();
                    Af=arearom(D1,d);
                    Pf=perimetrorom(a);
                    System.out.println("El area es: "+Af);
                    System.out.println("El perimetro es:"+Pf);
                    break;
                default:
                    System.out.println("¡ERROR!");
                    break;
            }
            Va[i]=Af;
            Vp[i]=Pf;
        }
        System.out.println("\nVector Areas\n");
        ImprimirV(Va,D);
        System.out.println("\nVector Perimetos\n");
        ImprimirV(Vp,D);
        
        OrdenamientoMayorMenor(Vp,D,i);
        OrdenamientoMayorMenorArea(Va,D,i);
        DecirMayorMenorArea(Vp,Va,D);
        
    }
    public static double areaT(int B, int H){
        are=(B*H)/2;
        return are;
    }
    
    public static double perimetroT(int l1,int l2,int l3){
        per=l1+l2+l3;
        return per;
    }
    public static double areac(int A){
        are=A*A;
        return are;
    }
    
    public static double perimetroc(int A){
        per=4*A;
        return per;
    }
    public static double arear(int b, int h){
        are=b*h;
        return are;
    }
    
    public static double perimetror(int b,int h){
        per=(2*b)+(2*h);
        return per;
    }
    
    public static double arearom(int D1,int d){
        are=(D1*d)/2;
        return are;
    }
    
    public static double perimetrorom(int A){
        per=4*A;
        return per;
    }
    public static void ImprimirV(double V[],int D){
        for(int i=0;i<D;i++){
            System.out.println("Vector["+i+"]="+V[i]);
        }
    }
    
    public static void OrdenamientoMayorMenor(double V[],int D,int i){
        double aux=0;
        int k=i+1;
        for(i=0;i<D;i++){
            for(k=i+1;k<D;k++){
                if(V[i]>=V[k]){
                    aux=V[i];
                    V[i]=V[k];
                    V[k]=aux;
                }
            }
        }
        System.out.println("El vector de perimetro ordenado es:");
        for(i=0;i<D;i++){
            System.out.println("Vector["+i+"]="+V[i]);
        }
    }
    
    public static void OrdenamientoMayorMenorArea(double V[],int D,int i){
        double aux=0;
        int l=i+1;
        for(i=0;i<D;i++){
            for(l=i+1;l<D;l++){
                if(V[i]>=V[l]){
                    aux=V[i];
                    V[i]=V[l];
                    V[l]=aux;
                }
            }
        }
        System.out.println("El vector de perimetro ordenado es:");
        for(i=0;i<D;i++){
            System.out.println("Vector["+i+"]="+V[i]);
        }
    }
    
    public static void DecirMayorMenorArea(double V1[],double V2[],int D){
        double sum1=0,sum2=0,prom=0;
        System.out.println("El perimetro mayor es:"+V1[0]);
        System.out.println("El area menor es:"+V2[D-1]);
        for(int i=0;i<D;i++){
            sum1=sum1+V1[i];
        }
        for(int i=0;i<D;i++){
            sum2=sum2+V2[i];
        }
        prom=(sum1+sum2)/(D*D);
        System.out.println("El promedio de los vectores es: " + prom);
    }
    
}
