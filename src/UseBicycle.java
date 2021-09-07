public class UseBicycle {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle(1,1,1);
        System.out.println("numberOfBicycles : " + Bicycle.getNumberOfBicycles());
        Bicycle bicycle2 = new Bicycle(2,2,2);
        System.out.println("numberOfBicycles : " + Bicycle.getNumberOfBicycles());
        Bicycle bicycle3 = new Bicycle(3,3,3);
        System.out.println("numberOfBicycles : " + Bicycle.getNumberOfBicycles());
    }
}
