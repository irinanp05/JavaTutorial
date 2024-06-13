package Objects;

import org.testng.annotations.Test;

public class SportivTest {

    @Test
    public void testMethod() {
        //instantiem un obiect de tipul sportiv(adica dupa clasa Sportiv)
        Sportiv Ionut = new Sportiv(17, "Baschet", true, 'M', "Popescu", "Ionut");
        Ionut.prezentareSportiv();
        Ionut.verificareVarsta();
        System.out.println("================================");
        Ionut.varsta=18;
        Ionut.prezentareSportiv();
        Ionut.verificareVarsta();
        Ionut.marireSalariu(0);

        System.out.println("================================");

        Sportiv Maria = new Sportiv(30, "Tenis", false, 'F', "Draga", "Maria");
        Maria.prezentareSportiv();
        Maria.verificareVarsta();
        Maria.marireSalariu(50);

        System.out.println("================================");
        Sportiv Flavius = new Sportiv("Maries", "Flavius", 6000, 'M', "Fotbal", true, 24);
        Flavius.prezentareSportiv();
        Flavius.verificareVarsta();
        Flavius.marireSalariu(15);
    }

}
