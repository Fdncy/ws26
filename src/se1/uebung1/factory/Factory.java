package se1.uebung1.factory;

import se1.uebung1.control.GermanTranslator;

import java.time.LocalDate;

public class Factory {

    public static GermanTranslator createGermanTranslator(){

        GermanTranslator translator = new GermanTranslator();
        translator.setDate(String.valueOf(LocalDate.now()));

        return translator;
    }


}
