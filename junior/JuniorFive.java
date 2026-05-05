package nl.novi.jp.methods.junior;

/**
 * Deze klasse is helemaal leeg, je mag nu dus alles zelf doen.
 * Maak een methode die een String ontvangt en deze in HOOFDLETTERS uitprint.
 * Bedenk zelf een goede Engelse naam voor de methode.
 *
 * Hoe maak je hoofdletters van een String in Java?
 * https://duckduckgo.com/?q=java+to+uppercase
 */

public class JuniorFive {

    public static  void strToUpper(String str){
        System.out.println(str.toUpperCase());
    }

    public static void capitalizeWord(String word) {
        // We gebruiken hier de "toUpperCase" methode van String om het woord uit de parameter in hoofdletters te zetten
        // vervolgens printen we het resultaat naar de console.
        String result = word.toUpperCase();
        System.out.println(result);
    }

    public static void main(String[] args) {
        strToUpper("jhudeska");


        capitalizeWord("sjaak");
        capitalizeWord("patat");
        capitalizeWord("ajax");
        capitalizeWord("kampioen");
    }


}
