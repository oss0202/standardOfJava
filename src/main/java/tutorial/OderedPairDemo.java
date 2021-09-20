package tutorial;

public class OderedPairDemo {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");

        OrderedPair<String, Integer> p3 = new OrderedPair<>("Even", 8);
        OrderedPair<String, String>  p4 = new OrderedPair<>("hello", "world");

        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>());

    }
}
