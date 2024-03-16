/**
 * @apiNote класс domain
 * @apiNote оснавной (родительский) класс для всех транспортов
 */
public class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }
}