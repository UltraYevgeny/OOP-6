
/**
 * @author Пинжин Евгений Иванович
 * @version 1.1
 * @apiNote клиентский класс.
 * @apiNote задание по SRP.
 */
public class SRP {

   public static void main(String[] args) throws InterruptedException {

      // Date date = java.sql.Date.valueOf("2000-03-18"); 
      // 1212121212121L - количество миллисекунд, которое прошло с 00:00 1 января 1970 года до требуемой даты
      //Date date = new Date(1212121212121L); 
      
      CalculateNet employee = new CalculateNet("Donald", 
                                                java.sql.Date.valueOf("2000-03-18"),
                                                57000);

      System.out.println("Info: " + employee.getEmpInfo());
      System.out.println("Base Salary - Tax: " + employee.calculateNetSalary());
   } 
}