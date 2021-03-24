public class SalariedEmployee extends Employee {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary / 12;
    }

    public SalariedEmployee(String name, double salary){
        this.setName(name);
        this.date = new HireDate();
        this.salary = salary;

    }
}
