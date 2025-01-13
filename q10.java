import java.util.Scanner;

class Employee {
    public void checkSalary(float salary) {

        float bonus = salary * 0.2f;
        float travelaalowance = salary * 1.5f;
        float annualSalary = (salary * 12) + bonus + travelaalowance - 0.10f;

        System.out.println("Total annual salary is: " + annualSalary);
    }
}

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the monthly salary:");
        float salary = sc.nextFloat();

        Employee e = new Employee();
        e.checkSalary(salary);

    }
}
