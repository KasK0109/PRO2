package snackssupply;

import snacks.Snack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SnackBar<T extends Snack>
{
    ArrayList<T> snacks = new ArrayList<>();

    public void sortSnacks(T[] snackContainer) {
        snacks.addAll(Arrays.asList(snackContainer));

        Collections.sort(snacks);
    }


    public ArrayList<T> getSnacks() {
        return snacks;
    }
}
