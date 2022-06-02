package queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI
{
    private Node head;
    private Node tail;
    /**
     * Constructs an empty queue.
     */
    public NodeQueue()
    {
        // TODO: Assignment 1: Implement this constructor...
        this.head = null;
        this.tail = null;
    }

    @Override
    public void enqueue(Object element)
    {
        // TODO: Assignment 1: Implement this method...
        Node newNode = new Node();
        newNode.data = element;

        if (this.tail == null) {
            this.head = this.tail = newNode;
            return;
        }

        this.tail.next = newNode;
        this.tail = newNode;

    }

    @Override
    public Object dequeue()
    {
        // TODO: Assignment 1: Implement this method...

        if (this.head == null) {
            throw new NoSuchElementException();
        }

        Node tempNode = this.head;
        this.head = this.head.next;

        if (this.head == null) {
            this.tail = null;
        }

        return tempNode.data;
    }

    @Override
    public int size()
    {
        // TODO: Assignment 1: Implement this method...'
        int size = 0;
        Node tempNode = head;
        while(tempNode != null) {
            size++;
            tempNode = tempNode.next;
        }
        return size;

    }

    @Override
    public boolean isEmpty()
    {
        // TODO: Assignment 1: Implement this method...

        return head == null;

    }

    class Node {
        public Object data;
        public Node next;
    }
}
