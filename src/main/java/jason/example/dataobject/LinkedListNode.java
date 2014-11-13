package jason.example.dataobject;

public class LinkedListNode {

    private LinkedListNode next;
    private Object data;

    public LinkedListNode(Object incomingData) {
        this.next = null;
        this.data = incomingData;
    }

    public LinkedListNode(LinkedListNode incomingNode, Object incomingData) {
        this.next = incomingNode;
        this.data = incomingData;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode node) {
        this.next = node;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
