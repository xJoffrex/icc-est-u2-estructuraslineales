package src.Controllers;

import java.util.EmptyStackException;

import src.Models.NodeGeneric;
import src.Models.Persona;

public class GenericQueue<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    int size;

    public GenericQueue(){
        this.size = 0;
        this.primero = null;
        this.ultimo = null;

    }

    public void QueueAdd(T value){
        NodeGeneric<T> newNodo = new NodeGeneric<>(value);

        if(isEmpty()){
            primero = newNodo;
            ultimo = newNodo;
        }else{
            ultimo.setNext(newNodo);
            ultimo = newNodo;
        }
        size++;
    }

    private boolean isEmpty() {
        return primero == null;
    }

    public T remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        
        }
        T aux = primero.getValue();
        primero = primero.getNext();
        size--;
        return aux;
    }

    public T peek(){
        if(isEmpty()) throw new EmptyStackException() ; return primero.getValue();
             
    }

    public int size(){
        return size;
    }  

    public void printCola() {
        NodeGeneric<T> actual = primero;
        System.out.println("Cola:");
            while (actual != null) {
            System.out.println(actual.getValue());
            actual = actual.getNext();
        }
    }   

    public String findByName(String name) {
        NodeGeneric<T> actual = primero;
        
        while (actual != null) {
            Persona persona = (Persona) actual.getValue(); 
            if (persona.getNombre().equalsIgnoreCase(name)) {
                return persona.getNombre(); 
            }
            actual = actual.getNext();
        }
        
        return null; 
    }



    public String deletePersonByName(String name) {
        if (isEmpty()) {
            return null;
        }

        NodeGeneric<T> actual = primero;
        NodeGeneric<T> anterior = null;

        while (actual != null) {
            Persona persona = (Persona) actual.getValue();
            if (persona.getNombre().equalsIgnoreCase(name)) {
                String nombreEliminado = persona.getNombre(); 

                if (anterior == null) {
                    primero = primero.getNext();
                    if (primero == null) {
                        ultimo = null; 
                    }
                } else {
                    anterior.setNext(actual.getNext());
                    if (actual == ultimo) {
                        ultimo = anterior;
                    }
                }
                size--;
                return nombreEliminado; 
            }
            anterior = actual;
            actual = actual.getNext();
        }
        return null;
    }






}
