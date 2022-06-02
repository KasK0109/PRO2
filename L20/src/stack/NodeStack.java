package stack;

import java.util.NoSuchElementException;

public class NodeStack implements StackI{

    private Node first;

    @Override
    public void push(Object element) {

        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
    }

    @Override
    public Object pop() {
        if( first == null) {
            throw new NoSuchElementException();
        }
        Object element = first.data;
        first = first.next;
        return element;
    }

    @Override
    public Object peek() {

        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;

    }

    @Override
    public int size() {
        int size = 0;
        Node tempNode = first;
        while(tempNode != null) {
            size++;
            tempNode = tempNode.getNext();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    class Node  {
        public Object data;
        public Node next;

        public Node getNext() {
            return next;
        }
    }


}
