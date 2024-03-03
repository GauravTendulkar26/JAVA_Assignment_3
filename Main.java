import java.util.Scanner;

abstract class Staff {
    String name;
    String address;

    public Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract void display();
}

class FullTimeStaff extends Staff {
    String department;
    double salary;

    public FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    @Override
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class PartTimeStaff extends Staff {
    int hoursWorked;
    double ratePerHour;

    public PartTimeStaff(String name, String address, int hoursWorked, double ratePerHour) {
        super(name, address);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Rate Per Hour: " + ratePerHour);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of staff members:");
        int n = scanner.nextInt();

        Staff[] staffArray = new Staff[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter type of staff (1 for Full Time, 2 for Part Time):");
            int type = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.println("Enter name:");
            String name = scanner.nextLine();

            System.out.println("Enter address:");
            String address = scanner.nextLine();

            if (type == 1) {
                System.out.println("Enter department:");
                String department = scanner.nextLine();

                System.out.println("Enter salary:");
                double salary = scanner.nextDouble();

                staffArray[i] = new FullTimeStaff(name, address, department, salary);
            } else if (type == 2) {
                System.out.println("Enter hours worked:");
                int hoursWorked = scanner.nextInt();

                System.out.println("Enter rate per hour:");
                double ratePerHour = scanner.nextDouble();

                staffArray[i] = new PartTimeStaff(name, address, hoursWorked, ratePerHour);
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                i--; // To repeat the current iteration
            }
        }

        // Display staff information
        for (Staff staff : staffArray) {
            System.out.println("\nStaff Information:");
            staff.display();
        }

        scanner.close();
    }
}
