public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private double hoursWorked;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked * 4;
    }

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked){
        this.setName(name);
        this.date = new HireDate();
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }
}
