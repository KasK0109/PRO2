package snacks;

import java.util.Collections;

public class Snack implements Comparable<Snack>
{
    private double weight;

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    @Override
    public int compareTo(Snack o) {
        return 0;
    }

}
