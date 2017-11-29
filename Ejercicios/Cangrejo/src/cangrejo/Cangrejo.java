import java.util.Scanner;

public class Cangrejo {
    public static void main(String[] args){
        int n, i=0, j=0;
        Scanner lea = new Scanner(System.in);
        n=lea.nextInt();
        String v[]=new String[n];
        char M[][]=new char[n][n];
        
        for(i=0;i<n;i++){
                v[i]= lea.next();
        }
        
        M=convmat(v);
        
        
        if(simetria(M,n)==true){
            System.out.println("Simetrica");
        }
        else{
            System.out.println("Antsimetrica");
	}
    }
    
    public static boolean simetria(char M[][], int n){
        int i=0, j=0;
        boolean a=true;
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(!(M[i][j]==(M[j][i]))){
                    return false;
                }
            }
        }
        return a;
    }
    
    public static char[][] convmat(String s[]){
        int n=s.length;
        char M[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                M[i][j]=s[i].charAt(j);
            }
        }
        return M;
    }
    
}
