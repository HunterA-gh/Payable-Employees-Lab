import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HumanResources {

    public void issueBadge(ArrayList<Employee> employees){
        for(int i = 0; i < employees.size(); i++){
            employees.get(i).printBadge();
        }
    }

    public void printPaymentInfo(Person p) {
        System.out.println(p.getName() + " gets paid " + String.format(p.paidAmount()));
    }

    public void payPerson(ArrayList<Person> people){
        for(Person p : people){
            System.out.println(p.getClass().getSimpleName() + " should be paid : " + p.paidAmount());
        }
    }

    public void sortPeopleByIncome(ArrayList<Person> people){
        people.sort(Comparator.comparing(Person::calculatePay));
        for(Person p : people){
            System.out.println(p.getClass().getSimpleName() + " should be paid : " + p.paidAmount());
        }
    }
}
