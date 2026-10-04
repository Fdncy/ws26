package se1.uebung1.control;

public class GermanTranslator implements Translator {

    public String date = null;

    /**
     * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
     */
    public String translateNumber(int number) {
        // [ihr Source Code aus Übung 1-2]
        if (number < 1 || number > 100){
            return "Übersetzung der Zahl " + number + " nicht möglich (" + version + ")";
        }

        String[] ones = {"","eins","zwei","drei","vier","fünf","sechs","sieben","acht","neun","zehn","elf",
                        "zwölf","dreizehn","vierzehn","fünfzehn","sechzehn","siebzehn","achtzehn","neunzehn"};
        String[] tens = {"","","zwanzig","dreißig","vierzig","fünfzig","sechzig","siebzig","achtzig","neunzig","einhundert"};

        if (number < 20){
            return ones[number];
        }

        int O = number % 10;
        int T = number / 10;

        if (O == 0){
            return tens[T];
        }

        return ones[O] + "und" + tens[T];
    }

    /**
     * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
     */
    void printInfo(){
        System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
    }

    /**
     * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: dd.MM.yyyy (Beispiel: "20.08.2026"))
     * Das Datum sollte system-intern durch eine Factory-Klasse gesetzt werden und nicht von externen View-Klassen
     * Technisch sollte einfach das "heutige" Datum gesetzt werden.
     */
    public void setDate( String date ) {
        this.date = date;
    }

    /**
     * Auslesen des gesetzten Datums
     * @return
     */
    public String getDate() {
        return date;
    }
}
