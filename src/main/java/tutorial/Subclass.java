package tutorial;

public class Subclass extends Superclass{
    // overrides printMethod in tutorial.Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in tutorial.Subclass");
    }
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();
    }
}
