package stack;

import java.util.Arrays;

public class DropOutStack implements DropOutStackI{

    private final int DEFUALT_CAPACITY = 5;

    private int index;
    private int count;

    private Object[] stack;

    public DropOutStack() {
        index = count = 0;
        stack = new Object[DEFUALT_CAPACITY];
    }

    public DropOutStack(int initialCapacity) {
        index = count = 0;
        stack = new Object[initialCapacity];
    }

    @Override
    public void push(Object element) {

        index = index % stack.length;
        stack[index] = element;
        index++;
        if (count != stack.length)
            count++;

    }

    @Override
    public Object pop() {

        Object element = stack[count];
        stack[count] = null;
        count--;
        return element;
    }

    @Override
    public Object peek() {
        return stack[(index + stack.length - 1) % stack.length];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return stack.length == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}
