package programaZoologico;

public class Cuidador extends Persona{
    private int cantidadDeRaciones;
    
    public Cuidador() {}
    
    public Cuidador (int unaCantidad) {
        this.cantidadDeRaciones = unaCantidad;
    }
    
    public void alimentarAnimales(){
        int cantidadNecesaria = Zoologico.Cantidad_Animales * Zoologico.Raciones_por_animal;
        int sobranteFaltante = cantidadDeRaciones - cantidadNecesaria;
        
        String mensaje = "";
        
        if (sobranteFaltante == 0){
            mensaje = "La comida alcanzó justo";
        } else if (sobranteFaltante > 0){
            mensaje = "La comida alcanzó y sobró";
        } else if (sobranteFaltante < 0){
            mensaje = "La comida no alcanzó";
        }
        
        System.out.println(mensaje);
    }
    
    public int getCantidadDeRaciones(){
        return this.cantidadDeRaciones;
    }
    
    public void setCantidadDeRaciones(int cantidadDeRaciones){
        this.cantidadDeRaciones = cantidadDeRaciones;
    }
}
