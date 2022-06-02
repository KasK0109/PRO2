package snackssupply;

import snacks.Snack;

public class SnackFactory<T extends Snack>
{

    public void getNewSnacks(T[] snackContainer) {

        for (int i = 0; i < snackContainer.length; i++) {

            try {
                Class objectArrayClass = snackContainer.getClass();
                Class objectType = objectArrayClass.getComponentType();
                T newInstance = (T) objectType.getDeclaredConstructor().newInstance();
                snackContainer[i] = newInstance;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
