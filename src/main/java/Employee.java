public abstract class Employee extends Person{
    HireDate date;


    public void printBadge(){
        System.out.println("Name: " + this.getName());
        System.out.println("Type of employee: " + this.getClass().getSimpleName());
        System.out.println("HireDate: " + this.date);
        System.out.println();
    }
}
