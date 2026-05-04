package nl.novi.jp.methods.senior;

import java.util.ArrayList;
import java.util.List;


/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class SeniorOne {

    public static String capitalize( List<String> customerNames) {

        String name1 = "";

        for( String name : customerNames){

      if(name != null && !name.isEmpty()){
          String newName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

           if(name.contains("-")) {
               // moet de volgende index hoofdletter zijn
             int indexDash =   name.indexOf("-");
              char text =  name.charAt(indexDash + 1);
              String textStr = Character.toString(text).toUpperCase();
              newName = name.substring(0,1).toUpperCase() +name.substring(1,6).toLowerCase() + textStr + name.substring(7).toLowerCase();
           }
          System.out.println(newName);
      }else {
          System.out.println("Name should not be empthy");
          }
      }

        return  name1;
    }

    public static void main(String[] args) {

        // String array lijst
        List<String> curstomerNames = new ArrayList<>();


        // Data in de String lijst
        curstomerNames.add("nick piraat");
        curstomerNames.add("michael jackson");
        curstomerNames.add("glennis grace");
        curstomerNames.add("dreetje hazes");
        curstomerNames.add("robbie williams");
        curstomerNames.add("michiel de ruyter");
        curstomerNames.add("sjaak polak");
        curstomerNames.add("jan van jansen");
        curstomerNames.add("henk den hartog");
        curstomerNames.add("mo el-mecky");
        curstomerNames.add("fredje kadetje");

        capitalize(curstomerNames);
    }
}


