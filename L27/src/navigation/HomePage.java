package navigation;

public class HomePage
{
    private NavigationComponent root;

    public HomePage(NavigationComponent root)
    {
        this.root = root;
    }

    public void print()
    {
        root.print();
    }
}
