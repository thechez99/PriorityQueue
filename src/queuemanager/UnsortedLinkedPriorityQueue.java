package queuemanager;

public class UnsortedLinkedPriorityQueue<T> implements PriorityQueue<T> {

    /* Class Variables */

    private Node headNode;

    /* Class Constructor(s) */

    public UnsortedLinkedPriorityQueue(){
        this.headNode = new Node();
    }

    /* Class Override Function(s) */

    @Override
    public void add(T item, int priority) throws QueueOverflowException {

        PriorityItem<T> priorityItem = new PriorityItem<T>(item, priority);

        Node newNode = new Node(priorityItem);
        newNode.setNextNode(this.headNode);
        this.headNode = newNode;
    }

    @Override
    public T head() throws QueueUnderflowException {
        if(isEmpty())
            throw new QueueUnderflowException();
        else
            return headNode.getNodeData().getItem();
    }

    @Override
    public void remove() throws QueueUnderflowException {
        if(isEmpty())
            throw new QueueUnderflowException();
        else{
            Node previous = null;
            Node current = headNode;
            Node temp = current;

            while(current.nextNode != null){
                previous = current;
                current = current.nextNode;
            }

            previous.nextNode = null;

            headNode.setNextNode(headNode.getNextNode());
        }

    }

    @Override
    public boolean isEmpty() {
        return headNode.getNextNode() == null;
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

    /* Class Function(s) */

    /* Supporting Class Declarations */
    class Node{

        private PriorityItem<T> nodeData;
        private Node nextNode;

        /* Node Constructor */

        public Node(PriorityItem<T> priorityItem){
            this.nodeData = priorityItem;
        }

        public Node(){
            this.setNextNode(null);
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
