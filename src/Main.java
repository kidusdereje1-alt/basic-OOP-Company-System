class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("------------------------");
    }
    void increaseSalary(double amount) {
        salary += amount;
    }
}
class CompanySystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John", 5000);
        Employee emp2 = new Employee(102, "Sara", 6000);
        System.out.println("Before Salary Increase:");
        emp1.displayInfo();
        emp2.displayInfo();
        emp1.increaseSalary(500);
        emp2.increaseSalary(800);
        System.out.println("After Salary Increase:");
        emp1.displayInfo();
        emp2.displayInfo();
    }
}