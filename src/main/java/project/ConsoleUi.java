package project;

import java.util.Scanner;

public class ConsoleUi {
    private PuppyObjectRepository puppyObjectRepository;
    private Puppy puppy;
    private Scanner scanner;

    public ConsoleUi(PuppyObjectRepository puppyObjectRepository, Puppy puppy) {
        this.puppy = puppy;
        this.puppyObjectRepository = puppyObjectRepository;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            init();
        }
    }
                                                                                    
    private void init() {
        helloMessage();
        String choice = getChoiceOneChar();
        switch (choice) {
            case "o": {
                getObject();
                break;
            }
            case "n": {
                runMethodGetNamePuppy();
                break;
            }
            case "c": {
                runMethodGetCasteVote();
                break;
            }
            case "j": {
                runMethodGetJump();
                break;
            }
            case "r": {
                runMethodGetRun();
                break;
            }
            case "b": {
                runMethodGetBite();
                break;
            }
            case "x": {
                System.out.println("Thanks for using this program. Goodbye");
                System.exit(0);
            }
            default: {
                System.out.println("Your input wrong choice!");
            }
        }
    }

    private void getObject() {
        System.out.println(puppy.toString());
    }

    private void runMethodGetNamePuppy() {
        String name = puppy.getName();
        System.out.println("Name puppy = " + name);
    }
    private void runMethodGetCasteVote() {
        String casteVote = puppy.getCasteVote();
        System.out.println("Caste vote puppy = " + casteVote);
    }
    private void runMethodGetJump() {
        String jump = puppy.getJump();
        System.out.println("Puppy jump = " + jump);
    }
    private void runMethodGetRun() {
        String run = puppy.getRun();
        System.out.println("Puppy run = " + run);
    }
    private void runMethodGetBite() {
        String bite = puppy.getBite();
        System.out.println("Puppy bite = " + bite);
    }
    private String getChoiceOneChar() {
        return String.valueOf(scanner.next().trim().charAt(0));
    }

    private void helloMessage() {
        System.out.println("-------------------------------------------");
        System.out.println("0 - get object");
        System.out.println("n - Puppy name");
        System.out.println("c - caste vote Puppy");
        System.out.println("j - jump Puppy");
        System.out.println("r - run Puppy");
        System.out.println("b - bite Puppy");
        System.out.println("x - exit");
    }
}
