package se1.uebung1.view;

import se1.uebung1.control.Translator;
import se1.uebung1.factory.Factory;

public class Client {
    /**
     * Methode zur Ausgabe einer Zahl auf der Console
     * (auch bezeichnet als CLI, Terminal)
     * Verwendung des Design Pattern: TODO (GoF, Kapitel 6)
     * Problem: TODO
     * Lösung: TODO
     *
     */
    void display( int aNumber ){
        // In dieser Methode soll die Methode translateNumber
        // mit dem übergegebenen Wert der Variable aNumber
        // aufgerufen werden.
        //
        // Strenge Implementierung (nur) gegen das Interface Translator gewuenscht!

        Translator translator = Factory.createGermanTranslator();
        String res = translator.translateNumber(aNumber);

        System.out.println("Das Ergebnis der Berechnung: " +
                res );

    }
}
