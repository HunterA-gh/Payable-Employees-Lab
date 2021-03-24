public abstract class Person implements IPayable{
    private String name;

    public String paidAmount(){
        return String.format("%s" + "%.2f", "$", this.calculatePay());
    }

    public abstract double calculatePay();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
