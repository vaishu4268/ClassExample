package InheritanceTopic;

// Inheritance represents the relationship which is also known as a parent-child relationship.

public class MountainBike extends Bicycle{
    int seatHeight;
    public MountainBike(int gear, int speed, int startHeight) {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }

    public void printM()
    {
        System.out.println("Motor Bike");
    }
}
