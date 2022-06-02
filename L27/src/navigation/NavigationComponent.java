package navigation;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class NavigationComponent {

    private ArrayList<NavigationComponent> navigationComponents = new ArrayList<>();

    public void addChild(NavigationComponent navigationComponent)
    {
        navigationComponents.add(navigationComponent);
    }

    public ArrayList<NavigationComponent> getChildren()
    {
        return navigationComponents;
    }

    public String getName()
    {
        return null;
    }

    public String getLink()
    {
        return null;
    }

    public void print()
    {
        if (navigationComponents.size() == 0) {
            System.out.println("[]");
        }

        StringBuilder sb = new StringBuilder("[");
        for (NavigationComponent navigationComponent : this.navigationComponents) {
            sb.append(", ").append(navigationComponent);
        }
        sb.append("]");
        System.out.println(sb);
    }
}
