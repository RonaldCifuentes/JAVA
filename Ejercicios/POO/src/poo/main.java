package poo;

public class main {

    public static void main(String[] args) {
        Usuarios user1=new Usuarios();
        Usuarios user2=new Usuarios();
        user1.SetColor("Verde");
        System.out.println(user1.GetColor());
        System.out.println(user2.GetColor());
    }
    
}
