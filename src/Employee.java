public class Employee extends Person {
    private String position;
    private double salary;
    public Employee(){
        super();
    }
    public Employee (String name, String surname, String position, double salary ){
        this();
        setPosition(position);
        setSalary(salary);
    }
    public void setPosition(String position){
        this.position = position;
    }
    @Override
    public String getPosition(){
        return position;
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    @Override
    public double getPaymentAmount(){
        return salary;
    }

    @Override
    public String toString(){
        return "Employee: " + getId() + ". " + getName() + " " + getSurname();
    }

}
