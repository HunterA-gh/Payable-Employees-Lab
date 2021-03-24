public class Entrepreneur extends Person {
    private double bigBoyPay = 1_000_000;

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
