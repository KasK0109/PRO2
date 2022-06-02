package snacks;

import java.util.Random;

public class Limb extends Snack
{
    private Types type;

    public Limb()
    {
        Random random = new Random();
        Types[] types = Types.values();
        this.type = types[random.nextInt(types.length)];

        if (this.type.equals(Types.Finger)) {
            setWeight(0.2);
        }
        if (this.type.equals(Types.Toe)) {
            setWeight(0.1);
        }
        if (this.type.equals(Types.Heel)) {
            setWeight(0.4);
        }
        if (this.type.equals(Types.Hand)) {
            setWeight(0.5);
        }
        if (this.type.equals(Types.Foot)) {
            setWeight(1.5);
        }
        if (this.type.equals(Types.Knee)) {
            setWeight(1.0);
        }

    }
//    private double weight;

    public Limb(Types type)
    {
        this.type = type;
    }

    public Types getType()
    {
        return type;
    }

    @Override
    public int compareTo(Snack o) {
        Limb limb = (Limb) o;

        return Double.compare(getWeight(), limb.getWeight());
    }

    @Override
    public String toString() {
        return "Limb{" +
                "type=" + type +
                '}';
    }

    public enum Types
    {
        Finger, Foot, Hand, Heel, Knee, Toe
    }
}
