package L02_StackADT;

public class StackADT<T> implements AbstractStackADT<T> {
    private class Node<T>{
        private T element;
        private Node<T> next;
        public Node(T element){
            this.element = element;
            this.next = null;
        }
    }

    private Node<T> top;

    // constructor
    public StackADT(){
        this.top = null;
    }


    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element);

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}

class Program{
    public static void main(String[] args) {

    }
}