/**
 * @author Пинжин Евгений Иванович
 * @version 1.1
 * @apiNote Программа расчета параметров различных фигур.
 * @apiNote задание по ISP
 */
public class ISP {

    public static void main(String[] args) {
        Circle circle = new Circle(34);
        Cube cube = new Cube(21);
        System.out.println("Area: " + circle.area());
        System.out.println("Area: " + cube.area() 
                            + " / Volume: " + cube.volume());
    }
}