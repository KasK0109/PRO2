package stack;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack implements StackI{

    ArrayList<Object> arrayListStack = new ArrayList<>();

    @Override
    public void push(Object element) {

        arrayListStack.add(element);
    }

    @Override
    public Object pop() {

        int end = arrayListStack.size() - 1;

        if (end == -1) {
            throw new NoSuchElementException();
        }

        Object element = arrayListStack.get(end);
        arrayListStack.remove(end);
        return element;
    }

    @Override
    public Object peek() {
        if (arrayListStack.size() == 0) {
            throw new NoSuchElementException();
        }
        return arrayListStack.get(size() - 1);
    }

    @Override
    public int size() {
        return arrayListStack.size();
    }

    @Override
    public boolean isEmpty() {
        return arrayListStack.size() == 0;
    }
}
