package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {
    //1 line comment
    /* multi
      line
      comment
     */

    // recunoastem o clasa intr-un fisier Java dupa cuvantul cheie class
    // intr-un fisier java putem avea o multime de clase pe care le diferentiem prin numele lor
    // nu este un bun practice in java sa avem intr-un fisier mai multe clase
    // in fiecare clasa trebuie sa definim un nume
    // intelegem printr-o clasa un sablon specific din viata reala
    // intr-o clasa putem defini variabile si metode
    // variabila = proprietatea unei clase
    // intr-o clasa putem avea o multime de variabile
    // variabilele se diferentiaza prin tip si nume
    // variabilele pot fi de 2 feluri: global si local
    // variabila globala: proprietate vizibila oriunde in cod
    // variabila locala: proprietate vizibila doar in locul definit
    // tipuri de date: String, Char, Integer, Long, Float, Double, Decimal, Boolean, Byte, Short


    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;


    // metoda: actiunea unei clase
    // intr-o clasa putem avea o multime de metode diferentiate prin numele acestora
    // exista 2 tipuri de metode: void si return
    // void: actiune pe care vrem sa o afisam/interpretam fara a fi nevoie sa o returnam
    // pt o metoda trebuie sa specificam un access control (public), () si {}

@Test
    public void metodaTest () {
    descrieCursant();
    primesteBursa();
}

public void primesteBursa(){
    Integer bursa = 1000;

    System.out.println("Bursa cursantului este: " + bursa);
}



public void descrieCursant () {
        nume = "Ionescu";
        prenume = "Ion";
        varsta = 20;
        adresa = "Str. X, nr. 99";
        inaltime = 3.54;
        greutate = 45.64f;
        sex = 'm';
        areRestante = true;
        areRestante = false;

        System.out.println("Numele cursantului este: " + nume + " " + prenume);
        System.out.println("Varsta cursantului este: " + varsta + " de ani");
    System.out.println("Adresa este: " + adresa);
    System.out.println("Inaltimea cursantului este: " + inaltime + " metri");
    System.out.println("Greutatea cursantului este: " + greutate + " kg");
    System.out.println("Sexul tau este: " + sex);
    }
}


