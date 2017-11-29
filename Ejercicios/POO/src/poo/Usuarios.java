package poo;

public class Usuarios {
    //Datos Miembro
    private String nombre;
    private String color;
    private double altura;
    private double peso;
    
    //Constructor
    public Usuarios(){
        nombre="Sin Nombre";
        color="Sin Color";
        altura=0;
        peso=0;
    }
    
    //Metodos Setters
    public void SetColor(String color){
        this.color=color;
    }
    
    //Metodos Getters
    public String GetColor(){
        return this.color;
    }
    
}
