/**
 * @author Пинжин Евгений Иванович
 * @version 1.1
 * @apiNote клиентский класс
 * @apiNote программа расчета допустимой скорости транспорта
 * @apiNote задание по OCP
 */
public class OCP {

    public static void main(String[] args) {
        Vehicle car1 = new Car(275, "Ferrari");
        Vehicle bus1 = new Bus(120, "PaziK");

        SpeedCalculation speed = new SpeedCalculation();

        System.out.println("Транспорт: " + car1.getType() + "\n"
                        + "Допустимая скорость: " + speed.calculateAllowedSpeed(car1) + "\n");
        System.out.println("Транспорт: " + bus1.getType() + "\n"
                        + "Допустимая скорость: " + speed.calculateAllowedSpeed(bus1) + "\n");
    }
}