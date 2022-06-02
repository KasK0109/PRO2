package navigation;

import java.util.ArrayList;
import java.util.List;

public class NavigationMenu extends NavigationComponent
{
    private String name;
    private List<NavigationComponent> navigationComponentList = new ArrayList<>();

    public NavigationMenu(String name)
    {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Menu: "+ getName());
        for (NavigationComponent n : getChildren()) {
            n.print();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
