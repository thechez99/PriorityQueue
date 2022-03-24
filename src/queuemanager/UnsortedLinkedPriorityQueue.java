package queuemanager;

public class UnsortedLinkedPriorityQueue<T> implements PriorityQueue<T> {

    /* Class Variables */

    private Node headNode;

    /* Class Constructor(s) */

    public UnsortedLinkedPriorityQueue(){

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

    /* Class Function(s) */

    /* Supporting Class Declarations */
    class Node{

        private PriorityItem<T> nodeData;
        private int nextNode;

        /* Node Constructor */

        public Node(PriorityItem<T> priorityItem){
            this.nodeData = priorityItem;
        }

        /* Node Getter and Setters */

        public PriorityItem<T> getNodeData() {
            return nodeData;
        }

        public void setNodeData(PriorityItem<T> pI){
            this.nodeData = pI;
        }

        public int getNextNode() {
            return nextNode;
        }

        public void setNextNode(int nextNode){
            this.nextNode = nextNode;
        }

    }

}


/* CODE REFERENCES
* Dixit, R. (2017) Introduction to Data Structures & Algorithms in Java [online]. LinkedIn Learning. Available at <https://www.linkedin.com/learning/introduction-to-data-structures-algorithms-in-java/what-is-a-linked-list?autoplay=true&resume=false&u=2102796> [24 March 2022]
*/
