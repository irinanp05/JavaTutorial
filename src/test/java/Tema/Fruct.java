package Tema;

import org.testng.annotations.Test;

public class Fruct {

    public String nume;
    public Float cantitate;
    public Double pret;
    public String taraOrigine;
    public Boolean esteDisponibil;
    public Integer lunaProductiei;

    @Test
    public void metodaTest(){
        afisareFruct();
        System.out.println();
        afisareOriceFruct("Mar", 2.5f, 4.29, "Romania", true, 9);
        System.out.println();
        afisareOriceFruct("Struguri", 0.80f, 18.50, "Italia", false, 10);
        System.out.println();
        afisareOriceFruct("Banana", 5.0f, 8.45, "Ecuador", true, 5);
        System.out.println();
        afisareOriceFruct("Pomelo", 2.4f, 9.79, "Indonezia", false, 6);
        System.out.println();
        afisareOriceFruct("Kumquat", 0.5f, 27.99, "Japonia", true, 7);
        System.out.println();
        afisareOriceFruct("Nopal", 0.3f, 30.90, "America de Sud", false, 7);
        System.out.println();
    }

    //descriem un fruct specific
    public void afisareFruct (){

        nume = "Rodie";
        cantitate = 1.3f;
        pret = 22.99;
        taraOrigine = "Iran";
        esteDisponibil = true;
        lunaProductiei = 4;

        System.out.println("Fructul se numeste: " + nume);
        System.out.println("Cantitatea este: " + cantitate + " kg");
        System.out.println("Pretul este: " + pret + "/kg");
        System.out.println("Tara de origine este: " + taraOrigine);
        System.out.println("Fructul este in stoc? " + esteDisponibil);
        System.out.println("Luna productiei este: " + lunaProductiei + " - 2024");

    }
//descriem orice fruct
    public void afisareOriceFruct(String nume, Float cantitate, Double pret, String taraOrigine, Boolean esteDisponibil, Integer lunaProductiei){

        System.out.println("Fructul se numeste: " + nume);
        System.out.println("Cantitatea este: " + cantitate + " kg");
        System.out.println("Pretul este: " + pret + "/kg");
        System.out.println("Tara de origine este: " + taraOrigine);
        System.out.println("Fructul este in stoc? " + esteDisponibil);
        System.out.println("Luna productiei este: " + lunaProductiei + " - 2024");


    }

}
