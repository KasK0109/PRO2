package train;

import java.util.NoSuchElementException;

public class LinkedListTrain
{
    private WagonNode firstWagon;

    /**
     * Constructs an empty linked list train.
     */
    public LinkedListTrain()
    {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     * 
     * @return the first wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst()
    {
        if (this.firstWagon == null)
        {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     * 
     * @param wagon the wagon node to add
     */
    public void addFirst(WagonNode wagon)
    {
        // TODO: Assignment 1: Implement this add method...

        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @return the removed wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode removeFirst()
    {
        // TODO: Assignment 2: Implement this remove method...

        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     * 
     * @return the number of wagon nodes
     */
    public int count()
    {
        // TODO: Assignment 3: Implement this count method...

        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     *         <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon)
    {
        // TODO: Assignment 4: Implement this remove method...

        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     * 
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */
    public void insertAt(WagonNode wagon, int position)
    {
        // TODO: Assignment 5: Implement this insert method...

        throw new UnsupportedOperationException("Not implemented");
    }
}
