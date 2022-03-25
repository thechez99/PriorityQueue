package queuemanager;

public class SortedLinkedPriorityQueue<T> implements PriorityQueue<T> {

    /* Class Variables */

    private Node headNode;
    private int size;

    /* CLass Constructor(s) */

    public SortedLinkedPriorityQueue(){
        this.headNode = null;
        this.size = 0;
    }

    /* Class Override Function(s) */

    @Override
    public void add(T item, int priority) throws QueueOverflowException {

        PriorityItem<T> priorityItem = new PriorityItem<T>(item, priority);

        Node node = new Node(priorityItem);
        if(isEmpty()){
            headNode = node;
        } else {
            Node currentNode = headNode;
            while(currentNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = node;
        }

        size++;
        sort();
    }

    @Override
    public T head() throws QueueUnderflowException {
        return headNode.getNodeData().getItem();
    }

    @Override
    public void remove() throws QueueUnderflowException {

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString(){

        String result = "[";

        if(isEmpty()){
            result += " Queue is empty ]";
        } else{
            Node tempNode = headNode;

            while(tempNode != null){
                result += tempNode.getNodeData().toString() + "], ";
                tempNode = tempNode.nextNode;
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

    public void sort(){
        if (size > 1){
            for(int i = 0; i < size - 1; i++){
                Node currentNode = headNode;
                Node next = headNode.nextNode;
                for (int j = 0; j < size - 1; j++){
                    if(currentNode.getNodeData().getPriority() > next.getNodeData().getPriority()){
                        Node temp = currentNode;
                        currentNode = next;
                        next = temp;
                    }
                    currentNode = next;
                    next = next.nextNode;
                }
            }
        }
    }

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
 *
 */