package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative: if...then...else; switch...case

    @Test
    public void metodaTest (){

        verificNrMaiMare();
        verificNrMaiMareV2(11);
        verificNrMaiMareV2(9);
        nrPar(5);
        nrPar(6);
        nrPar(0);
        nrPar(-4);
        nrPar(-1);
        zileleSaptamanii(8);

    }

    //verificam daca un nr e > 10
    public void verificNrMaiMare (){

        if (15>10){
            System.out.println("Nr. 15 e mai mare decat 10");
        }
        else {
            System.out.println("Nr 15 e mai mic decat 10");
        }

    }

//verificam daca un nr e > 10 - V 2
    public void  verificNrMaiMareV2 (Integer nr){

        if (nr>10){
            System.out.println("Nr. " + nr + " e mai mare decat 10");
        }
        else {
            System.out.println("Nr. " + nr + " e mai mic decat 10");
        }

    }

    //verificam daca un nr e par si pozitiv
    public void nrPar (Integer numar) {

        if (numar % 2 == 0 && numar > 0) {
            System.out.println("Nr. " + numar + " este par si pozitiv");
        } else if (numar % 2 == 0 && numar < 0) {
            System.out.println("Nr. " + numar + " este par si negativ");
        } else if (numar % 2 == 1 && numar > 0) {
            System.out.println("Nr. " + numar + " este impar si pozitiv");
        } else if (numar == 0) {
            System.out.println("Nr. este zero");
        } else {
            System.out.println("Nr. " + numar + " este impar si negativ");
        }

    }

    //definim zilele saptamanii
    public void zileleSaptamanii(Integer zi){

        switch (zi){

            case 1:
                System.out.println("Astazi este luni");
                break;
            case 2:
                System.out.println("Astazi este marti");
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;
            case 6:
                System.out.println("Astazi este sambata");
                break;
            case 7:
                System.out.println("Astazi este duminica");
                break;
            default:
                System.out.println("Nu mai sunt zile");

        }

    }

}
