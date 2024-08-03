package L02_StackADT;

import java.util.NoSuchElementException;

public class StackADT<T> implements AbstractStackADT<T> {
    private class Node<T>{
        private T element;
        private Node<T> next;
        public Node(T element){
            this.element = element;
            this.next = null;
        }
    }

    private Node<T> top; // Top of the stack
    private int size; // Track the size of stack

    // constructor
    public StackADT(){
        this.top = null;
        this.size = 0;
    }

    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element);

        // stack empty
        if ( this.top == null && isEmpty() ){
            this.top = newNode;
        }
        // stack not empty
        else {
            newNode.next = this.top;
            this.top = newNode;
        }

        this.size++;
    }

    @Override
    public T pop() {
        // check if stack empty
        if(isEmpty()){
            throw new NoSuchElementException("Stack is currently empty.");
        }

        T oldNodeValue = this.top.element;

        Node<T> nextNode = top.next;
        this.top.next = null;
        this.top = nextNode;
        this.size--;

        return oldNodeValue;
    }

    @Override
    public T peek() {
        // check if stack empty
        if(isEmpty()){
            throw new NoSuchElementException("Stack is currently empty.");
        }

        return this.top.element;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        // if empty, return true
        // else, return false

        // option 1
        //if (this.size == 0){
        //  return true;
        //}
        //return false;

        // option 2
        return this.size == 0;
    }

    @Override
    public String toString(){
        // [30, 20, 10]
        StringBuilder results = new StringBuilder();
        results.append("[");

        Node<T> tempNode = top;

        while(tempNode != null){
            results.append(tempNode.element);
            if(tempNode.next != null){
                results.append(", ");
            }
            tempNode = tempNode.next;
        }

        results.append("]");

        return results.toString();
    }
}

class Program{
    public static void main(String[] args) {
        StackADT<Integer> myStackADT = new StackADT<>();

        System.out.println(myStackADT.isEmpty()); // true

//        myStackADT.pop();

        myStackADT.push(10);
        myStackADT.push(20);
        myStackADT.push(30);

        System.out.println(myStackADT);

        System.out.println(myStackADT.isEmpty()); // false


        System.out.println(myStackADT.peek()); // 30
        System.out.println(myStackADT.peek()); // 30

        System.out.println(myStackADT.pop()); // 30

        System.out.println(myStackADT.peek()); // 20
        System.out.println(myStackADT.pop()); // 20
        System.out.println(myStackADT.pop()); // 10

        System.out.println(myStackADT.isEmpty()); // true
    }
}