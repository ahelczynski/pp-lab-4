public class Company {
    public static void main(String[] args) {
      
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Alice Johnson", 50000);
        employees[1] = new Employee("Bob Smith", 55000);
        employees[2] = new Employee("Charlie Brown", 60000);
        employees[3] = new Employee("Diana Prince", 65000);
        employees[4] = new Employee("Edward King", 70000);

        System.out.println("Pracownik o indeksie 3: " + employees[3]);

        employees[3].setSalary(75000);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
