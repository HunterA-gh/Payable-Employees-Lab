public class Entrepreneur extends Person {
    private double bigBoyPay = 1_000_000;

    public String paidAmount(){
        return String.format("%s" + "%.2f", "$", this.calculatePay());
    }

    @Override
    public double calculatePay() {
        return bigBoyPay / 12;
    }

    public double getBigBoyPay() {
        return bigBoyPay;
    }

    public Entrepreneur(String name){
        this.setName(name);
    }
}
