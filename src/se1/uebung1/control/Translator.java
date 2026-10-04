package se1.uebung1.control;

public interface Translator {
    double version = 1.0; // Version des Interface

    /**
     * Uebersetzt eine numerische Zahl in eine String-basierte
     * Repraesentation gemaess der Spezifikation in der Aufgabe 1-2
     */
    String translateNumber(int number);
}
