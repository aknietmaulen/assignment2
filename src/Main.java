import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Lennon","Assistant",27045.78);
        Employee employee2 = new Employee("George", "Harrison","Boss",50000.00);
        Student student1 = new Student("Ringo","Starr",2.3);
        Student student2 = new Student("Paul","McCartney",3.7);


        ArrayList<Person> people = new ArrayList<Person>();

        people.add(employee1);
        people.add(employee2);
        people.add(student1);
        people.add(student2);

        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                if (p1.getPaymentAmount() == p2.getPaymentAmount()) {
                    return 0;
                } else if (p1.getPaymentAmount() < p2.getPaymentAmount()) {
                    return -1;
                } else{
                    return 1;
                }
            }
        });

        printData(people);

    }

    public static void printData(ArrayList<Person> p){
        for (Person i : p) {
            System.out.println(i.toString() + " earns " + i.getPaymentAmount() + " tenge");
        }
        System.out.println();
        for (Person i : p) {
            System.out.println("Position of " + i.getName() + " is " + i.getPosition());
        }
    }
}