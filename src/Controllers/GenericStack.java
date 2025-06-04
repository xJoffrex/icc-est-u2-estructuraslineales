package src.Controllers;

import java.util.EmptyStackException;
import src.Models.NodeGeneric;

public class GenericStack<T> {
    private NodeGeneric<T> top;

    public GenericStack() {
        this.top = null;
    }

    public void Gpush(T value){
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        newNode.setNext(top);
        top = newNode;
    }

    public T Gpop(){
        if (GisEmpty()){
            throw new EmptyStackException();
        }
        T val = top.getValue();
        top = top.getNext();
        return val;
    }

    public T Gpeek(){
        if (GisEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean GisEmpty(){
        return top == null;
    }

    public void GprintStack(){
        NodeGeneric<T> aux = top;
        while (aux != null) {
            System.out.print(aux.getValue() + "|");
            aux = aux.getNext();
        }   
        System.out.println();
    }

    public int size(){
        NodeGeneric<T> auxs = top;
        int count = 0;
        while (auxs != null) {
            count++;
            auxs = auxs.getNext();
        }
        return count;
    }
}
