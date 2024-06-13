package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //str repetitive = for, while, for each, (do... while -> daca vrem sa se execute codul macara o data, mereu)
    @Test
    public void testMethod (){
        afisareNrFor();
        afisareNrWhile();
        numerePare();


    }

    //afisam numerele intregi pana la 15 (atentie, se porneste de la 0, nu de la 1)
    public void afisareNrFor (){

        for (Integer index=0; index<=15; index++){
            System.out.println(index);
        }

    }

    public void afisareNrWhile () {
        Integer index = 0;
        while (index <= 15) {
            System.out.println(index);
            index++; //daca uiti sa scrii asta, iti da un infinite loop cu 0; se intampla si la for, dar esti mai predispus sa uiti sa scrii conditia asta aici
        }
    }

    // afisam nr pare de la 0 la 20
    public void numerePare (){

        for (Integer index=0; index<=20; index++){

            if (index %2==0){
                System.out.println("NR. " + index + " este par");
            }
           if (index %2==1){
               System.out.println("NR. " + index + " este impar"); // sau  else {}, dar asa ti le ia in ordine pe fiecare
           }
        }

    }
}
