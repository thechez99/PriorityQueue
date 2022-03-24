package queuemanager;

public class SortedLinkedPriorityQueue<T> implements PriorityQueue<T> {

    /* Class Variables */

    private final Object[] storage;

    private final int cap;

    private int tailIndex;

    /* CLass Constructor(s) */

    public SortedLinkedPriorityQueue(int size){
        storage = new Object[size];
        cap = size;
        tailIndex = -1;
    }

    /* Class Override Function(s) */

    @Override
    public void add(T item, int priority) throws QueueOverflowException {


    }

    @Override
    public T head() throws QueueUnderflowException {
        return null;
    }

    @Override
    public void remove() throws QueueUnderflowException {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    /* Class Functions */

}

/* CODE REFERENCES
*
*
*
* */