package se1.ueung2.test;

import org.junit.jupiter.api.Test;
import se1.uebung2.ConreteMember;
import se1.uebung2.Container;
import se1.uebung2.ContainerException;
import se1.uebung2.Member;
import static org.junit.jupiter.api.Assertions.*;

public class ContainerTest {

    @Test
    public void testContainer() throws ContainerException {

        Container container = new Container();

        Member member1 = new ConreteMember(1);
        Member member2 = new ConreteMember(2);

        // leerer Container
        assertEquals(0, container.size());

        // ersten Member hinzufügen
        container.addMember(member1);
        assertEquals(1, container.size());

        // zweiten Member hinzufügen
        container.addMember(member2);
        assertEquals(2, container.size());

        // ersten Member löschen
        container.deleteMember(1);
        assertEquals(1, container.size());

        // zweiten Member löschen
        container.deleteMember(2);
        assertEquals(0, container.size());

        // ersten Member wieder hinzufügen
        container.addMember(member1);
        assertEquals(1, container.size());

        // zweiten Member wieder hinzufügen
        container.addMember(member2);
        assertEquals(2, container.size());

        // vesuchen doppelte ID hinzuzufügen
        assertThrows(ContainerException.class, () -> container.addMember(new  ConreteMember(1)));
        assertEquals(2, container.size());

        // nicht existierenden Member löschen
        String res = container.deleteMember(-99);
        assertTrue(res.contains("-99"));
        assertEquals(2, container.size());

        // zweiten Member löschen
        container.deleteMember(2);
        assertEquals(1, container.size());
    }
}
