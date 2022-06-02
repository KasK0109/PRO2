package train;

import java.util.NoSuchElementException;

public class LinkedListTrain2 extends LinkedListTrain
{
    private WagonNode lastWagon;

    /**
     * Constructs an empty double linked list train.
     */
    public LinkedListTrain2()
    {
        super();
        this.lastWagon = null;
    }

    /**
     * Returns the last wagon node in the double linked list train.
     * 
     * @return the last wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getLast()
    {
        if (this.lastWagon == null)
        {
            throw new NoSuchElementException();
        }
        return this.lastWagon;
    }

    /**
     * Adds a wagon node to the end of the double linked list train.
     * 
     * @param wagon the wagon node to add
     */
    public void addLast(WagonNode wagon)
    {
        // TODO: Assignment 6: Implement this add method...

        throw new UnsupportedOperationException("Not implemented");
    }
}
