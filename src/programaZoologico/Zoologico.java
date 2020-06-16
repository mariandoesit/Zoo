package programaZoologico;

public class Zoologico {
    public Zoologico(){}
    
    public static final int Cantidad_Animales = 25;
    public static final int Raciones_por_animal = 5;
    
    private boolean abierto = false;
    
    public void abrir(){
        this.abierto = true;
    }
    
    public void cerrar(){
        this.abierto = false;
    }
    
    public void alimentarAnimales(int unaCantidadDeRaciones){
        Cuidador cuidador = new Cuidador(unaCantidadDeRaciones);
        cuidador.alimentarAnimales();
    }
    
    public boolean isAbierto(){
        return abierto;
    }
    
    public void setAbierto(boolean abierto){
        this.abierto = abierto;
    }
    
   
}
