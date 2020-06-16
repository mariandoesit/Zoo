package programaZoologico;

public class Programa {
    public Programa(){}
    
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        
        zoo.abrir();
        
        zoo.alimentarAnimales(30);
        
        zoo.cerrar();
    }
    
}
