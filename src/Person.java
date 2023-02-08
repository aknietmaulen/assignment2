public abstract class Person implements Payable, Comparable<Person> {

    private int id;
    private static int id_gen = 1;
    public String name;
    public String surname;
    public String position;

    public Person(){
        id = id_gen++;
    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPosition() {
        return position;
    }
    public String toString(){
        return id + ". " + name + " " + surname;
    }
    @Override
    public double getPaymentAmount() {
        return 0;
    }
    @Override
    public double compareTo(Person person1){
        if (this.getPaymentAmount() == person1.getPaymentAmount()){
            return 0;
        }
        else if (this.getPaymentAmount() < person1.getPaymentAmount()){
            return -1;
        }
        else{
            return 1;
        }
    }

}
