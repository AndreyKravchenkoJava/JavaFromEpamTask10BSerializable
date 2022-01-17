package project;

import java.io.Serializable;
import java.util.Objects;

public class Dog extends Animal implements Serializable {
    private String casteVote;
    private String jump;
    private String run;
    private String bite;

    public Dog(String name, String casteVote, String jump, String run, String bite) {
        super(name);
        this.casteVote = casteVote;
        this.jump = jump;
        this.run = run;
        this.bite = bite;
    }

    public String getCasteVote() {
        return casteVote;
    }
    public String getJump() {
        return jump;
    }
    public String getRun() {
        return run;
    }
    public String getBite() {
        return bite;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(casteVote, dog.casteVote) && Objects.equals(jump, dog.casteVote) && Objects.equals(run, dog.run) && Objects.equals(bite, dog.run);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), casteVote, jump, run, bite);
    }

    public String toString() {
        return super.toString() + "Dog: casteVote= " + casteVote + ", jump= " + jump + ", run= " + run + ", bite= " + bite;
    }
}
