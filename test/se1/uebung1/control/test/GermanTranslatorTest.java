package se1.uebung1.control.test;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se1.uebung1.control.GermanTranslator;
import se1.uebung1.control.Translator;
import se1.uebung1.factory.Factory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    private GermanTranslator translator;

    @BeforeEach
    void setUp() {
        translator = Factory.createGermanTranslator();
    }

    @Test
    void testPositiveSmall() {
        assertEquals("drei", translator.translateNumber(3));
    }

    @Test
    void testPositiveBig() {
        assertEquals("siebenundsiebzig", translator.translateNumber(77));
    }

    @Test
    void testNegative() {
        assertEquals("Übersetzung der Zahl -5 nicht möglich (" + Translator.version + ")", translator.translateNumber(-5));
    }

    @Test
    void testZero() {
        assertEquals("Übersetzung der Zahl 0 nicht möglich (" + Translator.version + ")", translator.translateNumber(0));
    }

    @Test
    void testTooBig() {
        assertEquals("Übersetzung der Zahl 110 nicht möglich (" + Translator.version + ")", translator.translateNumber(110));
    }

    @Test
    void testPositiveSmall2() {
        assertEquals("acht", translator.translateNumber(8));
    }

    @Test
    void testPositiveBig2() {
        assertEquals("neunundfünfzig", translator.translateNumber(59));
    }

    @Test
    void testNegative2() {
        assertEquals("Übersetzung der Zahl -45 nicht möglich (" + Translator.version + ")", translator.translateNumber(-45));
    }

    @Test
    void testZero2() {
        assertEquals("Übersetzung der Zahl 0 nicht möglich (" + Translator.version + ")", translator.translateNumber(-0));
    }

    @Test
    void testTooBig2() {
        assertEquals("Übersetzung der Zahl 287 nicht möglich (" + Translator.version + ")", translator.translateNumber(287));
    }

    @Test
    void Date() {
        assertEquals(String.valueOf(LocalDate.now()), translator.getDate());
    }
}