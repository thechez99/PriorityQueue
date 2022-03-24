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
        return getHighestPriorityNode().getNodeData().getItem();
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
                tempNode = tempNode.getNextNode();
            }
        }

        return result;
    }

    /* Class Functions */

    public Node getHighestPriorityNode() throws QueueUnderflowException{

        Node temp = headNode;
        Node highPriorityNode = null;

        int highestPriority = -1;

        do{

            int priority = temp.getNodeData().getPriority();
            if(priority > highestPriority){
                highestPriority = priority;
                highPriorityNode = temp;
            }

            temp.setNextNode(temp.getNextNode());

        }while(temp.getNextNode() != null);

        return temp;

    }

    /* Supporting Class Declarations */
    class Node{

        private PriorityItem<T> nodeData;
        private Node nextNode;

        /* Node Constructor */

        public Node(PriorityItem<T> priorityItem){
            this.nodeData = priorityItem;
        }

        /* Node Getter and Setters */

        public PriorityItem<T> getNodeData() {
            return nodeData;
        }

        public void setNodeData(PriorityItem<T> priorityItem){
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