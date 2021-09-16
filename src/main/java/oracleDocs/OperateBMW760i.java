package oracleDocs;

public class OperateBMW760i implements OperateCar{

    @Override
    public int turn(Point direction, double radius, double startSpeed, double endSpeed) {
        return 0;
    }

    @Override
    public int changeLanes(Point direction, double startSpeed, double endSpeed) {
        return 0;
    }

    @Override
    public int signalTurn(Point direction, boolean signalOn) {
        return 0;
    }

    @Override
    public int getRadarFront(double distanceToCar, double speedOfCar) {
        return 0;
    }

    @Override
    public int getRadarRear(double distanceToCar, double speedOfCar) {
        return 0;
    }
}
