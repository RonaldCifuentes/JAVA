package pruebas;

public class BUSCAR_BINARIO {
     public static void main(String[] args) {
    	int[]vec ={1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,80,82};
        System.out.println(busquedaBinaria(vec,vec.length,7));
    }
    public static int busquedaBinaria(int  v[],int n, int x){
        int m;
        int ini=0;
        int fin=n-1;
        while(ini<=fin){
            m=(fin+ini)/2;
            if(v[m]==x){
                return m;
            }
            else if(x<v[m]){
                fin=m-1;
            }
            else{
                ini=m+1;
            }
        }
        return -1;
    }
}
