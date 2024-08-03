package L02_QueueADT;

import L02_StackADT.StackADT;

import java.util.NoSuchElementException;

public class QueueADT<T> implements AbstractQueueADT<T>{
    private class Node<T>{
        private T element;
        private Node<T> next;
        public Node(T element){
            this.element = element;
            this.next = null;
        }
    }

    private Node<T> head;
    private int size;

    public QueueADT(){
        this.head = null;
        this.size = 0;
    }


    @Override
    public void offer(T element) {
        Node<T> newNode = new Node<>(element);

        if(isEmpty()){
            head = newNode;
        } else {
            Node<T> tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
        this.size++;
    }

    @Override
    public T poll() {
        if(isEmpty()){
            throw new NoSuchElementException("Queue is currently empty.");
        }

        T oldNodeValue = head.element;

        if(this.size == 1){
            head = null;
        } else {
            Node<T> tempNode = head.next;
            head.next = null;
            head = tempNode;
        }

        this.size--;

        return oldNodeValue;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new NoSuchElementException("Queue is currently empty.");
        }

        return head.element;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString(){
        // [30, 20, 10]
        StringBuilder results = new StringBuilder();
        results.append("[");

        Node<T> tempNode = head;

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

class Program {
    public static void main(String[] args) {
        QueueADT<Integer> myQueueADT = new QueueADT<>();
        System.out.println(myQueueADT.isEmpty()); // true

        myQueueADT.offer(10);
        myQueueADT.offer(20);
        myQueueADT.offer(30);
        myQueueADT.offer(40);
        myQueueADT.offer(50);

        System.out.println(myQueueADT);

        System.out.println(myQueueADT.isEmpty()); // false

        System.out.println(myQueueADT.peek()); // 10
        System.out.println(myQueueADT.peek()); // 10
        System.out.println(myQueueADT.peek()); // 10

        System.out.println(myQueueADT.poll()); // 10
        System.out.println(myQueueADT.poll()); // 20
        System.out.println(myQueueADT.poll()); // 30

        System.out.println(myQueueADT.size()); // 2

        System.out.println(myQueueADT); // [40, 50]
    }
}
