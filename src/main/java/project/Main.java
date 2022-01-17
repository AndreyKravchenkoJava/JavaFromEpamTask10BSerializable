package project;

public class Main {

    public static void main(String[] args) {
        Connector connector = new Connector();
        connector.writeObject();
        connector.considerObject();
        connector.consoleUi.run();
    }
}
