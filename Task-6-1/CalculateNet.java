import java.util.Date;

/**
 * @apiNote Service Class
 * @apiNote содержит метод расчета зарплаты с учетом налога
 */
public class CalculateNet extends Employee{
    private int baseSalary;

    public CalculateNet(String name, Date dob, int baseSalary) {
        super(name, dob);
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        //int tax = (int) (baseSalary * 0.25);// calculate in otherway
        //return baseSalary - tax;
        return baseSalary - (int) (baseSalary * 0.25);
    }
}
