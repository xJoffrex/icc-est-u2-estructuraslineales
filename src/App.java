package src;
import src.Controllers.*;

public class App {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
 

        System.out.println("Tam " + stack.size());
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println("Tam " + stack.size());
    }


}
