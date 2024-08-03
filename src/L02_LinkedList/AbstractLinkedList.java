package L02_LinkedList;

public interface AbstractLinkedList<T>{
    void addFirst( T element ); // ~ push
    void addLast( T element ); // ~ offer
    T removeFirst( ); // ~ pop
    T removeLast( ); // ~ poll
    T getFirst( ); // ~ peek > head
    T getLast( ); // ~ peek > tail
    int size( );
    boolean isEmpty( );
}