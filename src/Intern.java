public class Intern extends Employee{
    private String school;
    public Intern(String name, int salary,String school){
        super(name,salary);
        this.school = school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public void promote(int amount){
        this.setSalary(this.getSalary() + amount);
    }

    @Override
    public String getDetails() {
        return "Intern " + getName() + " earns " + getSalary() + ", studies at " + school;
    }

}
