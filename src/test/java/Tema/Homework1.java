package Tema;

import org.testng.annotations.Test;

public class Homework1 {

    /*Creem doua noi clasa cu numele "Homework1" si "HomeworkTest"
Afiseaza pe ecran urmatoarele:
PENTRU FIECARE LINIE SE DECLARA VARIABILE NOI

1. Hello World
2. Varsta ta (numar)
3. Numele si prenumele pe 2 randuri
4. Adauga la "Salut" caracterul "M" la final
5. Adauga la "Hello" caracterul "H" la inceput
6. Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"
7. Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"
8. Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;
9. Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"
10. Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;


! BONUS !
Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3 ?
  Rezultatul corect este: {rezultatul}
    */

    String helloWorld = "Hello World";
    Integer varsta;
    String nume;
    String prenume;
    String salut = "Salut";
    String hello = "Hello";
    Character m = 'M';
    Character h = 'H';
    Character z = 'Z';
    String propozitie = " Poti pleca acasa dupa ce iti verific munca";
    Integer salariuAngajat;
    String prenumeAngajat;
    Integer idAngajat;
    String numeAngajat;
    Integer numarDepartament;


    @Test
    public void testMethod(){
        afisamHelloWorld();
        detaliiDespreMine();
        afisamSalut();
        afisamHello();
        afisamPropozitieCuZ();
        afisamSalariuAngajat();
        afisamIdDepartament();
        afisamDepartamentMaiMare(546);
        afisamRezultatEcuatie();
    }

public void afisamHelloWorld(){
    System.out.println(helloWorld);
    System.out.println(propozitie);
}

public void detaliiDespreMine(){
        varsta = 27;
        nume = "Pricop";
        prenume = "Irina";
    System.out.println("Numele meu este " + nume + " " + prenume + " si am varsta de " + varsta + " ani");
    System.out.println(propozitie);
}

public void afisamSalut(){
    System.out.println(salut + m);
    System.out.println(propozitie);
}

public void afisamHello(){
    System.out.println(h + hello);
    System.out.println(propozitie);
}

public void afisamPropozitieCuZ(){
    System.out.println("Ana" + z + " are" + z + " mere" + z + ", pere" + z + ", prune" + z);
    System.out.println(propozitie);
}

public void afisamSalariuAngajat (){
        salariuAngajat = 7500;
        prenumeAngajat = "Andrei";
        if (prenumeAngajat.equals("Andrei")){
            System.out.println("Salariul lui Andrei este: " + salariuAngajat + " lei.");
        }

}

public void afisamIdDepartament (){
        idAngajat = 45125;
        numarDepartament = 452;
        numeAngajat = "Popescu";
        if (numeAngajat.equals("Popescu")){
            System.out.println("Angajatul Popescu are ID-ul: " + idAngajat + " si lucreaza in departamentul cu nr. " + numarDepartament);
        }
}

public void afisamDepartamentMaiMare(Integer departament){
        if (departament>287){
            System.out.println("Numarul departamentului este: " + departament);
        }
}

public void afisamRezultatEcuatie(){
     double a = 3;
     a = a*4;
     a = a+2;
     a = a-3;
     a = a/3;
    System.out.println("Rezultatul ecuatiei {[2+(3*4)-3]/3} este: " + a);
}

}
