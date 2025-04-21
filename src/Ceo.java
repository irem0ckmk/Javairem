public class Ceo extends Employee{
    private String leader;


    public Ceo(String name, int salary,String leader) {
        super(name, salary);
        //this.leader;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }
    @Override
    public String getDetails() {
        return "Ceo " + getName() + " earns " + getSalary() + " Hak,hukuk " + leader;
    }
}
