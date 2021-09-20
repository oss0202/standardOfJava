package tutorial;

public class MountainBike extends Bicycle{

    // the tutorial.MountainBike subclass adds one field
    public int seatHeight;

    // the tutorial.MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the tutorial.MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
