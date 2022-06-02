

import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import palindrom.PalindromGenerator;

class PalindromGeneratorTest
{
    ArrayList<String> palindromdatoer;
    List<LocalDate> datoer = getDates(LocalDate.of(2002, 2,1), LocalDate.of(2021,3,1));

    public static List<LocalDate> getDates(LocalDate startDate, LocalDate endDate) {
        return startDate.datesUntil(endDate).collect(Collectors.toList());
    }

    @BeforeEach
    void setUp() throws Exception
    {
        palindromdatoer = new ArrayList<String>();

        File palindromTxt = new File("C:\\Users\\kaare\\IdeaProjects\\PRO2\\L28\\test\\test-palindrom-datoer.txt");
        Scanner palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromdatoer.add(data);
        }
        palindromScanner.close();
    }

    @Test
    void palindrom_dates_test()
    {
        PalindromGenerator palindromGenerator = new PalindromGenerator();
        String dato;
        for (LocalDate date : datoer) {
            dato = date.format(DateTimeFormatter.ofPattern("ddMMyyyy"));
            palindromGenerator.udledDanskePalindromdatoer(dato);
        }

        System.out.println(palindromGenerator.getPalindromDatoer());
    }

}
