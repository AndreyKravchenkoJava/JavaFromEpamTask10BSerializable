package project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Puppy extends Dog implements Serializable {

    private ArrayList<Puppy> puppies;

    public Puppy(String name, String casteVote, String jump, String run, String bite) {
        super(name, casteVote, jump, run, bite);
    }

    public ArrayList<Puppy> getPuppies() {
        return puppies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Puppy puppy = (Puppy) o;
        return Objects.equals(puppy, puppy.puppies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), puppies);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
