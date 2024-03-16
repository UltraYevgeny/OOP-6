public class Car extends Vehicle {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double getMaxSpeed() {
        return super.getMaxSpeed()*0.8;
    }
    
}