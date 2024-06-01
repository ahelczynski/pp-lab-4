import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Alice Johnson", 50000, 0);
        employees[1] = new Worker("Bob Smith", 55000, "Engineer");
        employees[2] = new Employee("Charlie Brown", 60000);
        employees[3] = new Employee("Diana Prince", 65000);
        employees[4] = new Worker("Edward King", 70000, "Technician");

        System.out.println("Pracownik o indeksie 3: " + employees[3]);

        employees[3].setSalary(75000);

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        if (employees[0] instanceof Manager) {
            Manager manager = (Manager) employees[0];
            manager.setNumberOfSubordinates(nonManagerCount);
            manager.setSalary(7500);
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}