package palindrom;

import java.util.HashSet;

public class PalindromGenerator implements PalindromGeneratorI{

    HashSet<String> palindromDatoer = new HashSet<>();

    @Override
    public HashSet<String> udledDanskePalindromdatoer(String dato) {

        String datoKopi;

        if (dato.length() == 0) {
            palindromDatoer.add(dato);
            return null;
        } else {
            datoKopi = dato;
        }


        if (datoKopi.charAt(0) == datoKopi.charAt(datoKopi.length() - 1)) {
            return udledDanskePalindromdatoer(datoKopi.substring(1, datoKopi.length() - 1));
        }

        return null;
    }

    public HashSet<String> getPalindromDatoer() {
        return palindromDatoer;
    }

}
