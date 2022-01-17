package project;

import java.util.ArrayList;

public class PuppyObjectRepository {
    private ArrayList<Puppy> puppies;

    public PuppyObjectRepository(ArrayList<Puppy> puppies) {
        this.puppies = puppies;
    }

    public Puppy getPuppy() {
        for (int i = 0; i < puppies.size(); i++) {
            if (puppies.get(i).getClass().equals(Puppy.class)) {
                return (Puppy) puppies.get(i);
            }
        }
        return null;
    }
}
