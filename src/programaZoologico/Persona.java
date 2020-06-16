package programaZoologico;

import java.util.Date;

public abstract class Persona {
    public Persona(){}
    
    private String nombre;
    private Date fechaDeNacimiento;
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Date getFechaDeNacimiento(){
        return this.fechaDeNacimiento;
    }
    
    public void setFechaDeNacimiento(Date fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
