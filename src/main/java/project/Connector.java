package project;

import java.io.*;

public class Connector {
    Puppy puppy = new Puppy("Jack", "Gav on the dog", "Jump to the bed", "Run to the cat", "Bite toy");
    PuppyObjectRepository puppyObjectRepository = new PuppyObjectRepository(puppy.getPuppies());
    ConsoleUi consoleUi = new ConsoleUi(puppyObjectRepository, puppy);

    public Connector() {
        writeObject();
        considerObject();
        consoleUi.run();
    }
    

    public void writeObject() {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Puppy.txt"))) {
            output.writeObject(puppy);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void considerObject() {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("Puppy.txt"))) {
            Puppy puppy = (Puppy)input.readObject();
            System.out.println(puppy);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
