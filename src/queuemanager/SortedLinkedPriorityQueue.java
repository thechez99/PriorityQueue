package queuemanager;

public class SortedLinkedPriorityQueue<T> implements PriorityQueue<T> {

    /* Class Variables */

    private Node headNode;

    /* CLass Constructor(s) */

    public SortedLinkedPriorityQueue(){
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
        return headNode.getNextNode() != null;
    }

    @Override
    public String toString(){

        String result = "[";

        if(isEmpty()){
            result += " Queue is empty ]";
        } else{
            Node tempNode = headNode;

            while(tempNode.getNextNode() != null){
                result += tempNode.getNodeData().toString() + "], ";
            }
        }

        return result;
    }

    /* Class Functions */

    /* Supporting Class Declarations */
    class Node{

        private T nodeData;
        private Node nextNode;

        /* Node Constructor */

        public Node(T priorityItem){
            this.nodeData = priorityItem;
        }

        /* Node Getter and Setters */

        public T getNodeData() {
            return nodeData;
        }

        public void setNodeData(T priorityItem){
            this.nodeData = priorityItem;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }

    }

}

/* CODE REFERENCES
 * Dixit, R. (2017) Introduction to Data Structures & Algorithms in Java [online]. LinkedIn Learning. Available at <https://www.linkedin.com/learning/introduction-to-data-structures-algorithms-in-java/what-is-a-linked-list?autoplay=true&resume=false&u=2102796> [24 March 2022]
 */