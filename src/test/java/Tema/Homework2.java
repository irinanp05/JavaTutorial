package Tema;
import org.testng.annotations.Test;

import java.awt.geom.Arc2D;

public class Homework2 {
/*
Facem 2 noi clase: Homework2 si Homework2Test

Rezolvam urmatoarele cerinte:
1. Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
2. Afisam in consola primele 3 numere de la 1 la 3;
3. Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");
6. Afisam in consola doar numerele pare pana la 10 (utilizam "for");
7. Afisam in consola numerele divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
8. Afisam in consola primele 3 numere dibizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
9. Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;
10. Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;
11. Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;
*/
    @Test
    public void testMethod (){
        afisareCuvant();
        System.out.println();
        primele3Nr();
        celMaiMareNr();
        celMaiMicNr();
        nrPare();
        System.out.println("----------------");
        doarNrPare();
        nrDivCu5(5);
        primele3NrDivCu5();
        suma2Nr();
        sumaPrimele10Nr();
        produsNrPanaLa5();
    }
//1.afisam de 5 ori cuvantul "DA" pe acelasi rand, cu un spatiu intre
    public void afisareCuvant(){

        for (int i=0; i<6;i++){

            System.out.print("DA ");

        }
    }

//2.afisam primele 3 numere de la 1 la 3
    public void primele3Nr(){
        for (int index=1; index<=3;index++)
            System.out.println(index);


    }

//3.afisam nr cel mai mare dintre 15 si 20
    public void celMaiMareNr (){

        Integer a = 15;
        Integer b = 20;
        if (a>b){
            System.out.println(a + " este mai mare");
        }
        else{
            System.out.println(b + " este mai mare");
        }
        /*
        Integer c = Math.max(a,b);
        System.out.println("Cel mai mare nr. dintre 15 si 20 este " + c);
        */

    }

//4.afisam cel mai mic nr dintre 4.5 si 3.25
    public void celMaiMicNr (){

        Double x = 4.5;
        Double y = 3.25;
        if(x<y){
            System.out.println(x + " este mai mic");
        }
        else{
            System.out.println(y + " este mai mic");
        }
        /*
        Double z = Math.min(x,y);
        System.out.println("Cel mai mic nr. dintre 4.5 si 3.25 este " + z);
         */

        }

//5.afisam nr pare/impare pana la 10 cu metoda for
    public void nrPare(){
        for (int index=0; index<=10; index++){
            if (index %2==0){
                System.out.println("NR. " + index + " este par");
            }
            if (index %2==1){
                System.out.println("NR. " + index + " este impar");
            }
        }
    }

//6.afisam doar nr pare de la 1 la 10 cu metoda for
    public void doarNrPare(){

       /* for (int index=0; index<=10;index+=2){
            System.out.println("Nr. " + index + " este par");
        }*/
        for ( int index=0; index<=10; index++){
            if (index %2==0){
                System.out.println("Nr. " + index + " este par");
            }
        }

    }

//7.afisam nr divizibile cu 5
    public void nrDivCu5 (Integer index){
        if (index %5==0){
            System.out.println("Nr. " + index + " este divizibil cu 5");
        }
    }

//8.afisam primele 3 nr divizibile cu 5
    public void primele3NrDivCu5 (){
        for (int index=0; index<15; index++){
            if (index %5==0){
                System.out.println("Nr. " + index + " este divizibil cu 5");
            }
        }
    }

//9.afisam suma dintre 235 si 10; declaram valori locale
    public void suma2Nr (){
        Integer x = 235;
        Integer y = 10;
        Integer z = x + y;
        System.out.println("Suma dintre 235 si 10 este " + z);
    }

//10.afisam suma primelor 10 numere (int suma=0); declaram valori locale
    public void sumaPrimele10Nr (){
        int suma = 0;
        for ( int index=0; index<=10; index++){
            suma = suma + index;
        }
        System.out.println(suma);
    }

//11.afisam produsul nr pana la 5; declaram variabile locale
    public void produsNrPanaLa5 (){
        int produs = 1;
        for (int index=1; index<=5; index++){
            produs = produs * index;
        }
        System.out.println(produs);
    }

}
