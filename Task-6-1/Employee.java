import java.util.Date;

/**
 * @apiNote Domain Class
 * @apiNote класс с данными рабочего
 */
public class Employee {
    private String name;
    private Date dob; //date of birth

    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
