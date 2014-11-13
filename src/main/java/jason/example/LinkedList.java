package jason.example;

import jason.example.dataobject.LinkedListNode;

public class LinkedList {
    private LinkedListNode head;
    private int size;

    public LinkedList() {
        head = new LinkedListNode(null);
        size = 0;
    }

    public void add(Object incoming) {
        LinkedListNode temp = new LinkedListNode(incoming);
        LinkedListNode current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(temp);
        size++;
    }

    public Object get() {
        LinkedListNode current = head.getNext();
        while (current.getNext() != null) {
            current = current.getNext();
        }

        return current.getData();
    }

    public Object get(int index) {
        if (index <= 0) {
            return null;
        }

        LinkedListNode current = head.getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) {
                return null;
            }

            current = current.getNext();
        }

        return current.getData();
    }

    public boolean remove(int index) {
        if (index <= 0) {
            return false;
        }

        LinkedListNode current = head;

        for (int i = 1; i <= index; i++) {
            if (current.getNext() == null) {
                return false;
            }

            current = current.getNext();
        }

        current.setNext(current.getNext().getNext());
        size--;

        return true;
    }

    public boolean remove() {

        LinkedListNode current = head;
        if (current.getNext() == null) {
            return false;
        }

        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }

        current.setNext(null);
        size--;

        return true;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();

        LinkedListNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
            if (current.getData() != null) {
                buf.append(current.getData().toString());
                buf.append(" ");
            }
        }

        return buf.toString();
    }

    public static void main(String[] args) {
        LinkedList jll = new LinkedList();

        jll.add(1);
        jll.add(2);
        jll.add(3);
        printOut(jll);

        boolean removed = jll.remove();
        if (removed) {
            printOut(jll);
        }

        jll.add(4);
        printOut(jll);

    }

    public static void printOut(LinkedList list) {
        if (list != null) {
            System.out.println("Size=" + list.getSize() + " Elements=" + list.toString());
        }
    }
}
