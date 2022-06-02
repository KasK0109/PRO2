package snacks;

import java.util.Random;

public class Smartie extends Snack
{
    private Colors color;

    public Smartie()
    {
        Random random = new Random();
        Colors[] colors = Colors.values();
        this.color = colors[random.nextInt(colors.length)];
    }

    public Smartie(Colors color)
    {
        this.color = color;
    }

    public Colors getColor()
    {
        return color;
    }

    @Override
    public int compareTo(Snack o) {
        Smartie smartie = (Smartie) o;

        return this.color.compareTo(smartie.color);
    }

    @Override
    public String toString() {
        return "Smartie{" +
                "color=" + color +
                '}';
    }

    public enum Colors
    {
        Red, Orange, Blue, Green, Yellow, Pink, Violet, Brown
    }
}
