package src.Controllers;

import java.util.EmptyStackException;

import src.Models.Nodos;

public class Queue {
    private Nodos primero;
    private Nodos ultimo;
    int size;
    public Queue(){
        this.size = 0;
        this.primero = null;
        this.ultimo = null;

    }

    public void QueueAdd(int value){
        Nodos newNodo = new Nodos(value);

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

    public int remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        
        }
        int aux = primero.getValor();
        primero = primero.getNext();
        size--;
        return aux;
    }

    public int peek(){
        if(isEmpty()) throw new EmptyStackException() ; return primero.getValor();
             
    }

    public int size(){
        return size;
    }
}
