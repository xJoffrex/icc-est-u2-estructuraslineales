package src.Models;






public class Nodos {

    private int valor;
    private Nodos Next;


    public Nodos(int valor) {
        this.valor = valor;
        this.Next = null;
    }

    

    
    public int getValor() {
        return valor;
    }




    public void setValor(int valor) {
        this.valor = valor;
    }

    



    @Override
    public String toString(){
        return "Valor: " + valor;
    }




    public Nodos getNext() {
        return Next;
    }




    public void setNext(Nodos next) {
        Next = next;
    }

    
}
