package snacks;

import snackssupply.SnackBar;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        SnackBar<Limb> snackBar1 = new SnackBar<>();
        SnackBar<Pez> snackBar2 = new SnackBar<>();
        SnackBar<Smartie> snackBar3 = new SnackBar<>();

        Limb[] limbs = new Limb[5];

        Limb limb1 = new Limb();
        Limb limb2 = new Limb();
        Limb limb3 = new Limb();
        Limb limb4 = new Limb();
        Limb limb5 = new Limb();

        limbs[0] = limb1;
        limbs[1] = limb2;
        limbs[2] = limb3;
        limbs[3] = limb4;
        limbs[4] = limb5;

        Pez[] pezs = new Pez[5];

        Pez pez1 = new Pez();
        Pez pez2 = new Pez();
        Pez pez3 = new Pez();
        Pez pez4 = new Pez();
        Pez pez5 = new Pez();

        pezs[0] = pez1;
        pezs[1] = pez2;
        pezs[2] = pez3;
        pezs[3] = pez4;
        pezs[4] = pez5;

        Smartie[] smarties = new Smartie[5];

        Smartie smartie1 = new Smartie();
        Smartie smartie2 = new Smartie();
        Smartie smartie3 = new Smartie();
        Smartie smartie4 = new Smartie();
        Smartie smartie5 = new Smartie();

        smarties[0] = smartie1;
        smarties[1] = smartie2;
        smarties[2] = smartie3;
        smarties[3] = smartie4;
        smarties[4] = smartie5;


        System.out.println("Usoteret");
        System.out.println("Menneskelegemer: " + Arrays.toString(limbs));
        System.out.println();
        System.out.println("Smarties: " + Arrays.toString(smarties));
        System.out.println();
        System.out.println("Pezs: " + Arrays.toString(pezs));
        System.out.println();

        snackBar1.sortSnacks(limbs);
        snackBar2.sortSnacks(pezs);
        snackBar3.sortSnacks(smarties);

        System.out.println("Sorteret");
        System.out.println("Menneskelegemer: " + snackBar1.getSnacks());
        System.out.println();
        System.out.println("Smarties: " + snackBar3.getSnacks());
        System.out.println();
        System.out.println("Pezs: " + snackBar2.getSnacks());
    }
}
