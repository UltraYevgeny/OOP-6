public class Bus extends Vehicle{

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double getMaxSpeed() {
        return super.getMaxSpeed()*0.6;
    }
    
}
