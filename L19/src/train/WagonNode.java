package train;

public class WagonNode
{
    private String wagonName;

    private WagonNode nextWagon;
    private WagonNode previousWagon;

    public WagonNode(String wagonName)
    {
        this.wagonName = wagonName;
    }

    public String getWagonName()
    {
        return wagonName;
    }

    public WagonNode getNextWagon()
    {
        return nextWagon;
    }

    public void setNextWagon(WagonNode nextWagon)
    {
        this.nextWagon = nextWagon;
    }

    // ----------------------------------------------------------------------
    // Assignment 6 (ignore these code lines in all prior assignments...)
    // ----------------------------------------------------------------------

    @Override
    public String toString()
    {
        return this.wagonName;
    }

    public WagonNode getPreviousWagon()
    {
        return previousWagon;
    }

    public void setPreviousWagon(WagonNode previousWagon)
    {
        this.previousWagon = previousWagon;
    }
}
