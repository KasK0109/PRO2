package deque;

import java.util.NoSuchElementException;

public class CircularArrayDeque implements DequeI{

    private Object[] elements;
    private int currentSize;
    private int head;
    private int tail;

    public CircularArrayDeque() {
        final int INITIAL_SIZE = 10;
        elements = new Object[INITIAL_SIZE];
        currentSize = 0;
        head = 0;
        tail = 0;
    }

    @Override
    public void addFirst(Object element) {
        growIfNecessary();
        if (currentSize == 0) {
            elements[0] = element;
            head = 0;
            tail = 1;
        } else {
            if (head != 0) {
                elements[head - 1] = element;
            } else {
                head = elements.length;
                elements[head - 1] = element;
            }
            head = (head - 1);
        }
        currentSize++;
    }

    @Override
    public void addLast(Object element) {
        growIfNecessary();
        currentSize++;
        if (currentSize == 0) {
            elements[0] = element;
            head = 0;
            tail = 1;
        } else {
            elements[tail] = element;
            tail = (tail + 1) % elements.length;
        }
    }

    @Override
    public Object removeFirst() {
        if (currentSize == 0) {
            throw new NoSuchElementException();
        }
        Object removed = elements[head];
        head = (head + 1) % elements.length;
        currentSize--;
        return removed;
    }

    @Override
    public Object removeLast() {

        if (currentSize == 0) {
            throw new NoSuchElementException();
        }

        Object removed;
        if (currentSize == 1) {
            removed = elements[head];
            head = -1;
            tail = 0;
        } else if (tail == 0) {
            tail = elements.length - 1;
            removed = elements[tail];
        } else {
            tail = (tail - 1) % elements.length;
            removed = elements[tail];
        }
        currentSize--;
        return removed;
    }

    @Override
    public Object getFirst() {
        if (currentSize == 0) {
            throw new NoSuchElementException();
        }
        return elements[head];
    }

    @Override
    public Object getLast() {
        if (currentSize == 0) {
            throw new NoSuchElementException();
        }
        Object last;
        if (tail == 0) {
            last = elements[elements.length - 1];
        } else {
            last = elements[tail - 1];
        }
        return last;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    private void growIfNecessary() {
        if (currentSize == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[(head + 1) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = currentSize;
        }
    }
}
