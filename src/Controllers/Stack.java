package src.Controllers;

import java.util.EmptyStackException;

import src.Models.Nodos;

public class Stack {
    private Nodos top;

    public Stack() {
        this.top = null;
    }

    public void push(int num){
        Nodos nNodo = new Nodos(num);
        nNodo.setNext(top);
        top = nNodo;
    }


    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int valos = top.getValor();
        top = top.getNext();
        return valos;
    }


    public int peek(){

        if (isEmpty()){
            throw new EmptyStackException();
        }

        int valoc = top.getValor();

        return valoc;
    }

    public boolean isEmpty(){
        
        return top == null;
    }

    public void printStack(){
        Nodos auxs = top;
        
        while (auxs != null) {
            int value = auxs.getValor();
            auxs = auxs.getNext();


            System.out.print(value+ "|");
            
        }   
    }

        public int size(){
        Nodos auxs = top;
        int rec = 0;
        while (auxs != null) {
            auxs = auxs.getNext();
            rec++;
            
        }
        return rec;


        
    }
}
