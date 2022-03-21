package queuemanager;

/* Using many constructs from the SortedArrayPriorityQueue
 * as a template while figuring how this class will work
 * */

public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {

    /* Class Variables */

    //Data storage
    private Object[] storage;

    //Size of array
    private int capactiy;

    //Index location of the last object in queue
    private int tailIndex;


    /* Class Constructor */
    public UnsortedArrayPriorityQueue(int size){
        storage = new Object[size];
        capactiy = size;
        tailIndex = -1;
    }

    /* Class Functions
     * Overridden functions from interface PriorityQueue  */

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
}
