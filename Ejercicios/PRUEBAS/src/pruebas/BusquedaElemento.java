package pruebas;

public class BusquedaElemento {
    public static void main(String[] args){
        int ver;
        int vec[]={18,6,5,3,9,32,56,34};
        ver=BuscarElemento(vec,32);
        if(ver!=-1){System.out.println(ver);}
    }
    public static int BuscarElemento(int v[], int x){
        boolean state=false;
        int find=-1;
        int n=v.length;
        
        for(int i=0;i<n;i+=1){
            if(v[i]==x){
                find=i;
            }
        }
        return find;
    }
}
