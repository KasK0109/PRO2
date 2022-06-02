package palindrom;

public class PalindropValidator implements PalindromValidatorI{

    int antalPalindromer = 0;
    int antalPalindromTal = 0;

    @Override
    public boolean erGyldigtPalindrom(String tekst) {
        tekst = tekst.toLowerCase();
        tekst = tekst.replace(" ", "");
        tekst = tekst.replace("?", "");
        tekst = tekst.replace(",","");
        tekst = tekst.replace(":", "");
        tekst = tekst.replace("(", "");
        tekst = tekst.replace(")", "");
        tekst = tekst.replace("!", "");
        tekst = tekst.replace("3", "");
        tekst = tekst.replace("1", "");
        tekst = tekst.replace("4", "");
        tekst = tekst.replace("-", "");
        tekst = tekst.trim();

        if (tekst.length() == 0 || tekst.length() == 1) {
            System.out.println(tekst);
            antalPalindromer++;
            return true;
        }

        if (tekst.charAt(0) == tekst.charAt(tekst.length() - 1)) {
            return erGyldigtPalindrom(tekst.substring(1, tekst.length() - 1));
        }


        return false;
    }

    @Override
    public boolean erGyldigtPalindromPrimtal(int tal, int taeller) {

        if (tal <= 2) {
            antalPalindromTal++;
            return tal == 2;
        }
        if (tal % taeller == 0) {
            return false;
        }
        if (taeller * taeller > tal) {
            antalPalindromTal++;
            return true;
        }

        return erGyldigtPalindromPrimtal(tal, taeller + 1);


    }

    public int getAntalPalindromer() {
        return antalPalindromer;
    }

    public int getAntalPalindromTal() {
        return antalPalindromTal;
    }
}
