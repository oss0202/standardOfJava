package anonymous;

public class HelloWorldAnonymousClasses {

    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");// 1- 1
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);// 1 - 2
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);// 2
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo"); // 3 - 1
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name); // 3- 2
            }
        };
        englishGreeting.greet();// 1
        frenchGreeting.greetSomeone("Fred");// 2
        spanishGreeting.greet();// 3
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp =
                new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }
}