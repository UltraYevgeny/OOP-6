/**
 * @apiNote класс service
 * @apiNote класс выполняющий запрос навывод допустимой скорости
 * @apiNote любого нужного транспорта
 */
public class SpeedCalculation {

    public double calculateAllowedSpeed(Vehicle vehicle) {

        /*
        if (vehicle.getType().equalsIgnoreCase("Car")) {
            return vehicle.getMaxSpeed() * 0.8;
        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
            return vehicle.getMaxSpeed() * 0.6;
        }
        */
        
        return vehicle.getMaxSpeed();
    }
}