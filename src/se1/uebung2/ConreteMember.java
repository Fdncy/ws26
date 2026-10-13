package se1.uebung2;

public class ConreteMember implements Member{
    private final Integer ID;

    public ConreteMember (Integer ID){
        this.ID = ID;
    }

    @Override
    public Integer getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Member (ID = " + ID + ")";
    }

}
