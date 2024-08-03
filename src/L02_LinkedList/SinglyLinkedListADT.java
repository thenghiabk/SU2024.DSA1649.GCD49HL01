package L02_LinkedList;

public class SinglyLinkedListADT<T> implements AbstractLinkedList<T> {
    private class Node<T>{
        private T element;
        private Node<T> next;
        public Node(T element){
            this.element = element;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public SinglyLinkedListADT(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        this.size++;
    }

    @Override
    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);

        if(isEmpty()){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        this.size++;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
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

class Program{
    public static void main(String[] args) {
        SinglyLinkedListADT mySinglyLinkedList = new SinglyLinkedListADT<>();

        System.out.println(mySinglyLinkedList.isEmpty());

        mySinglyLinkedList.addLast(10);
        mySinglyLinkedList.addLast(20);
        mySinglyLinkedList.addLast(30);


        mySinglyLinkedList.addFirst(40);
        mySinglyLinkedList.addLast(50);

        System.out.println(mySinglyLinkedList);

        System.out.println(mySinglyLinkedList.isEmpty());
    }
}
