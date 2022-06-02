
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import palindrom.PalindropValidator;

class PalindromValidatorTest
{
    ArrayList<String> palindromer;
    ArrayList<Integer> palindromprimtal;

    @BeforeEach
    void setUp() throws Exception
    {
        palindromer = new ArrayList<String>();

        File palindromTxt = new File("C:\\Users\\kaare\\IdeaProjects\\PRO2\\L28\\test\\test-palindrom.txt");
        Scanner palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromer.add(data);
        }
        palindromScanner.close();

        palindromprimtal = new ArrayList<Integer>();

        palindromTxt = new File("C:\\Users\\kaare\\IdeaProjects\\PRO2\\L28\\test\\test-palindrom-primtal.txt");
        palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromprimtal.add(Integer.parseInt(data));
        }
        palindromScanner.close();
    }

    @Test
    void palindrom_string_test()
    {

        PalindropValidator palindropValidator = new PalindropValidator();
        for (String s : palindromer) {
            System.out.println(palindropValidator.erGyldigtPalindrom(s));
        }

        assertEquals(palindropValidator.getAntalPalindromer(), 10);

    }

    @Test
    void palindrom_tal_test() {

        PalindropValidator palindropValidator = new PalindropValidator();
        for (int t : palindromprimtal) {
            palindropValidator.erGyldigtPalindromPrimtal(t, 2);
        }

        assertEquals(palindropValidator.getAntalPalindromTal(), palindromprimtal.size());

    }
}
