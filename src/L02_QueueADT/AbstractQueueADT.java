package L02_QueueADT;

public interface AbstractQueueADT<T> {
    void offer( T element ); // Adds the specified element to the end of this queue.
    T poll( ); // Retrieves and removes the head of this queue
    T peek( ); // Retrieves, but does not remove, the head of this queue
    int size( ); // Returns the number of elements currently in the queue.
    boolean isEmpty( ); // Returns true if the queue contains no elements, and false otherwise.
}
