package queuemanager;

/* Using many constructs from the SortedArrayPriorityQueue
 * as a template while figuring how this class will work
 * */

public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {

    /* Class Variables */

    //Data storage
    private final Object[] storage;

    //Size of array
    private final int capactiy;

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

        tailIndex++;
        if (tailIndex >= capactiy){
            tailIndex--;
            throw new QueueOverflowException();
        } else{
            storage[tailIndex] = new PriorityItem<>(item, priority);
        }

    }

    /* Function that returns the highest priority item in the queue */
    @Override
    public T head() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException();
        } else{

            int highestPriority = -1;
            int pos = -1;

            for (int i = 0; i < capactiy+1; i++){
                if(((PriorityItem) storage[i]).getPriority() > highestPriority){
                    highestPriority = ((PriorityItem) storage[i]).getPriority();
                    pos = i;
                }
            }

            return ((PriorityItem<T>) storage[pos]).getItem();
        }
    }

    @Override
    public void remove() throws QueueUnderflowException {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
