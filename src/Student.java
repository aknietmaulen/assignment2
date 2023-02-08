public class Student extends Person{
    private double gpa;
    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa) {
        this();
        setGpa(gpa);
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    @Override
    public String getPosition(){
        return "Student";
    }

    @Override
    public double getPaymentAmount(){
        if(getGpa() >= 2.67){
            return 36660.00;}
        else{
            return 0.00;}
    }
    @Override
    public String toString(){
        return "Student: " + getId() + ". " + getName() + " " + getSurname();
    }

}
