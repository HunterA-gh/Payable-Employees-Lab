public abstract class Person implements IPayable{
    private String name;

    @Override
    public abstract String paidAmount();

    public abstract double calculatePay();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
