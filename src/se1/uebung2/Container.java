package se1.uebung2;

import java.util.ArrayList;
import java.util.List;

public class Container {

    private List<Member> members = new  ArrayList<>();

    public void addMember(Member member) throws ContainerException {

        for  (Member m : members) {
            if (m.getID() == member.getID()) {
                throw new ContainerException("Das Member-Objekt mit der ID " + member.getID() + " ist bereits vorhanden!");
            }
        }

        members.add(member);

    }

    public String deleteMember(Integer ID){

        for  (Member m : members) {
            if (m.getID() == ID) {
                members.remove(m);
                return "Member wurde erfolgreich gelöscht.";
            }
        }

        return "Kein Member mit der ID " + ID + " vorhanden!";

    }
    /*
    Im Gegensatz zu einer Exception kann die Fehlermeldung leicht übersehen werden.
    Rückgabewerte wie String sind auch nicht typsicher und vermischen die Fehlermeldung mit normalen Ergebnissen.
    Mit Exceptions wird der Fehler außerdem expliziter.
     */

    public void dump(){
        for  (Member m : members) {
            System.out.println(m.toString());
        }
    }

    public int size(){
        return members.size();
    }


}
