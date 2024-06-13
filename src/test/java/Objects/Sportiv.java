package Objects;

public class Sportiv {
    //OOP = Object Oriented Programming; se bazeaza pe interactiunea cu obiecte
    //Obiect = instanta unei clase; are toate proprietatile clasei respective
    //putem defini un obiect doar daca avem un constructor
    //Constructor = are ca rol sa initializeze atributele unei clase
    //intr-o clasa recunoastem un constructor dupa numele acesteia(clasei)
    //constructorul este, de cele mai multe ori, public; poate fi si privat(pt programare mai avansata:design pattern de programare-3 categorii- de tip creational->singleton)
    //intr-o clasa pot fi mai multi constructori, diferentiati dupa nr. sau tipul de parametri
    //intr-o clasa exista un constructor, by default, fara parametri
    //in momentul definirii unui obiect, se apeleaza constructorul din clasa
    //dintr-o clasa putem defini mai multe obiecte
    //obiectele se diferentiaza prin nume si valorile date
    //un obiect se instanteaza folosind cuvantul 'new'
    //un obiect se poate defini in orice clasa, din orice pachet
    //in momentul cand instantiem un obiect, putem avea acces la toate variabilele/metodele din clasa

    public String nume;
    public String prenume;
    public Integer varsta;
    public Character sex;
    public String tipSport;
    public Boolean sportDeEchipa;
    public Integer salariu; //adaugat ulterior, tebuie actualizate datele -> facem un nou constructor

    //Constructorul : aici am scris manual
  /*  public Sportiv(String nume, String prenume, Integer varsta, Character sex, String tipSport, Boolean sportDeEchipa) {
        this.nume = nume;   //this - keyword care diferentiaza variabila de parametru
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.tipSport = tipSport;
        this.sportDeEchipa = sportDeEchipa;

    }*/

    // aici am facut cu autogenerator: click- dreapta, ,generate, alege constructor, select all
    public Sportiv(Integer varsta, String tipSport, Boolean sportDeEchipa, Character sex, String nume, String prenume) {
        this.varsta = varsta;
        this.tipSport = tipSport;
        this.sportDeEchipa = sportDeEchipa;
        this.sex = sex;
        this.nume = nume;
        this.prenume = prenume;
    }

    public Sportiv(String nume, String prenume, Integer salariu, Character sex, String tipSport, Boolean sportDeEchipa, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.salariu = salariu;
        this.sex = sex;
        this.tipSport = tipSport;
        this.sportDeEchipa = sportDeEchipa;
        this.varsta = varsta;
    }

    public void prezentareSportiv() {
        System.out.println("Numele sportivului este: " + nume);
        System.out.println("Prenumele sportivului este: " + prenume);
        System.out.println("Varsta sportivului este de: " + varsta + " de ani");
        System.out.println("Sexul sportivului este: " + sex);
        System.out.println("Sportivul practica urmatorul sport: " + tipSport);
        System.out.println("Este un sport de echipa?" + sportDeEchipa);
        if(salariu!=null) {
            System.out.println("Salariul sporrtivului este: " + salariu + " lei");
        }
    }

    public void verificareVarsta() {
        if(varsta<18) {
            System.out.println("Sportivul este minor");
        }
        else {
            System.out.println("Sportivul este major");
        }
    }
    public void marireSalariu(Integer procent) {
        if(salariu != null) {
            Integer marire = (salariu + procent)/100;
            salariu = salariu + marire;
            System.out.println("Noul salariu este: " + salariu);
        }
        else {
            System.out.println("Sportivul e nesalariat.");
        }
    }

}
