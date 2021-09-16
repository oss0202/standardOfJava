package oracleDocs;

public interface OperateCar {
    // constant declarations, if any

    // method signatures

    // An enum with values RIGHT, LEFT
    int turn(Point direction,
             double radius,
             double startSpeed,
             double endSpeed);
    int changeLanes(Point direction,
                    double startSpeed,
                    double endSpeed);
    int signalTurn(Point direction,
                   boolean signalOn);
    int getRadarFront(double distanceToCar,
                      double speedOfCar);
    int getRadarRear(double distanceToCar,
                     double speedOfCar);
         //......
    // more method signatures

    default void defaultMethod(){
        System.out.println("defaultMethodcall");
    }
}
