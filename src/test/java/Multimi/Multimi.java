package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {
    // multimi = array, list(arraylist), map, <<set>>

    @Test
    public void testMethod(){
        afisareColegiArray();
        System.out.println("--------------------------------");
        afisareColegiArrayList();
        System.out.println("--------------------------------");
        obiecteMap();
        System.out.println("--------------------------------");
        tariOrase();
    }

//afisam numele colegilor de la curs
    public void afisareColegiArray(){
        String[] colegi = new String[6];
        colegi[0] = "Larisa";
        colegi[1] = "Robert";
        colegi[2] = "Daniel";
        colegi[3] = "Vlad";
        colegi[4] = "Corina";
        colegi[5] = "Alex";

        for (Integer index=0; index<colegi.length; index++){
            System.out.println("Numele cursantului este: " + colegi[index]);
        }
    }

//afisam numele colegilor de la curs cu arraylist
    public void afisareColegiArrayList (){
        List<String> colegi = new ArrayList<>();
        colegi.add("Larisa");
        colegi.add("Robert");
        colegi.add("Daniel");
        colegi.add("Vlad");
        colegi.add("Corina");
        colegi.add("Alex");

        for (Integer index=0; index<colegi.size(); index++){
            System.out.println("Numele cursantului este: " + colegi.get(index));
        }
    }
/*
public void proba(){
    List<int> numere = new ArrayList<>();    int e primitiva, Integer e wrapper class/object pt primitive => cu int nu merge, iti trebuie Integer; lista nu poate primi primitive
    }

public void proba (){
    int[] numere = new int[5];         aici accepta int
    }
 */

//key-value
    public void obiecteMap (){
        Map<String, String> obiecte = new HashMap<>();
        obiecte.put("fruct", "mar");
        obiecte.put("leguma", "telina");
        obiecte.put("lemn", "abanos");
        obiecte.put("suc", "cola");
        obiecte.put("muzica", "metal");

        for (String key: obiecte.keySet()){
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este: " + obiecte.get(key)); //obs: le afiseaza in ordine aleatorie, nu in ordinea in care sunt scrise in cod
        }
    }

// afisam cateva tari cu cate mai multe orase aferente
    public void tariOrase (){
        Map<String, List<String>> tari = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj");
        oraseRomania.add("Oradea");
        oraseRomania.add("Sibiu");
        oraseRomania.add("Iasi");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Firenze");
        oraseItalia.add("Venetia");
        oraseItalia.add("Palermo");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");
        oraseSpania.add("Valencia");

        tari.put("Romania", oraseRomania);
        tari.put("Italia", oraseItalia);
        tari.put("Spania", oraseSpania);

        for (String key: tari.keySet()){
            System.out.println("Tara este: " + key);
            System.out.println("Orasul este: " + tari.get(key));
        }

    }

}
