package tutorial;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in tutorial.Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in tutorial.Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        myCat.testInstanceMethod();
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}