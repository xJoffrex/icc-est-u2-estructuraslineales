package src.Models;

public class Persona {
    private String Nombre;

    public Persona(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona [Nombre=" + Nombre + "]";
    }
    
}
