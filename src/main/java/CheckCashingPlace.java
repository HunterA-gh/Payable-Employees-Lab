import java.util.ArrayList;

public class CheckCashingPlace {

    public static void main(String[] args) {
        Person e1 = new Entrepreneur("Big boy Bobby");
        Employee se1 = new SalariedEmployee("John",  75000);
        Employee he1 = new HourlyEmployee("Richard",  13, 40);

        HumanResources hr1 = new HumanResources();

        ArrayList<Person> payablePeople = new ArrayList<>();
        payablePeople.add(e1);
        payablePeople.add(se1);
        payablePeople.add(he1);

        ArrayList<Employee> payableEmployees = new ArrayList<>();
        payableEmployees.add(se1);
        payableEmployees.add(he1);

        hr1.issueBadge(payableEmployees);
        System.out.println();

        System.out.println("Prior to sorting by pay...");
        hr1.payPerson(payablePeople);
        System.out.println();

        ArrayList<Person> unSortedPeople = new ArrayList<>();
        unSortedPeople.add(e1);
        unSortedPeople.add(se1);
        unSortedPeople.add(he1);

        System.out.println("After sorting by pay...");
        hr1.sortPeopleByIncome(unSortedPeople);

        System.out.println("\nEZ PZ Lab");


    }
}
