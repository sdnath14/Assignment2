class Employee {
    private String name;
    private String desig;
    private String email;
    private double salary;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDesig() {
        return desig;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

public class q1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Ankan");
        e.setEmail("Ankan1232@gmail.com");
        e.setDesig("Computer Teacher");
        e.setSalary(5000);
        System.out.println("Employee" + e.getName() + "is a" + e.getDesig() + "email:" + e.getEmail()
                + "his Annual salary is:" + e.getSalary());

    }

}
