import java.util.Scanner;

class Employee {
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void checkSalary() {
        float bonus = salary * 0.2f;
        float travelAllowance = salary * 1.5f;
        float annualSalary = (salary * 12) + bonus + travelAllowance - 0.10f;

        System.out.println("Total annual salary is: " + annualSalary);
    }
}

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the monthly salary:");
        float salaryInput = sc.nextFloat();

        Employee e = new Employee();
        e.setSalary(salaryInput);

        e.checkSalary();
    }
}

