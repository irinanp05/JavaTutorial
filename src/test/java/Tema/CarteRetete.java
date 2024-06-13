package Tema;

import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarteRetete {

    @Test
    public void testMethod (){
        carteRetete();
    }


public void carteRetete(){
        Map<String, List<String>> retete = new HashMap<>();

        List<String> risotto = new ArrayList<>();
        risotto.add("orez tip arborio - 400g");
        risotto.add("prosciutto di Parma - 3 felii");
        risotto.add("parmiggiano ras - 100g");
        risotto.add("apa - 1.5L");
        risotto.add("concentrat de supa - 1.5 cub");
        risotto.add("ceapa - 1");
        risotto.add("smantana de gatit - 2 linguri");
        risotto.add("unt");
        risotto.add("sare, piper");

        List<String> marcoPolo = new ArrayList<>();
        marcoPolo.add("batoane de crab - 15");
        marcoPolo.add("creveti decorticati - 200g");
        marcoPolo.add("ardei verde - 1/2");
        marcoPolo.add("maioneza - 3 linguri");
        marcoPolo.add("marar - cateva fire");
        marcoPolo.add("tagliatelle - 150g");
        marcoPolo.add("branza Gruyere - 150g");
        marcoPolo.add("sare, piper");

        List<String> saltimbocca = new ArrayList<>();
        saltimbocca.add("peste spada - 4 felii");
        saltimbocca.add("mozzarella - 150g");
        saltimbocca.add("jambon crud - 8 felii");
        saltimbocca.add("parmiggiano ras - 30g");
        saltimbocca.add("tarhon - cateva frunze");
        saltimbocca.add("patrunjel italian - 10 fire");
        saltimbocca.add("vin alb sec - 100mL");
        saltimbocca.add("usturoi - 1 catel");
        saltimbocca.add("faina - 2 linguri");
        saltimbocca.add("unt - 50g");
        saltimbocca.add("sare, piper alb");

        retete.put("Risotto cu parmiggiano si jambon", risotto);
        retete.put("Salata Marco Polo", marcoPolo);
        retete.put("Saltimbocca cu peste spada", saltimbocca);

        for (String key: retete.keySet()){
            System.out.println(key);
            System.out.println(retete.get(key));
        }


    }

}
