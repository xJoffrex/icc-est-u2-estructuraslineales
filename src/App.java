package src;
import src.Controllers.*;
import src.Models.*;
public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Pedro");
        Persona p4 = new Persona("David");
        GenericQueue<Persona> colaPersona = new GenericQueue<Persona>();
        colaPersona.QueueAdd(p1);
        colaPersona.QueueAdd(p2);
        colaPersona.QueueAdd(p3);
        colaPersona.QueueAdd(p4);
        System.out.println("Perosna Atendida -> " + colaPersona.remove());
        colaPersona.printCola();

        String nombreEncontrado = colaPersona.findByName("Juan");
        System.out.println("Persona Encontrada -> " + (nombreEncontrado != null ? nombreEncontrado : "No encontrada"));

        String nombreEliminado = colaPersona.deletePersonByName("Pedro");
        System.out.println("Persona eliminada -> " + (nombreEliminado != null ? nombreEliminado : "No encontrada"));

    }
    

}
