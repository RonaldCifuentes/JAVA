package convchartostr;

public class ConvCharToStr {

    public static void main(String[] args) {
        char cad[]={'h','o','l','a','\0'};
        String str=ConvCharToStr(cad,cad.length);
        System.out.println(str);
    }

    public static String ConvCharToStr(char a[],int n){
        String s="";
        for(int i=0;i<n;i++){
            s+=Character.toString(a[i]);
        }
        return s;
    }
    
}
