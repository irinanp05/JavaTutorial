package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {
    public String brand;
    public String model;
    public Integer pret;
    public Integer an;
    public Boolean esteDecapotabila;
    public Double greutate;

    @Test
    public void metodaTest(){

        afisareMasina();
        System.out.println("===Exemplu 2===");
        afisareOriceMasina("Alfa", "Romeo", 33500, 2019, true, 78.9);
        afisareOriceMasina("BMW", "X5", 59700, 2024, false, 61.4);

    }

    //Descriem o masinaDouble
    public void afisareMasina(){
        brand = "Mini";
        model = "Cooper";
        pret = 20000;
        an = 2021;
        esteDecapotabila = false;
        greutate = 40.5;

        System.out.println("Brand-ul masinii este: " + brand);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Pretul masinii este: " + pret + " Euro");
        System.out.println( "Anul productiei este: " + an);
        System.out.println("Masina este decapotabila? " + esteDecapotabila);
        System.out.println("Greutatea masinii este: " + greutate + " tone");

    }

    //Descriem orice masina
    public void afisareOriceMasina(String brand, String model, Integer pret, Integer an, Boolean esteDecapotabila, Double greutate){

        System.out.println("Brand-ul masinii este: " + brand);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Pretul masinii este: " + pret + " Euro");
        System.out.println("Anul productiei este: " + an);
        System.out.println("Masina este decapotabila? " + esteDecapotabila);
        System.out.println("Greutatea masinii este: " + greutate + " tone");

    }

}
